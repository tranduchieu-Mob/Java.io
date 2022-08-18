import java.util.ArrayList;

public class Lop {
    private String subjects;
    private ArrayList<Student>students;
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public Lop(String subjects, ArrayList<Student> students) {
        this.subjects = subjects;
        this.students = students;
    }
    @Override
    public String toString() {
        return "Class [students=" + students + ", subjects=" + subjects + "]";
    }
   
}
