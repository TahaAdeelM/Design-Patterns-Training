package net.media.training.live.srp;

public class EmployeeDetailsAsString {
    static public String toHtml(EmployeeDetails employeeDetails) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employeeDetails.getEmpId() + "'>" +
                "<span>" + employeeDetails.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employeeDetails.getTotalLeaveAllowed() - employeeDetails.getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employeeDetails.getMonthlySalary() * 12) + "</span>";
        if (employeeDetails.getManager() != null) str += "<span>" + employeeDetails.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (employeeDetails.getYearsInOrg() < 3) {
            years = employeeDetails.getYearsInOrg();
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += employeeDetails.getLeavesLeftPreviously()[employeeDetails.getYearsInOrg()-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
