class BizStu extends Student {
    private double busScore;

    public BizStu(String id, String name, String dob, double busScore) {
        super(id, name, dob);
        this.busScore = busScore;
    }

    @Override
    public void displayDetails() {
        System.out.println("Business Student:");
        System.out.println("ID: " + id + ", Name: " + name + ", DOB: " + dob + ", Business Score: " + busScore);
    }
}