import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

enum GioiTinh {
  NAM, NU;
}

public class User {
  public String id;
  public String name;
  public GioiTinh gender;
  public LocalDate birthday;
  public String email;
  public String phoneNumber;
  private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public User(String id, String name, GioiTinh gender, String birthday, String email, String phoneNumber) {

    this.id = id;
    this.name = name;
    this.gender = gender;
    this.birthday = LocalDate.parse(birthday, this.formatter);
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  protected String getID() {
    return id;
  }

  protected void setID(String id) {
    this.id = id;
  }

  protected String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected GioiTinh getGender() {
    return gender;
  }

  protected void setGender(GioiTinh gender) {
    this.gender = gender;
  }

  protected LocalDate getBirthday() {
    return birthday;
  }

  protected void set(LocalDate birthday) {
    this.birthday = birthday;
  }

  protected String getEmail() {
    return email;
  }

  protected void setEmail(String email) {
    this.email = email;
  }

  protected String getPhoneNumber() {
    return phoneNumber;
  }

  protected void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String printInfo() {
    return
        "id='" + id + '\'' +
        ", Name= '" + name + '\'' +
        ", GioiTinh= '" + gender + '\'' +
        ", Birthday= '" + birthday + '\'' +
        ", Email: '" + email + '\'' +
        ", phoneNumber= '" + phoneNumber + ", ";
  }
}



