package Utility;

import java.util.ArrayList;

import Material.Course;
import accounts.Mentor;
import accounts.Student;

public class Init {


    Mentor nosser = new Mentor(0, "mina Nasser", "mina@gmail.com", "177823", "male");
    Mentor Nasser = new Mentor(0, "Nasser mina", "Nasser@gmail.com", "4554676", "male");
    Mentor ashraf1 = new Mentor(0, "ashraf ahmed", "ashraf@gmail.com", "787569", "male");
    Mentor antony = new Mentor(0, "antony mina", "antony@gmail.com", "101122", "male");



    Student zoz     = new Student(1, "zyad magdy", "zoz@gmail.com", "86657", "male");
    Student alfons  = new Student(2, "mina antony", "alfons@gmail.com", "446756", "male");
    Student mustafa = new Student(3, "mustafa hamada", "mustafa@gmail.com", "787789", "male");
    Student ashraf  = new Student(4, "ahmed ashraf", "ashraf@gmail.com", "115522", "male");


    
    Course java     = new Course("MASTER JAVA", nosser, 1200, 6, "you will be a ninja");
    Course python   = new Course("MASTER Python", nosser, 300, 4, "you will be a ninja");
    Course php      = new Course("MASTER php", nosser, 500, 4, "you will be a ninja");
    Course Math1    = new Course("MASTER Math1", nosser, 500, 4, "you will be a ninja");
    Course Statics  = new Course("MASTER Statics", nosser, 500, 4, "you will be a ninja");
    Course Dynamics = new Course("MASTER Dynamics", nosser, 500, 4, "you will be a ninja");
    Course Thermal  = new Course("MASTER Thermal", nosser, 500, 4, "you will be a ninja");
    Course Fields   = new Course("MASTER Fields", nosser, 500, 4, "you will be a ninja");
    Course Math2    = new Course("MASTER Math2", nosser, 500, 4, "you will be a ninja");


    public static  int                  accessed_student_index;
    public static  int                  accessed_Mentor_index;

    
    public static  ArrayList<Course>    Availablecourses   = new ArrayList<Course>();
    public static  ArrayList<Student>   students           = new ArrayList<Student>();
    public static  ArrayList<Mentor>    Mentors            = new ArrayList<Mentor>();



    public  void set_Init_Students() {
         
        students.add(zoz);
        students.add(alfons);
        students.add(mustafa);
        students.add(ashraf);

        zoz.setEnrolledcourses(Fields);
        zoz.setEnrolledcourses(Math1);

    }


  
    public   void set_Init_Courses() {
        Availablecourses.add(java);
        Availablecourses.add(python);
        Availablecourses.add(Math1);
        Availablecourses.add(Statics);
        Availablecourses.add(Dynamics);
        Availablecourses.add(Thermal);
        Availablecourses.add(Fields);
        Availablecourses.add(Math2);
    }

    
    public  void set_Init_Mentors() {
         
        Mentors.add(nosser);
        Mentors.add(Nasser);
        Mentors.add(ashraf1);
        Mentors.add(antony);

    }




 











    
}
