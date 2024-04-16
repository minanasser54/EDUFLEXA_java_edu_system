package accounts;

public class Student extends User {

    public Student(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "STUDENT");
    }


    @Override
    public String toString(){
        return super.toString();
    }
    
}
