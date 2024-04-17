package accounts;


public class Mentor extends User {
    public Mentor(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender,"MENTOR");
    }
    public static Mentor createMentor(int id, String username, String email, String password, String gender){
        Mentor mentor = new Mentor(id, username, email, password, gender);
        return mentor;
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
}
