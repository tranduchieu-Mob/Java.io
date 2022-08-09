import java.time.LocalDate;

public class Teacher extends User {

  int yearOfExperiences;
  String speciality;

  public Teacher(String id, String name, GioiTinh gender, String birthday, String email, String phoneNumber,
                 int yearOfExperiences, String speciality) {
    super(id, name, gender, birthday, email, phoneNumber);
    this.yearOfExperiences = yearOfExperiences;
    this.speciality = speciality;
  }

  public int getYearOfExperiences() {
    return yearOfExperiences;
  }

  public void setYearOfExperiences(int yearOfExperiences) {
    this.yearOfExperiences = yearOfExperiences;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  @Override
  public String printInfo() {
    return "Teacher : " + super.printInfo() + "yearOfExperiences='" + yearOfExperiences + '\'' +
        ", speciality= '" + speciality + "'";
  }
}
