package Controller;

import Model.Player;
import Model.TrainTokens;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Title: HW6
 * Date: 12/9/2018
 * @author sphein; oouk
 */
public class PlayerInfoController implements Initializable {

    @FXML
    private TextField nameP1;
    @FXML
    private ChoiceBox<?> colorP1;
    @FXML
    private TextField nameP2;
    @FXML
    private ChoiceBox<?> colorP2;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //populate choices for color section
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Orange");
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Purple");
        colorList.add("Black");

        ObservableList obList = FXCollections.observableList(colorList);
        colorP1.getItems().clear();
        colorP1.setItems(obList);

        colorP2.getItems().clear();
        colorP2.setItems(obList);
    }

    /**
     * When this method is called, it will pass the selected Player object to
     * the board view
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void changeSceneToBoardView(ActionEvent event) throws IOException {

        //checks to see if player name has been entered before proceeding
        do {
            if ((this.nameP1.getText().isEmpty()) || (this.nameP2.getText().isEmpty())) {
                System.out.println("Please enter player(s) name.");
                break;
            } else if (((this.colorP1.getSelectionModel().isEmpty() || (this.colorP2.getSelectionModel().isEmpty())))) {
                System.out.println("Please select a color for each player.");
                break;
            } else if (this.colorP1.getSelectionModel().getSelectedItem().toString().equals(this.colorP2.getSelectionModel().getSelectedItem().toString())) {
                System.out.println("Please select a unique color for each player.");
                break;
            } else {
                //FXMLLoader required file path location to load
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/View/Board.fxml"));
                Parent root = (Parent) loader.load();

                //retrieve player name and color
                String nP1 = this.nameP1.getText();
                String cP1 = this.colorP1.getSelectionModel().getSelectedItem().toString();

                TrainTokens trainColorP1 = new TrainTokens(cP1);
                Player P1 = new Player(nP1, trainColorP1);

                String nP2 = this.nameP2.getText();
                String cP2 = this.colorP2.getSelectionModel().getSelectedItem().toString();
                TrainTokens trainColorP2 = new TrainTokens(cP2);
                Player P2 = new Player(nP2, trainColorP2);

                //access the controller and call a method
                BoardController controller = loader.<BoardController>getController();
                controller.setScoreBoard(P1, P2);

                //this line will get the stage info
                Scene newScene = new Scene(root);

                Stage newStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                newStage.setTitle("Board Game");
                newStage.setScene(newScene);
                newStage.show();
            }
        } while (true);
    }
}
