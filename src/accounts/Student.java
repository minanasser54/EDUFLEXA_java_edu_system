package accounts;

import java.util.ArrayList;

public class Student extends User implements Courses {

    ArrayList<Courses> enrolled_courses   = new ArrayList<Courses>();


    public Student(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "STUDENT");
    }
    public static Student createStudent(int id, String username, String email, String password, String gender){
        Student student = new Student(id, username, email, password, gender);
        AccountsUtility.addUser(student);
        return student;}



    public void enrollment (String coursename)
    {
        int course_index;
        
        try 
        {
            course_index = title.indexOf(coursename);
            for(int count = 0 ; count<100 ; count++)
            {
                if (Students [course_index][count] == null )
                {
                    Students [course_index][count] = this.getUsername();
                    break;
                }
             
            }
        }
        catch (Exception ex)
        {
            System.out.println(coursename+ " is Not Valid Course");
        
        }
    }

    public ArrayList<String> std_enroll_what ()
    {
        ArrayList<String> courses = new ArrayList<String>();

        for (int i = 0 ; i<100 ; i++)
        {
            for (int j = 0 ; j<100 ; j++)
            {
                if (Students[i][j] == this.getUsername())
                {
                    courses.add(title.get(i));
                }

            }
        }
        return courses;


    }



    @Override
    public String toString(){
        return super.toString();
    }
    
}
