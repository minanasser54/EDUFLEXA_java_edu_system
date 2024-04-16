package accounts;

public class Mentor extends User {
    public Mentor(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender,"MENTOR");
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}
