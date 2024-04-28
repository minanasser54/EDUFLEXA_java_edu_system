package accounts;
import Material.Courses; 
import java.util.ArrayList;

public class Student extends User  {



    public Student(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "STUDENT");
    }
    public static Student createStudent(int id, String username, String email, String password, String gender){
        Student student = new Student(id, username, email, password, gender);
        AccountsUtility.addUser(student);
        return student;}



    public void enroll (Courses c)
    {
        c.setStudents(this.getUsername());

    }

    public ArrayList<String> Student_Courses (ArrayList<Courses> c)
    {
        ArrayList<String> s = new ArrayList<String>();
        
        for (int i = 0 ; i<c.size() ; i++)
        {
            for (int j = 0 ; j<c.get(i).getnumbers_Students() ; j++)
            {
                if (c.get(i).getStudents_name(j) == this.getUsername())
                {
                    s.add(c.get(i).getTitle());
                }

            }
        }
        return s;
    }



    @Override
    public String toString(){
        return super.toString();
    }
    
}
