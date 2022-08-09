
public class Student extends User {
    protected boolean isOnline;
    protected String background;
  
    public Student(String id, String name, GioiTinh gender, String birthday, String email, String phoneNumber,
                   boolean isOnline, String background) {
      super(id, name, gender, birthday, email, phoneNumber);
      this.isOnline = isOnline;
      this.background = background;
    }
  
    public boolean isOnline() {
      return isOnline;
    }
  
    public void setOnline(boolean online) {
      isOnline = online;
    }
  
    public String getBackground() {
      return background;
    }
  
    public void setBackground(String background) {
      this.background = background;
    }
  
    @Override
    public String printInfo() {
      return "Student : " +  super.printInfo() + "isOnline='" + isOnline + '\'' +
          ", background= '" + background + "'";
    }
  }