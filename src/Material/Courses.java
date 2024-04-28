package Material;
import java.util.ArrayList;





public class Courses 

{
    private      String  title;
    private      int     code;            
    private      int     price;             
    private      int     week_duration;            
    private      String  Outcomes;     
    private      int     no_quize;    
    static       int no_courses = 0;

    ArrayList<String> Chapters = new ArrayList<String>();
    ArrayList<String> Students = new ArrayList<String>();


    public Courses (String title, int code, int price, int week_duration, String Outcomes, int no_quize, String[] Ch)
    {
        this.title = title;
        this.code = code;
        this.price = price;
        this.week_duration = week_duration;
        this.Outcomes = Outcomes;
        this.no_quize = no_quize;
        for (int i = 0 ; i<Ch.length ; i++)
        {
            this.Chapters.add(Ch[i]); 
        }
        no_courses++;
    }


    public void setStudents(String student) {
        this.Students.add(student);
        
    }



    public  String getChapters(int i) {
        return Chapters.get(i);
    }
    public  int getnumber_Chapters() {
        return Chapters.size();
    }
    public int getCode() {
        return code;
    }
    public static int getNo_courses() {
        return no_courses;
    }
    public int getNo_quize() {
        return no_quize;
    }
    public String getOutcomes() {
        return Outcomes;
    }
    public int getPrice() {
        return price;
    }
    public  String getStudents_name(int i) {
        return Students.get(i);
    }
    public int getnumbers_Students() 
    {
        return Students.size();
    }
    public String getTitle() {
        return title;
    }
    public int getWeek_duration() {
        return week_duration;
    }


}
