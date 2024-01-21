
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

// Department class representing a university department composed of courses
class Department {
    private String departmentName;
    private List<Course> courses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Courses offered by " + departmentName + " department:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

// University class representing a university composed of departments
class University {
    private List<Department> departments;

    public University() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in the university:");
        for (Department department : departments) {
            department.displayCourses();
        }
    }
}

// Main class to demonstrate composition
class composition {
    public static void main(String[] args) {
        // Creating courses
        Course mathCourse = new Course("Mathematics");
        Course csCourse = new Course("Computer Science");
        Course bioCourse = new Course("Biology");

        // Creating departments and adding courses
        Department mathDepartment = new Department("Math Department");
        mathDepartment.addCourse(mathCourse);

        Department csDepartment = new Department("Computer Science Department");
        csDepartment.addCourse(csCourse);

        Department bioDepartment = new Department("Biology Department");
        bioDepartment.addCourse(bioCourse);

        // Creating a university and adding departments
        University myUniversity = new University();
        myUniversity.addDepartment(mathDepartment);
        myUniversity.addDepartment(csDepartment);
        myUniversity.addDepartment(bioDepartment);

        // Displaying departments and courses in the university
        myUniversity.displayDepartments();
    }
}
