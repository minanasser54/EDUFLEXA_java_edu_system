import accounts.AccountsUtility;
import accounts.Mentor;
import accounts.Student;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=============================");

        Mentor nasser = Mentor.createMentor(1, "nasser", "nasser@gmail.com", "123", "male");
        Mentor mina = Mentor.createMentor(0, "mina", "mina@gmail.com", "123", "male");
        Mentor alfons = Mentor.createMentor(2, "alfons", "alfons@gmail.com", "123", "male");


        Student zoz1 = Student.createStudent(3, "zoz1", "zoz1@gmail.com", "123$#!%", "male");
        Student zoz2 = Student.createStudent(7, "zoz2", "zoz2@gmail.com", "123)OKJ&*", "male");
        Student zoz3 = Student.createStudent(1, "zoz3", "zoz3@gmail.com", "123S^Z$%W", "male");
        Student zoz4 = Student.createStudent(9, "zoz4", "zoz4@gmail.com", "123LEW)D", "male");
        Student zoz5 = Student.createStudent(9, "zoz5", "zoz5@gmail.com", "123", "male");

        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");


        String [] Lectures = {"1) 1st order ODE" ,"2) 2st order ODE" , "3) linearity" , "3) Sinc function" , "4) Calcules" };
        nasser.SET_Courses("Math1", 2355421, 190, 5, "To Solve 3rd order Equations", 5, Lectures);
        nasser.SET_Courses("Semi conductor", 23421, 190, 5, "Diode", 4, Lectures);
        nasser.SET_Courses("Statics", 773521, 190, 5, "Newten", 5, Lectures);
        nasser.SET_Courses("Dynamics", 93521, 190, 5, "Motion", 1, Lectures);
        nasser.SET_Courses("Drawing", 713521, 190, 5, "Arch", 1, Lectures);
        nasser.SET_Courses("Advancd Programming", 71, 190, 5, "Java,javaFX", 2, Lectures);
        nasser.SET_Courses("System Control", 7711, 190, 5, "zzz", 5, Lectures);


        nasser.Course_details(0);
        nasser.Course_details(1);
        nasser.Course_details(2);
        nasser.Course_details(3);
        nasser.Course_details(4);
        nasser.Course_details(5);
        nasser.Course_details(6);


        System.out.println("=============================");
        System.out.println("=============================");
        System.out.println("=============================");

        zoz1.enrollment("Drawing");


        zoz2.enrollment("Statics");
        zoz2.enrollment("Math2");
        zoz2.enrollment("Dynamics");


        zoz3.enrollment("Semi conductor");
        zoz3.enrollment("Advancd Programming");
        zoz3.enrollment("Dynamics");

        

        zoz4.enrollment("Math1");
        zoz4.enrollment("Semi conductor");
        zoz4.enrollment("Statics");
        zoz4.enrollment("Dynamics");



        zoz5.enrollment("System Control");
        zoz5.enrollment("Drawing");
        zoz5.enrollment("Math1");



        System.out.println("=============================");
        System.out.println("=============================");


        System.out.println("Math1 has "          +nasser.no_std_enroll("Math1") + " Students");
        System.out.println("Semi conductor has " +nasser.no_std_enroll("Semi conductor") + " Students");
        System.out.println("Statics has "        +nasser.no_std_enroll("Statics") + " Students");
        System.out.println("Dynamics has "       +nasser.no_std_enroll("Dynamics") + " Students");



        System.out.println("=============================");
        System.out.println("=============================");


        System.out.println("zoz1 enroll" + zoz1.std_enroll_what());
        System.out.println("zoz2 enroll" + zoz2.std_enroll_what());
        System.out.println("zoz3 enroll" + zoz3.std_enroll_what());
        System.out.println("zoz4 enroll" + zoz4.std_enroll_what());
        System.out.println("zoz5 enroll" + zoz5.std_enroll_what());






    }
}
