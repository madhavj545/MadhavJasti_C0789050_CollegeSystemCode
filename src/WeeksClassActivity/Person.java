package WeeksClassActivity;

import WeeksClassActivity.Gender;
import WeeksClassActivity.ID;

public class Person {
    public void display() {
    }

    public class Person implements ID
    {
        public int id;
        public String firstName;
        public String lastName;
        public Gender gender;

        public Person(int id, String firstName, String lastName, Gender gender){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public Person() {
            this.id = 0;
            this.firstName = "X";
            this.lastName ="Y";
            this.gender = Gender.MALE;
        }

        public void display()
        {
            System.out.println("WeeksClassActivity.Person WeeksClassActivity.ID : "+id);
            System.out.println("WeeksClassActivity.Person Name : "+firstName+" "+lastName);
            System.out.println("WeeksClassActivity.Person WeeksClassActivity.Gender : "+gender);
        }
    }
}
