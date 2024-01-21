import java.util.ArrayList;
import java.util.List;

// Course class representing a university course
class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class representing a university student
class Student {
    private String name;
    private List<Course> courses;  // Association with Course class

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    // Method to display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Main class to demonstrate association
 class asociation{ 
    public static void main(String[] args) {
        // Creating courses
        Course mathCourse = new Course("Mathematics");
        Course csCourse = new Course("Computer Science");
        Course bioCourse = new Course("Biology");

        // Creating students
        Student student1 = new Student("John Doe");
        Student student2 = new Student("Jane Smith");

        // Associating students with courses
        student1.enrollInCourse(mathCourse);
        student1.enrollInCourse(csCourse);
        student2.enrollInCourse(bioCourse);

        // Displaying enrolled courses for each student
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
    }
}