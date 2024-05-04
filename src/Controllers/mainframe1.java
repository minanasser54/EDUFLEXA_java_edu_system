package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Utility.Init;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mainframe1 {



  
    static Stage S;


    @FXML
    private Text Mismatch;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField HiddenPassword;

    @FXML
    private TextField WelcomeText;



    @FXML
    private  static Button Sign_up;


    @FXML
    private TextField usernameField;

 

  
    


    @FXML
    void Enter(MouseEvent event) throws InterruptedException 
    {
        Mismatch.setVisible(false); 
        String username = usernameField.getText();
        String Password = HiddenPassword.getText();

    
    for (int i = 0 ; i < Init.students.size() ; i++)
    {
        if (((String)Init.students.get(i).getUsername() ).equals((String)username) &&  ((String)Init.students.get(i).getPassword() ).equals((String)Password) )
        {
  
            Init.accessed_student_index = i;


            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            Thread.sleep(1000);
            stage.close();
            break;
            
        }       
        else  
        {       
            usernameField.clear() ; 
            HiddenPassword.clear() ;     
            Mismatch.setVisible(true);
            
        }

    }

    for (int j = 0 ; j < Init.Mentors.size() ; j++)
        {
            Mismatch.setVisible(false);

            
            if (((String)Init.Mentors.get(j).getUsername() ).equals((String)username) &&  ((String)Init.Mentors.get(j).getPassword() ).equals((String)Password) )
            {
                Init.accessed_Mentor_index = j;
                Stage FifthStage = new Stage();
                try
                {
                    FXMLLoader fxmloader4 = new FXMLLoader(getClass().getResource("/fxml/mainframe4.fxml"));
                    Parent root4 = fxmloader4.load();
                    Scene  scene4 = new Scene(root4);
            
                    FifthStage.setTitle("Forth Scene");
                    FifthStage.setScene(scene4);
                    FifthStage.setResizable(false);
                    FifthStage.show();
                }
                catch(Exception ex)        {  ex.printStackTrace(); }
                Node source = (Node) event.getSource();
                Stage stage = (Stage) source.getScene().getWindow();
                    
                try
                {
                    S.close();
                    stage.close();
                }
                catch(Exception e)  {System.out.println("An Exception Has Occured. it suppress Third Stage to show up until The Creation of new Student");}
                break;                
            }       
            else  
            {
                Mismatch.setVisible(true);
                
            }
        }
    
    

    }

    @FXML
    void NewAccount(MouseEvent event) {
        Mismatch.setVisible(false);


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////               Sign Up Stage             /////////////////////////////////////////////////////////////

        Stage ForthStage = new Stage();
            try
            {
                FXMLLoader fxmloader3 = new FXMLLoader(getClass().getResource("/fxml/mainframe3.fxml"));
                Parent root3 = fxmloader3.load();
                Scene  scene3 = new Scene(root3);
        
                ForthStage.setTitle("Forth Scene");
                ForthStage.setScene(scene3);
                ForthStage.setResizable(false);
                ForthStage.show();
            }
            catch(Exception ex)        {  ex.printStackTrace(); }
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();

        try
        {

            S.close();
            stage.close();


        }catch(Exception e)  { System.out.println("An Exception Has Occured. it suppress Third Stage to show up until The Creation of new Student");}

        
        

    }

    @FXML
    void initialize() {
        assert HiddenPassword != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'Untitled'.";
        assert usernameField != null : "fx:id=\"usernameField\" was not injected: check your FXML file 'Untitled'.";

    }

}





