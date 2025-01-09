public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student type (1 for IT, 2 for Business): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Date of Birth (dd/mm/yyyy): ");
        String dob = scanner.nextLine();

        if (type == 1) {
            System.out.println("Enter Java Score: ");
            double javaScore = scanner.nextDouble();
            students.add(new ITStu(id, name, dob, javaScore));
        } else if (type == 2) {
            System.out.println("Enter Business Score: ");
            double busScore = scanner.nextDouble();
            students.add(new BizStu(id, name, dob, busScore));
        } else {
            System.out.println("Invalid type. Student not added.");
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayDetails();
        }
    }

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    management.addStudent();
                    break;
                case 2:
                    management.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}