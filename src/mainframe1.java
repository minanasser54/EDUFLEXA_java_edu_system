import java.net.URL;
import java.util.ResourceBundle;

import accounts.Student;
import Material.Course;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;

public class mainframe1 {

 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField HiddenPassword;

    @FXML
    private TextField WelcomeText;



    @FXML
    private CheckBox show;

    @FXML
    private TextField usernameField;

  
    


    @FXML
    void Enter(MouseEvent event) throws InterruptedException {
        
    String username = usernameField.getText();
    String Password = HiddenPassword.getText();
    for (int i = 0 ; i < Course.studentsCount() ; i++)
    {
        if (((String)Course.students.get(i).getUsername() ).equals((String)username) &&  ((String)Course.students.get(i).getPassword() ).equals((String)Password) )
        {
            usernameField.setText("Correct");
            HiddenPassword.setText("Correct");
            Course.index_selector = i;


            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            Thread.sleep(1000);
            stage.close();
            break;
            
        }       
        else  
        {
            usernameField.setText("False");
            HiddenPassword.setText("False");
        }

    }
    
    

    }

    @FXML
    Student NewAccount(MouseEvent event) {

        return null;

    }

    @FXML
    void initialize() {
        assert HiddenPassword != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'Untitled'.";
        assert usernameField != null : "fx:id=\"usernameField\" was not injected: check your FXML file 'Untitled'.";

    }

}





