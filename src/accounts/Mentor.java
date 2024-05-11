package accounts;

import java.util.ArrayList;

import Material.Course;

public class Mentor extends User {
    
    private ArrayList<Course> ownedcourses = new ArrayList<Course>();

    public Mentor(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "MENTOR");
    }

    public ArrayList<Course> getOwnedcourses() {
        return ownedcourses;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
