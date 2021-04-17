package WeeksClassActivity.Employee;

import WeeksClassActivity.ID;
import WeeksClassActivity.Gender;


public class Facutly extends Employee implements ID {
    String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, float totalSalary, String department) {
        super(id, firstName, lastName, gender, totalSalary);
        this.department = department;
    }

    public Faculty(float totalSalary, String department) {
        super(totalSalary);
        this.department = department;
    }

    public Faculty(int id, String firstName, String lastName, Gender gender, String department) {
        super(id, firstName, lastName, gender);
        this.department = department;
    }

    public Faculty(String department) {
        this.department = department;
    }

    public Faculty()
    {

    }
    public void display()
    {
        System.out.println("Faculty ID : "+id);
        System.out.println("Faculty Name : "+firstName+" "+lastName);
        System.out.println("Faculty Gender : "+gender);
        System.out.println("Faculty Total Salary : "+totalSalary);
        System.out.println("Faculty Department : "+department);
        System.out.println("--------------------------------------------");
    }
}
