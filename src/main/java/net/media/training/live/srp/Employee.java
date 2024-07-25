package net.media.training.live.srp;


public class Employee {
    private EmployeeDetails employeeDetails;
    
    // Constructors
    public Employee() {}
    
    public Employee(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }
    
    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        employeeDetails = new EmployeeDetails(empId, monthlySalary, name, addressStreet, addressCity, addressCountry, leavesTaken, leavesLeftPreviously);
    }

    // Getter
    public EmployeeDetails getEmployeeDetails() {
        return employeeDetails;
    }
    // Setters via EmployeeDetails class setters

    // tohtml method now refactored to EmployeeDetailsAsString class

    //other method related to customer
}
