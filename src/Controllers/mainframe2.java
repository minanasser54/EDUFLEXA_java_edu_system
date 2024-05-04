package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Utility.Init;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mainframe2 {
    static int ClickCount = 0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Add;

    @FXML
    private Button Remove;

    @FXML
    private Button Finish;


    @FXML
    private ListView<String> Available_Courses;

    @FXML
    private ListView<String> Courses_Enrolled;

    @FXML
    private Text Email;

    @FXML
    private Text Name;

    @FXML
    private Text text1;


    @FXML
    
    void Finish(MouseEvent event) {


        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        mainframe1.S = stage;

        stage.close();


    }

    @FXML
    void RemoveCourse(MouseEvent event) throws InterruptedException {
        if (ClickCount == 1)
        {
        }
        else
        {
            int selectID = Courses_Enrolled.getSelectionModel().getSelectedIndex();

            for (int i = 0 ; i<Init.students.get(Init.accessed_student_index).getNo_Courses() ; i++)
            {            
                if ((Init.students.get(Init.accessed_student_index).getEnrolledcourses().get(i).getTitle() ).equals(Courses_Enrolled.getItems().get(selectID)) )
                {
                    Init.students.get(Init.accessed_student_index).removeEnrolledcourses(Init.students.get(Init.accessed_student_index).getEnrolledcourses().get(i));

                    //Remove it from Courses enrolledcourses in the Init
                    break;
                }
            }
            
            Courses_Enrolled.getItems().remove(selectID);          //Remove it from Courses Courses_Enrolled in the Window
            System.out.println("==================================");
            System.out.println("Student "+Init.students.get(Init.accessed_student_index).getUsername()+" Has Enorlled The Following Courses");
            System.out.println(Init.students.get(Init.accessed_student_index).getEnrolledcourses());
            System.out.println("==================================");


        }
    }



    @FXML
    void AddCourses(MouseEvent event) {
        ClickCount += event.getClickCount();

        if (ClickCount == 1)
        {
            Remove.setVisible(true);
            Finish.setVisible(true);
  

            for(int i =0 ; i<Init.Availablecourses.size() ; i++)                                        // print The Init Primary Courses
            {
                System.out.println(Init.Availablecourses.get(i).getTitle());
                Available_Courses.getItems().add(Init.Availablecourses.get(i).getTitle());
                System.out.println("===================================");
            }
            
            for(int j = 0 ; j<Init.students.get(Init.accessed_student_index).getNo_Courses() ; j++)   //print what student have enrolled before
            {
                Courses_Enrolled.getItems().add(Init.students.get(Init.accessed_student_index).getEnrolledcourses().get(j).getTitle()); 
            }

            Add.setText("Add");
        }
        else
        {
            int selectID = Available_Courses.getSelectionModel().getSelectedIndex();
            Courses_Enrolled.getItems().add(Init.Availablecourses.get(selectID).getTitle());   

            // add The selected Course from list in Available_Courses to Courses_Enrolled 

            for (int i = 0 ; i<Init.Availablecourses.size() ; i++)
            {            
                if ((Init.Availablecourses.get(i).getTitle() ).equals(Init.Availablecourses.get(selectID).getTitle()) )
                {
                    Init.students.get(Init.accessed_student_index).setEnrolledcourses(Init.Availablecourses.get(i));
                    break;
                }
     
            }            
        }
        System.out.println("=====================================");
        System.out.println("Student "+Init.students.get(Init.accessed_student_index).getUsername()+" Has Enorlled The Following Courses");
        System.out.println(Init.students.get(Init.accessed_student_index).getEnrolledcourses());
        System.out.println("=====================================");


    }

    @FXML
    void initialize() {
        Name.setText(Init.students.get(Init.accessed_student_index).getUsername());
        Email.setText(Init.students.get(Init.accessed_student_index).getEmail());
        assert Add != null : "fx:id=\"Add\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Available_Courses != null : "fx:id=\"Available_Courses\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Courses_Enrolled != null : "fx:id=\"Courses_Enrolled\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Email != null : "fx:id=\"Email\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Name != null : "fx:id=\"Name\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'mainframe2.fxml'.";

    }

}
