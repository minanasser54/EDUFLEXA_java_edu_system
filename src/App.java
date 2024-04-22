import accounts.AccountsUtility;
import accounts.Mentor;
import accounts.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Mentor nasser = Mentor.createMentor(1, "nasser", "nasser@gmail.com", "123", "male");
        Mentor mina = Mentor.createMentor(0, "mina", "mina@gmail.com", "123", "male");
        Mentor alfons = Mentor.createMentor(2, "alfons", "alfons@gmail.com", "123", "male");
        Student zoz = Student.createStudent(3, "zoz", "zoz@gmail.com", "123", "male");
        
        AccountsUtility.getUser("alfons");
        AccountsUtility.getUser("zoz");
    }
}
