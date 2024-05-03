

import Utility.Init;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        @Override
        public void start(Stage primaryStage) throws Exception {
           try
           {
           
            FXMLLoader fxmloader = new FXMLLoader(getClass().getResource("fxml/mainframe.fxml"));
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
/////////////////////////               Login Stage             //////////////////////////////////////////////////////////////

    Stage secondStage = new Stage();
    primaryStage.setOnHidden(event -> 
    {
            try {
                // Open the second scene in a new stage when the primary stage is closed 
                FXMLLoader fxmloader1 = new FXMLLoader(getClass().getResource("fxml/mainframe1.fxml"));
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


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////               Add Courses Stage             //////////////////////////////////////////////////////
    
    
    Stage ThirdStage = new Stage();
    secondStage.setOnHidden(event -> 
    {
                try {
                    // Open the second scene in a new stage when the primary stage is closed
                    FXMLLoader fxmloader2 = new FXMLLoader(getClass().getResource("fxml/mainframe2.fxml"));
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        }
        


   
    public static void main(String[] args) throws Exception {
       
        /* 
       
       
       
        Mentor nosser = new Mentor(0, "mina Nasser", "nosser@gmail.com", "123", "male");
        System.out.println(nosser.toString());
        System.out.println("=============================");
        Student zoz = new Student(1, "zyad magdy", "zoz@gmail.com", "123", "male");
        Student alfons = new Student(2, "mina antony", "alfons@gmail.com", "123", "male");
        Student mustafa = new Student(3, "mustafa hamada", "mustafa@gmail.com", "123", "male");
        Student ashraf = new Student(4, "ahmed ashraf", "ashraf@gmail.com", "123", "male");
        System.out.println("added num of students : " + Student.getNo_students());
        System.out.println("=============================");
        Course java = new Course("MASTER JAVA", nosser, 1200, 6, "you will be a ninja");
        Course python = new Course("MASTER Python", nosser, 300, 4, "you will be a ninja");
        Course php = new Course("MASTER php", nosser, 500, 4, "you will be a ninja");
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(java);
        courses.add(python);
        courses.add(php);
        ArrayList<Chapter> dumchapters = new ArrayList<Chapter>();
        for (int i = 0; i < 11; i++) {
            dumchapters.add(i, new Chapter(String.format("ch%o ", i)));
        }
        java.addChapters(dumchapters);
        python.addChapters(dumchapters);
        ArrayList<Chapter> tempchapters = new ArrayList<Chapter>();
        tempchapters = java.getChapters();

        java.getChapters().getLast().addLesson("this is lesson text", "this is lesson url");

        System.out.println(java.getChapters().getLast().getLessons().getLast().toString());

        //System.out.println(python.toString());
        python.getChapters().getFirst().addQuiz();
        python.getChapters().getFirst().getQuizs().getLast().addQuestion("q1", "a1");
        python.getChapters().getFirst().getQuizs().getLast().addQuestion("q2", "a2");
        System.out.println(python.getChapters().getFirst().getQuizs().getLast().toString());
        System.out.println(python.getChapters().getFirst().getQuizs().getLast().getQuestions());

        System.out.println("=============================");
        java.setPublished(true);
        python.setPublished(true);
        java.enroll(ashraf);
        python.enroll(zoz);
        java.enroll(zoz);
        zoz.complete(python);
        zoz.complete(java);


        
        // System.out.println(zoz.getFinishedcourses());
        // System.out.println("=============================");
        // courses = Course.sortCourses(courses, 't');
        // System.out.println(courses);
        // courses = Course.sortCourses(courses, 'p');
        // System.out.println(courses);
        // courses = Course.sortCourses(courses, 'd');
        // System.out.println(courses);
        // courses = Course.sortCourses(courses, 'c');
        // System.out.println(courses);
        // courses = Course.sortCourses(courses, 's');
        // System.out.println(courses);



*/

        
        Init I = new Init();

        I.set_Init_Students();
        I.set_Init_Courses();


        launch(args);
    }

}
