public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Manager [name=" + name + "]";
    }

   
}
