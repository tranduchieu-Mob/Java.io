public class Student {
    String id;
    private String name;
    private int age;
    String rank;

    public Student(String id, String name, int age, String rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public boolean hasKeyword(String keyword){
        boolean result = this.id.contains(keyword);
        return result;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", id=" + id + ", name=" + name + ", rank=" + rank + "]";
    }

    
}
