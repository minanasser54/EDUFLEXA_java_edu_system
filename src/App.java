import java.util.ArrayList;

import accounts.AccountsUtility;
import Material.Courses;
import accounts.Mentor;
import accounts.Student;
 



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=============================");

        Mentor nasser = Mentor.createMentor(1, "nasser", "nasser@gmail.com", "123", "male");
        Mentor mina = Mentor.createMentor(0, "mina", "mina@gmail.com", "123", "male");
        Mentor alfons = Mentor.createMentor(2, "alfons", "alfons@gmail.com", "123", "male");


        Student zoz1 = Student.createStudent(3, "zoz1", "zoz1@gmail.com", "123$#!%", "male");
        Student zoz2 = Student.createStudent(7, "zoz2", "zoz2@gmail.com", "123OKJ&*", "male");
        Student zoz3 = Student.createStudent(1, "zoz3", "zoz3@gmail.com", "123S^Z$%W", "male");
        Student zoz4 = Student.createStudent(9, "zoz4", "zoz4@gmail.com", "123LEWD", "male");
        Student zoz5 = Student.createStudent(9, "zoz5", "zoz5@gmail.com", "123", "male");

        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");


        ArrayList<Courses> C = new ArrayList<Courses>();



        String [] Lectures = {"1) 1st order ODE" ,"2) 2st order ODE" , "3) linearity" , "3) Sinc function" , "4) Calcules" };
        C.add (nasser.SET_Courses("Math1", 2355421, 19, 5, "To Solve 3rd order Equations", 5, Lectures));
        C.add (nasser.SET_Courses("Semi conductor", 23421, 10, 5, "Diode", 4, Lectures));
        C.add (nasser.SET_Courses("Statics", 773521, 123, 5, "Newten", 5, Lectures));
        C.add (nasser.SET_Courses("Dynamics", 93521, 127, 5, "Motion", 1, Lectures));
        C.add (nasser.SET_Courses("Drawing", 713521, 98, 5, "Arch", 1, Lectures));
        C.add (nasser.SET_Courses("Advancd Programming", 71, 190, 5, "Java,javaFX", 2, Lectures));
        C.add (nasser.SET_Courses("System Control", 7711, 190, 5, "zzz", 5, Lectures));
        

        nasser.Course_details(C.get(0));            //Math1
        nasser.Course_details(C.get(1));            //Semi
        nasser.Course_details(C.get(2));            //Statics
        nasser.Course_details(C.get(3));            //Dynamics
        nasser.Course_details(C.get(4));            //Drawing
        nasser.Course_details(C.get(5));            //Advanced
        nasser.Course_details(C.get(6));            //System Control


        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");

        zoz1.enroll(C.get(4));


        zoz2.enroll(C.get(2));
        zoz2.enroll(C.get(6));
        zoz2.enroll(C.get(4));


        zoz3.enroll(C.get(1));
        zoz3.enroll(C.get(5));
        zoz3.enroll(C.get(3));

        

        zoz4.enroll(C.get(0));
        zoz4.enroll(C.get(6));
        zoz4.enroll(C.get(2));
        zoz4.enroll(C.get(3));



        zoz5.enroll(C.get(6));
        zoz5.enroll(C.get(4));
        zoz5.enroll(C.get(0));



        System.out.println("=============================");
        System.out.println("=============================");


        System.out.println("Math1 has "          +C.get(0).getnumbers_Students() + " Students");
        System.out.println("Semi conductor has " +C.get(1).getnumbers_Students() + " Students");
        System.out.println("Statics has "        +C.get(2).getnumbers_Students() + " Students");
        System.out.println("Dynamics has "       +C.get(3).getnumbers_Students() + " Students");



        System.out.println("=============================");
        System.out.println("=============================");


        System.out.println("zoz1 enroll" + zoz1.Student_Courses(C));
        System.out.println("zoz2 enroll" + zoz2.Student_Courses(C));
        System.out.println("zoz3 enroll" + zoz3.Student_Courses(C));
        System.out.println("zoz4 enroll" + zoz4.Student_Courses(C));
        System.out.println("zoz5 enroll" + zoz5.Student_Courses(C));






    }
}
