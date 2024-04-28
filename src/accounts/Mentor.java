package accounts;
import Material.Courses;


public class Mentor extends User {
    
    public Mentor(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender,"MENTOR");
    }
    public static Mentor createMentor(int id, String username, String email, String password, String gender){
        Mentor mentor = new Mentor(id, username, email, password, gender);
        AccountsUtility.addUser(mentor);
        return mentor;
    }


    public Courses SET_Courses(String title, int code, int price, int week_duration, String Outcomes, int no_quize, String[] Chapters)
    {
        return new Courses(title, code, price, week_duration, Outcomes, no_quize, Chapters);
    }

    public void Course_details(Courses c) {
        
            System.out.println("Course " );
            System.out.print("\t title: "               +c.getTitle());
            System.out.print("\t Code: "                +c.getCode());
            System.out.print("\t Price: "               +c.getPrice());
            System.out.print("\t week_duration: "       +c.getWeek_duration());
            System.out.print("\t Outcomes: "            +c.getOutcomes());
            System.out.println("\t Number of Quize: "   +c.getNo_quize());


            for(int j = 0 ; j<c.getnumber_Chapters() ; j++)
            {
                if (c.getChapters(j) != null)
                System.out.println("\t Lecture Details: "+(j+1)+": "+c.getChapters(j));
            }
            System.out.println("=========================");
        
    }




    @Override
    public String toString(){
        return super.toString();
    }
    
}
