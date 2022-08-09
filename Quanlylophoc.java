import java.util.*;

public class Quanlylophoc {

  public static void main(String args[]) {

    // tạo 2 Giáo Viên
    Teacher teacher1 = new Teacher("1", "Nguyen Xuan Nam", GioiTinh.NAM, "23/04/1989", "nxnam@gmail.com", "0123456788", 11, "JAVA");
    Teacher teacher2 = new Teacher("2", "Tao Thuy Quynh", GioiTinh.NU, "03/03/1997", "taoquynh@gmail.com", "0123456789", 3, "Font End");

    //tạo 6 Sinh Viên
    Student student1 = new Student("3", "Tran Duc Hieu", GioiTinh.NAM, "27/07/1999", "duchieu270799@gmail.com", "0123456780", true,
        "dang di hoc");
    Student student2 = new Student("4", "Nguyen Thanh Tung", GioiTinh.NAM, "06/04/2002", "ngthanhtung@gmail.com", "0123456781", false,
        "dang di hoc");
    Student student3 = new Student("5", "Nguyen Tuan Anh", GioiTinh.NAM, "03/07/2002", "ngtuananh@gmail.com", "0123456782", false,
        "dang di hoc");
    Student student4 = new Student("6", "Nguyen Kim Cong", GioiTinh.NAM, "05/02/1999", "ngkimcong@gmail.com", "0123456783", true,
        "dang di hoc");
    Student student5 = new Student("7", "Nguyen Trung Ducc", GioiTinh.NAM, "01/08/1995", "ngtrungduc@gmail.com", "0123456784", true,
        "dang di lam");
    Student student6 = new Student("8", "Helen tran", GioiTinh.NU, "21/09/1990", "helen@gmail.com", "0123456785", true,
        "dang di lam");
    
    // tạo mảng lưu các user teacher and student
    User[] users = {teacher1, teacher2, student1, student2, student3, student4, student5, student6};

    System.out.println("Thong tin hoc sinh va giao vien :");
    for (int i = 0; i < users.length; i++) {

      System.out.println(users[i].printInfo());
    }
    System.out.println("-------------------------------------------------------------");

    // chuyển từ mảng => list
    List<User> list = Arrays.asList(users);

    Scanner sc = new Scanner(System.in);

    System.out.println("Nhap keyword : ");
    String keyword = sc.nextLine();

    List<User> search = search(list, keyword);

    for (User user : search) {
      System.out.println(user.printInfo());
    }
    
    System.out.println("-------------------------------------------------------------");
    // sắp xếp tên tăng dần
    Collections.sort(list, Comparator.comparing(User::getName));
    System.out.println("Sap xep theo ten tang dan :");
    for (User user : list) {
      System.out.println(user.printInfo());
    }
    System.out.println("-------------------------------------------------------------");
    // Sắp xếp tuổi giảm dần
    Collections.sort(list, Comparator.comparing(User::getBirthday));
    System.out.println("Sap xep theo tuoi giam dan :");
    for (User user : list) {
      System.out.println(user.printInfo());
    }
  }
  //search keyword theo email và sdt
  private static List<User> search(List<User> list, String keyword) {
    List<User> users = new ArrayList<>();
    for (User user : list) {
      if (user.getEmail().contains(keyword) || user.getPhoneNumber().contains(keyword)) {
        users.add(user);
      }
    }
    return users;
  }
  
}
