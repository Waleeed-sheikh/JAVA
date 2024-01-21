// Student class demonstrating encapsulation
class Student {
    private String name;
    private int age;
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter methods to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    // Setter methods to modify private fields
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be greater than 0.");
        }
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Display method to print student information
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

// Main class to demonstrate encapsulation
 class runEnc {
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student("waleed sheikh", 20, "S12345");

        // Displaying initial student information
        student1.displayStudentInfo();

        // Modifying student information using setter methods
        student1.setName("waleed sheikh");
        student1.setAge(21);
        student1.setStudentId("S67890");

        // Displaying modified student information
        student1.displayStudentInfo();
    }
}
