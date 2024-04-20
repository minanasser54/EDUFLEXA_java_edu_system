import accounts.Mentor;
import accounts.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Mentor nasser = Mentor.createMentor(1, "nasser", "nasser@gmail.com", "123", "male");
        Mentor mina = Mentor.createMentor(0, "mina", "mina@gmail.com", "123", "male");
        System.out.println(mina.toString());
        System.out.println(nasser.toString());
    }
}
