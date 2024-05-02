package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Material.Course;
import Utility.Init;
import accounts.Student;
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
            System.out.println(selectID);

            for (int i = 0 ; i<Init.enrolledcourses.size() ; i++)
            {            
                if ((Init.enrolledcourses.get(i).getTitle() ).equals(Courses_Enrolled.getItems().get(selectID)) )
                {
                    Init.removeEnrolledcourses(Init.enrolledcourses.get(i));          //Remove it from Courses enrolledcourses in the Init
                    break;
                }
     
            }  

            
            Courses_Enrolled.getItems().remove(selectID);          //Remove it from Courses Courses_Enrolled in the Window
            System.out.println("==================================");
            System.out.println(Init.enrolledcourses);


        }
    }



    @FXML
    void AddCourses(MouseEvent event) {
        ClickCount += event.getClickCount();

        if (ClickCount == 1)
        {
            Remove.setVisible(true);
            Finish.setVisible(true);
            Name.setText(Init.students.get(Init.accessed_student_index).getUsername());
            Email.setText(Init.students.get(Init.accessed_student_index).getEmail());

            for(int i =0 ; i<Init.Availablecourses.size() ; i++)
            {
                System.out.println(Init.Availablecourses.get(i).getTitle());
                Available_Courses.getItems().add(Init.Availablecourses.get(i).getTitle());
                System.out.println("===================================");
            }
            
            for(int j = 0 ; j<Init.enrolledcourses.size() ; j++)   //print what student have enrolled before
            {
                Courses_Enrolled.getItems().add(Init.enrolledcourses.get(j).getTitle()); 
            }

            Add.setText("Add");
        }
        else
        {
            int selectID = Available_Courses.getSelectionModel().getSelectedIndex();
            Courses_Enrolled.getItems().add(Init.Availablecourses.get(selectID).getTitle());   // add The selected Course from list in Enrolledcourses in Init 

            for (int i = 0 ; i<Init.Availablecourses.size() ; i++)
            {            
                if ((Init.Availablecourses.get(i).getTitle() ).equals(Init.Availablecourses.get(selectID).getTitle()) )
                {
                    Init.setEnrolledcourses(Init.Availablecourses.get(i));
                    break;
                }
     
            }            
        }
        System.out.println("=====================================");
        System.out.println(Init.enrolledcourses);
       

    }

    @FXML
    void initialize() {
        assert Add != null : "fx:id=\"Add\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Available_Courses != null : "fx:id=\"Available_Courses\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Courses_Enrolled != null : "fx:id=\"Courses_Enrolled\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Email != null : "fx:id=\"Email\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert Name != null : "fx:id=\"Name\" was not injected: check your FXML file 'mainframe2.fxml'.";
        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'mainframe2.fxml'.";

    }

}
