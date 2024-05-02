import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Node;



public class mainframe {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void CloseTab(MouseEvent event) {
        
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();


    }

    @FXML
    void initialize() {

    }
    

}
