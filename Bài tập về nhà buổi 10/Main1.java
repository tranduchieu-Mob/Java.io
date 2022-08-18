import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Student student = new Student("1", "Duchieu", 23, "kha");
        Student student2 = new Student("2", "Tung", 20, "trung binh");
        Student student3 = new Student("3", "TuanAnh", 20, "gioi");
        Student student4 = new Student("4", "Vietduong", 25, "kha");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);

        Teacher teacher = new Teacher("Dat");
        Manager manager = new Manager("Huong");

        Lop lop = new Lop("java", students);

        System.out.println("Thong tin Trung Tam: " + teacher.toString() + manager.toString() + lop.toString());
        
        students.add(2,student4);
        System.out.println("Danh sach hoc sinh trong lop: " + lop.toString());

        Student[] Studentlist = {student, student2, student3 , student4};
        List<Student> list = Arrays.asList(Studentlist);
        System.out.println("Nhap Id: ");
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();
        scanner.close();

        for(int index = 0; index < Studentlist.length; index++){
            Student studentt = Studentlist[index];
            if(studentt.hasKeyword(keyword)){
                System.out.printf("Id: " + studentt.id ); 
            }
        }
        for(int index = 0; index < Studentlist.length; index++){
            Student studentt = Studentlist[index];
            if(studentt.hasKeyword(keyword)){
                System.out.println("  Rank: " + studentt.rank );
            }
        }
        students.remove(1);
        System.out.println("Danh sach hoc sinh trong lop hien tai: " + lop.toString());

    }

}
