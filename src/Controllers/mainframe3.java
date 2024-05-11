package Controllers;

import Utility.Init;
import accounts.Student;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mainframe3 {

    static int ClickCount = 0;

    @FXML
    private Text ExistedAccountMessage;

    @FXML
    private RadioButton Female;

    @FXML
    private ToggleGroup Gender;

    @FXML
    private Button Join;

    @FXML
    private RadioButton Male;

    @FXML
    private TextField Password;

    @FXML
    private TextField UserName;

    @FXML
    private TextField email;

    @FXML
    void Add_new_Student(MouseEvent event) {
        try {
            String gender = null ;
        if (Gender.getSelectedToggle().equals(Male))
        {
            gender = "Male";
        }
        else if (Gender.getSelectedToggle().equals(Female))
        {
            gender = "Female";
        }
            for(int i =0 ; i<Init.students.size() ; i++)                                     
            {
                if (  (Init.students.get(i).getUsername()).equals(UserName.getText()) ||  (Init.students.get(i).getPassword()).equals(Password.getText())   ||  (Init.students.get(i).getEmail()).equals(email.getText())     )
                {
                    ExistedAccountMessage.setVisible(true);
                    break;
                }
                else
                {
                    ExistedAccountMessage.setVisible(false);
                    Init.students.add(new Student(i, UserName.getText(), email.getText(), Password.getText(), gender));
                    Node source = (Node) event.getSource();
                    Stage stage = (Stage) source.getScene().getWindow();
                    stage.close();       
                }
            }
        } catch (Exception e) {
        showAlert(e);
            }
        
    }
    void showAlert(Exception e) { 
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("INVALID DATA");
        alert.setHeaderText("Look, Data Must Be Like");
        alert.setContentText("email with @  // pass > 8 // gender is a  must"+e.toString());
        alert.showAndWait();
    }

}

    

