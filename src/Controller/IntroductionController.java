package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Title: HW6 
 * Date: 12/7/2018
 * @author sphein; oouk
 */
public class IntroductionController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    /**
     * When 'START' button is called, proceeds to next screen which asks for
     * player information
     * @param event
     * @throws IOException
     */
    @FXML
    public void handleActionButton(ActionEvent event) throws IOException {
        //FXMLLoader required file path location to load
        Parent playerScreen = FXMLLoader.load(getClass().getResource("/View/PlayerInfo.fxml"));

        Scene playerScene = new Scene(playerScreen);

        //this line will get the stage info
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setTitle("Player Information");
        window.setScene(playerScene);
        window.show();
    }
}
