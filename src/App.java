import accounts.Mentor;
import accounts.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Mentor m1=new Mentor(0, "Admin", "admin@yahoo.com", "12345", "male");
        System.out.println(m1.toString());
        Student s1=new Student(1, "Mina", "mina@gmail.com", "abcde", "male");
        System.out.println(s1.toString());
    }
}
