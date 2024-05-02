


import java.io.IOException;
import java.util.ArrayList;

import Material.Chapter;
import Material.Course;
import accounts.Mentor;
import accounts.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       try
       {
       
        FXMLLoader fxmloader = new FXMLLoader(getClass().getResource("mainframe.fxml"));
        Parent root = fxmloader.load();
        Scene  scene = new Scene(root);

        primaryStage.setTitle("first Scene");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

       }catch(Exception e)
       {
        e.printStackTrace();

       }


       Stage secondStage = new Stage();
       primaryStage.setOnHidden(event -> {
        try {
            // Open the second scene in a new stage when the primary stage is closed 
            FXMLLoader fxmloader1 = new FXMLLoader(getClass().getResource("mainframe1.fxml"));
            Parent root1 = fxmloader1.load();
            Scene scene1 = new Scene(root1);
            secondStage.setTitle("Second Scene");
            secondStage.setScene(scene1);
            secondStage.setResizable(false);
            secondStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    });



        Stage ThirdStage = new Stage();
        secondStage.setOnHidden(event -> {
            try {
                // Open the second scene in a new stage when the primary stage is closed
                FXMLLoader fxmloader2 = new FXMLLoader(getClass().getResource("mainframe2.fxml"));
                Parent root2 = fxmloader2.load();
                Scene scene2 = new Scene(root2);
                ThirdStage.setTitle("Third Scene");
                ThirdStage.setScene(scene2);
                ThirdStage.setResizable(false);
                ThirdStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }

    });




    }
    

    public static void main(String[] args) throws IOException {

        Mentor nosser = new Mentor(0, "mina Nasser", "nosser@gmail.com", "123", "male");
        System.out.println(nosser.toString());


        System.out.println("=============================");
        ArrayList<Student> std = new ArrayList<Student>();

        Student zoz     = new Student(1, "zyad magdy", "zoz@gmail.com", "123", "male");
        Student alfons  = new Student(2, "mina antony", "alfons@gmail.com", "456", "male");
        Student mustafa = new Student(3, "mustafa hamada", "mustafa@gmail.com", "789", "male");
        Student ashraf  = new Student(4, "ahmed ashraf", "ashraf@gmail.com", "1122", "male");

        std.add(zoz);
        std.add(alfons);
        std.add(mustafa);
        std.add(ashraf);

        Course java     = new Course("MASTER JAVA", nosser, 1200, 6, "you will be a ninja");
        Course python   = new Course("MASTER Python", nosser, 300, 4, "you will be a ninja");
        Course php      = new Course("MASTER php", nosser, 500, 4, "you will be a ninja");
        Course Math1    = new Course("MASTER Math1", nosser, 500, 4, "you will be a ninja");
        Course Statics  = new Course("MASTER Statics", nosser, 500, 4, "you will be a ninja");
        Course Dynamics = new Course("MASTER Dynamics", nosser, 500, 4, "you will be a ninja");
        Course Thermal  = new Course("MASTER Thermal", nosser, 500, 4, "you will be a ninja");
        Course Fields   = new Course("MASTER Fields", nosser, 500, 4, "you will be a ninja");
        Course Math2    = new Course("MASTER Math2", nosser, 500, 4, "you will be a ninja");


        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(java);
        courses.add(python);
        courses.add(Math1);
        courses.add(Statics);
        courses.add(Dynamics);
        courses.add(Thermal);
        courses.add(Fields);
        courses.add(Math2);


        Course.setStudents(std);
        Student.getCourses(courses);
        


        
        launch(args);
    }

   
}
