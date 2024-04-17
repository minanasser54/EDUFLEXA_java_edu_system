package accounts;
import java.io.File;
import org.json.simple.JsonArray;
import org.json.simple.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Utilities {
    public static void addMentorDB(Mentor mentor) {
        JsonObject tempo2 = new JsonObject();
        tempo2.put("id", mentor.getId());
        tempo2.put("username", mentor.getUsername());
        tempo2.put("email", mentor.getEmail());
        tempo2.put("password", mentor.getPassword());
        tempo2.put("gender", mentor.getGender());
        tempo2.put("role", "MENTOR");
        try {
            FileWriter fw1 = new FileWriter("src/accounts/UsersDB.json",true);
            BufferedWriter bw1 =new BufferedWriter(fw1);
            bw1.write(tempo2.toJson());
            bw1.newLine();
            bw1.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception occured: "+ e);
        }
    }

    public static Mentor[] parseMentors() {
        Mentor temp[]=new Mentor[100];
        try {
            FileReader fr1 = new FileReader("src/accounts/UsersDB.json");
            int i=0;
            Scanner scan = new Scanner(fr1);
            while (scan.hasNextLine()) {
                String stemp = scan.nextLine();
                JsonObject obj = (JsonObject) Jsoner.deserialize(stemp);
                Mentor men = new Mentor(obj.getInteger("id"), (String)obj.get("username"),(String)obj.get("email"),(String)obj.get("password"), (String)obj.get("gender"));
                temp[i]=men;
                //System.out.println(temp[i].toString());
                i++;
            }
            scan.close();
            return temp;
        } catch (Exception e) {
            System.out.println(e);
            return temp;
        }
    }

    public static Mentor parseMentor(int id) {
        Mentor nulmen=new Mentor(0, "nullmentor", "nullemail", "nullpass", "nullgender");
        try {
            FileReader fr1 = new FileReader("src/accounts/UsersDB.json");
            Scanner scan = new Scanner(fr1);
            while (scan.hasNextLine()) {
                String stemp = scan.nextLine();
                JsonObject obj = (JsonObject) Jsoner.deserialize(stemp);
                Mentor men = new Mentor(obj.getInteger("id"), (String)obj.get("username"),(String)obj.get("email"),(String)obj.get("password"), (String)obj.get("gender"));
                if(men.getId()==id){
                    nulmen= men;
                    break;}}
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
            return nulmen;
        }finally{return nulmen; }}

        // public static Mentor editMentor(int id, String username, String email, String password, String gender) {
        //     Mentor nulmen=new Mentor(0, "nullmentor", "nullemail", "nullpass", "nullgender");
        //     try {
        //         FileReader fr1 = new FileReader("src/accounts/UsersDB.json");
        //         Scanner scan = new Scanner(fr1);
        //         while (scan.hasNextLine()) {
        //             String stemp = scan.nextLine();
        //             JsonObject obj = (JsonObject) Jsoner.deserialize(stemp);
        //             Mentor men = new Mentor(obj.getInteger("id"), (String)obj.get("username"),(String)obj.get("email"),(String)obj.get("password"), (String)obj.get("gender"));
        //             if(men.getId()==id){
        //                 nulmen= men;
        //                 FileWriter fw1 = new FileWriter("src/accounts/UsersDB.json",true);
        //                 BufferedWriter bw1 =new BufferedWriter(fw1);
        //                 bw1.newLine();
        //                 bw1.close();
        //                 break;}}
        //         scan.close();
        //     } catch (Exception e) {
        //         System.out.println("1");
        //         System.out.println(e);
        //         return nulmen;
        //     }finally{return nulmen; }}
    
        
}

