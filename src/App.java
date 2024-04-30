import java.util.ArrayList;

import accounts.AccountsUtility;
import Material.Chapter;
import Material.Course;
import accounts.Mentor;
import accounts.Student;
 



public class App {
    public static void main(String[] args) throws Exception {
        Mentor nosser = new Mentor(0, "mina Nasser", "nosser@gmail.com", "123", "male");
        System.out.println(nosser.toString());
        System.out.println("=============================");
        Student zoz = new Student(1, "zyad magdy", "zoz@gmail.com", "123", "male");
        Student alfons = new Student(2, "mina antony", "alfons@gmail.com", "123", "male");
        Student mustafa = new Student(3, "mustafa hamada", "mustafa@gmail.com", "123", "male");
        Student ashraf = new Student(4, "ahmed ashraf", "ashraf@gmail.com", "123", "male");
        System.out.println("added num of students : "+Student.getNo_students());
        System.out.println("=============================");
        Course java = new Course("MASTER JAVA", nosser, 1200, 6, "you will be a ninja");
        Course python = new Course("MASTER Python", nosser, 300, 4, "you will be a ninja");
        ArrayList<Chapter> dumchapters = new ArrayList<Chapter>();
        for(int i =0 ; i<11;i++){
            dumchapters.add(i, new Chapter(String.format("ch %4o ",i)));
        }
        java.addChapters(dumchapters);
        python.addChapters(dumchapters);

        System.out.println(java.toString());
        System.out.println(python.toString());
        System.out.println("=============================");
        java.setPublished(true);
        python.setPublished(true);
        java.enroll(ashraf);
        python.enroll(zoz);
        java.enroll(zoz);

        zoz.complete(python);
        zoz.complete(java);
        System.out.println(zoz.getFinishedcourses());
        System.out.println("=============================");
    }}