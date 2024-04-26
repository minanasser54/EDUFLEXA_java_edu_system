package accounts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AccountsUtility
{
    public static void addUser(User user){
        try (FileWriter fw1 = new FileWriter("src/accounts/UsersDB.txt",true)) {
            fw1.write(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getUser(String username){
        try {
            //File fr1 = new File("src/accounts/UsersDB.txt");
            String st1 ;
            Scanner sc1 = new Scanner( new File("src/accounts/UsersDB.txt"));
            while (sc1.hasNextLine()) {
                st1 = sc1.nextLine();
                StringBuilder stb1 = new StringBuilder(st1);
                int i=stb1.indexOf("$", 0)+1;
                String usrn=stb1.substring(i,stb1.indexOf("$",i));
                if (usrn .equals(username)) {
                    User usr=parseUserRow(stb1);
                    System.out.println(usr.toString());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public static User parseUserRow(StringBuilder stb){
        int i=stb.indexOf("$", 0)+1;
        String id=stb.substring(stb.indexOf(">")+1,--i);
        String usrn=stb.substring(++i,stb.indexOf("$",i));
        i=stb.indexOf("$",i)+1;
        String email=stb.substring(i,stb.indexOf("$",i));
        i=stb.indexOf("$",i)+1;
        String password=stb.substring(i,stb.indexOf("$",i));
        i=stb.indexOf("$",i)+1;
        String gender=stb.substring(i,stb.indexOf("$",i));
        i=stb.indexOf("$",i)+1;
        String role=stb.substring(i,stb.indexOf("<",i));
        if (role.equals("MENTOR")){
            return new Mentor(Integer.parseInt(id), usrn, email, password, gender);
        }
        else{
            return new Student(Integer.parseInt(id), usrn, email, password, gender);
        }
    }
}
