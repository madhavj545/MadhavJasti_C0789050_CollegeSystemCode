package WeeksClassActivity.Employee;

import WeeksClassActivity.Gender;
import WeeksClassActivity.ID;
import WeeksClassActivity.Vehicle.Vehicle;


public class PartTimeFaculty extends Faculty implements ID {
    int noOfHoursWorked;
    float payPerHour;
    Vehicle vehicle;

    public PartTimeFaculty(int id, String firstName, String lastName, Gender gender, float totalSalary, String department, int noOfHoursWorked, float payPerHour, Vehicle vehicle) {
        super(id, firstName, lastName, gender, totalSalary, department);
        this.noOfHoursWorked = noOfHoursWorked;
        this.payPerHour = payPerHour;
        this.vehicle = vehicle;
    }

    public void display()
    {
        System.out.println("Parttime Faculty ID : "+id);
        System.out.println("Parttime Faculty Name : "+firstName+" "+lastName);
        System.out.println("Parttime Faculty Gender : "+gender);
        System.out.println("Parttime Faculty Total Salary : "+totalSalary);
        System.out.println("Parttime Faculty No. of Hours Worked : "+noOfHoursWorked);
        System.out.println("Parttime Faculty Pay Per Hour : "+payPerHour);
        System.out.println("Parttime Faculty Vehicle : "+vehicle);
        System.out.println("--------------------------------------------");
    }
}
