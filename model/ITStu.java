class ITStu extends Student {
    private double javaScore;

    public ITStu(String id, String name, String dob, double javaScore) {
        super(id, name, dob);
        this.javaScore = javaScore;
    }

    @Override
    public void displayDetails() {
        System.out.println("IT Student:");
        System.out.println("ID: " + id + ", Name: " + name + ", DOB: " + dob + ", Java Score: " + javaScore);
    }
}