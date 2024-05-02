package accounts;
import Material.Course; 
import java.util.ArrayList;

public class Student extends User  {
    private ArrayList<Course> enrolledcourses=new ArrayList<Course>();
    private ArrayList<Course> finishedcourses=new ArrayList<Course>();
    static int no_students;
    

    public Student(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "STUDENT");
        no_students++;
    }
    
    public ArrayList<Course> getEnrolledcourses() {
        return enrolledcourses;
    }
    public static int getNo_students() {
        return no_students;
    }



    public ArrayList<Course> getFinishedcourses() {
        return finishedcourses;
    }
    public void complete(Course c){
        try {
            int x=getEnrolledcourses().indexOf(c);
            finishedcourses.add(c);
        } catch (Exception e) {
            System.out.println("YOU ARE ENROLLED IN THIS COURSE TO FINISH");
        }
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
}
