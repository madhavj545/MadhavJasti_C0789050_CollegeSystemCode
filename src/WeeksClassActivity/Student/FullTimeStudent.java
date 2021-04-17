package WeeksClassActivity.Student;

import WeeksClassActivity.Gender;
import WeeksClassActivity.ID;
import WeeksClassActivity.Vehicle.Vehicle;

public class FullTimeStudent extends Student implements ID {
    float attendance;

    public FullTimeStudent(int id, String firstName, String lastName, Gender gender, String courseName, Vehicle vehicle, String collegeName, float attendance) {
        super(id, firstName, lastName, gender, courseName, vehicle, collegeName);
        this.attendance = attendance;
    }

    public void display()
    {
        System.out.println("Fulltime Student ID : "+id);
        System.out.println("Fulltime Student Name : "+firstName+" "+lastName);
        System.out.println("Fulltime Student Gender : "+gender);
        System.out.println("Fulltime Student Course : "+courseName);
        System.out.println("Fulltime Student College : "+collegeName);
        System.out.println("Fulltime Student Attendance : "+attendance+"%");
        System.out.println("Fulltime Student Vehicle : "+vehicle);
        System.out.println("--------------------------------------------");
    }
}
