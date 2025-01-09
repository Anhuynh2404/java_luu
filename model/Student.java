abstract class Student {
    protected String id;
    protected String name;
    protected String dob;

    public Student(String id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public abstract void displayDetails();
}