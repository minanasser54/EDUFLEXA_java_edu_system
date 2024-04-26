package accounts;


public class Mentor extends User implements Courses {
    static int course_index = 0;
    

    
    public Mentor(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender,"MENTOR");
    }
    public static Mentor createMentor(int id, String username, String email, String password, String gender){
        Mentor mentor = new Mentor(id, username, email, password, gender);
        AccountsUtility.addUser(mentor);
        return mentor;
    }


    public void SET_Courses(String t, int c, int p, int w, String o, int q, String[] ch )
    {
        int count = 0;
        title.add(t);
        code.add(c);
        price.add(p);
        week_duration.add(w);
        Outcomes.add(o);
        no_quize.add(q);

        
        for (String num : ch) {
            Chapters [course_index][count++] = num;
        }
        course_index++;
    }

    public void Course_details(int index) {
        
            System.out.println("Course " + index );
            System.out.print("\t title: "             +title.get(index));
            System.out.print("\t Code: "              +code.get(index));
            System.out.print("\t Price: "             +price.get(index));
            System.out.print("\t week_duration: "     +week_duration.get(index));
            System.out.print("\t Outcomes: "          +Outcomes.get(index));
            System.out.println("\t Number of Quize: "   +no_quize.get(index));


            for(int j = 0 ; j<20 ; j++)
            {
                if (Chapters[index][j] != null)
                System.out.println("\t Lecture Details: "+(j+1)+": "+Chapters[index][j]);
            }
            System.out.println("=========================");
        
    }

    public int no_std_enroll(String index) 
    {
            int size = 0;
            int i = title.indexOf(index);
            for (String element : Students[i]) 
            {
                if (element != null)    size++;
                else                    break;
            }

            return size;
        
    }










    @Override
    public String toString(){
        return super.toString();
    }
    
}
