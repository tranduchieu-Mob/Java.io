import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static String EMAIL_PATTERN =
            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

    static String PASSWORD_PATTERN =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()-_[{}]:;',?/*~$^+=<>]).{7,15}$";

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("hieu", "Hieu@1234", "hieu@gmail.com"));

        extracted(users);
    }

    private static void extracted(List<User> users) {
        int choose;

        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    dangNhap(users);
                    break;
                case 2:
                    thaoTacDangKy(users);
                    break;
                default:
                    return;
            }
        } while (choose != 2);
    }

    static void thaoTacDangKy(List<User> users) {

        System.out.println("----Dang ky----");
        System.out.println();
        System.out.print("Nhap username: ");
        String username = scan.nextLine();
        System.out.println();
        System.out.print("Nhap email: ");
        String email = scan.nextLine();
        System.out.println();
        System.out.print("Nhap password: ");
        String pass = scan.nextLine();

        boolean check = true;
        for (User user : users) {
            if (username.equals(user.getUserName())) {
                System.out.println("Username da ton tai !!!");
                check = false;
                thaoTacDangKy(users);
                break;
            }

            if (!checkEmail(email, users)) {
                System.out.println("Email da ton tai hoac khong dung dinh dang !!!");
                check = false;
                thaoTacDangKy(users);
                break;
            }

            if (!checkPass(pass)) {
                System.out.println("Mat khau khong dung dinh dang !!!");
                check = false;
                thaoTacDangKy(users);
                break;
            }
        }
        if (check) {
            System.out.println("Dang ky tai khoan thanh cong");
            users.add(new User(username, pass, email));
            dangNhap(users);
        }


    }

    static void showMenu() {
        System.out.println("1 - Dang nhap");
        System.out.println("2 - Dang ky");
    }

    static void dangNhap(List<User> users) {
        System.out.println("----Dang nhap----");

        System.out.print("Nhap user name : ");
        String name = scan.nextLine();
        System.out.println();
        System.out.print("Nhap password : ");
        String pass = scan.nextLine();
        boolean checkExistName = false;
        for (User user : users) {
            if (name.equals(user.getUserName())) {
                checkExistName = true;
                break;
            }
        }
        if (!checkExistName) {
            System.out.println("Kiem tra lai username");
            dangNhap(users);
        }

        boolean checkExistUser = false;
        for (User user : users) {
            if (name.equals(user.getUserName()) && pass.equals(user.getPassword())) {
                checkExistUser = true;
                break;
            }
        }

        if (!checkExistUser) {
            int choose;
            System.out.println("1. Dang nhap lai");
            System.out.println("2. Quen mat khau");
            do {
                choose = Integer.parseInt(scan.nextLine());

                switch (choose) {
                    case 1:
                        dangNhap(users);
                        return;
                    default:
                        quenPass(users, name);
                        return;
                }
            } while (choose != 1);
        }

        dangNhapSuccess(users, name);
    }

    static void quenPass(List<User> users, String name) {

        boolean checkExistUser = false;

        System.out.print("Nhap Email : ");
        String email = scan.nextLine();
        System.out.println();

        for (User user : users) {
            if (email.equals(user.getEmail()) && name.equals(user.getUserName())) {
                checkExistUser = true;
                thaoTacDoiPass(user);
                dangNhapSuccess(users, user.getUserName());
                break;
            }
        }

        if (!checkExistUser) {
            System.out.println("Email khong ton tai");
            dangNhap(users);
        }
    }

    static void thaoTacDoiPass(User user) {
        System.out.print("Nhap mat khau moi: ");
        String pass = scan.nextLine();

        if (!checkPass(pass)) {
            System.out.println("Mat khau khong dung dinh dang");
            thaoTacDoiPass(user);
        }
        user.setPassword(pass);
        System.out.println("Doi mat khau thanh cong");
        return;
    }

    static void thaoTacDoiEmail(User user, List<User> users) {
        System.out.print("Nhap email moi: ");
        String email = scan.nextLine();

        if (!checkEmail(email, users)) {
            System.out.println("Mat khau khong dung dinh dang hoac email da ton tai");
            thaoTacDoiEmail(user, users);
        }
        user.setEmail(email);
        System.out.println("Doi email thanh cong");
        return;
    }

    static String thaoTacDoiUserName(User user, List<User> users) {
        System.out.print("Nhap username moi: ");
        String username = scan.nextLine();

        boolean checkExistUserName = false;
        for (User u : users) {
            if (u.getUserName().equals(username)) {
                System.out.println("Username da ton tai");
                checkExistUserName = true;
                thaoTacDoiUserName(user, users);
                break;
            }
        }
        if (!checkExistUserName) {

            user.setUserName(username);
            System.out.println("Doi username thanh cong");
        }
        return username;
    }


    static void dangNhapSuccess(List<User> users, String name) {

        System.out.println("Chao mung " + name + " co the thuc hien cac cong viec sau: ");
        System.out.println("1 - Thay doi username");
        System.out.println("2 - Thay doi email");
        System.out.println("3 - Thay doi mat khau");
        System.out.println("4 - Dang xuat ");
        System.out.println("0 - Thoat chuong trinh ");

        int choose;
        do {
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    doiUserName(users, name);
                    break;
                case 2:
                    doiEmail(users, name);
                    break;
                case 3:
                    doiPass(users, name);
                    break;
                case 4:
                    extracted(users);
                    break;
                default:
                    System.exit(0);
            }
        } while (choose != 4);
    }

    static void doiPass(List<User> users, String name) {
        for (User user : users) {
            if (name.equals(user.getUserName())) {
                thaoTacDoiPass(user);

                break;
            }
        }
        dangNhapSuccess(users, name);
        return;
    }

    static void doiEmail(List<User> users, String name) {
        for (User user : users) {
            if (name.equals(user.getUserName())) {
                thaoTacDoiEmail(user, users);
                break;
            }
        }
        dangNhapSuccess(users, name);
        return;
    }

    static void doiUserName(List<User> users, String name) {
        String newName = name;
        for (User user : users) {
            if (name.equals(user.getUserName())) {
                newName = thaoTacDoiUserName(user, users);
                break;
            }
        }
        dangNhapSuccess(users, newName);
        return;
    }

    static boolean checkEmail(String email, List<User> users) {
        boolean checkExistEmail = false;
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                checkExistEmail = true;
            }
        }
        return Pattern.matches(EMAIL_PATTERN, email) && !checkExistEmail;
    }

    static boolean checkPass(String pass) {
        return Pattern.matches(PASSWORD_PATTERN, pass);
    }
}
