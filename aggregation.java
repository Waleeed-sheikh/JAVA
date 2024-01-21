
import java.util.ArrayList;
import java.util.List;

// Employee class representing an individual employee
class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Department class representing a department that aggregates employees
class Department {
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + " department:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Employee ID: " + employee.getEmployeeId());
        }
    }
}

// Main class to demonstrate aggregation
 class aggregation {
    public static void main(String[] args) {
        // Creating employees
        Employee employee1 = new Employee("John Doe", 101);
        Employee employee2 = new Employee("Jane Smith", 102);

        // Creating a department and adding employees
        Department hrDepartment = new Department("Human Resources");
        hrDepartment.addEmployee(employee1);
        hrDepartment.addEmployee(employee2);

        // Displaying employees in the department
        hrDepartment.displayEmployees();
    }
}