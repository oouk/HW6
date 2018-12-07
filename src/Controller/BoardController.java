package Controller;

import Model.Player;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Circle;

/**
 * Title: HW6
 * Date: 12/7/2018
 * @author sphein; oouk
 */
public class BoardController implements Initializable {

    @FXML
    private Button endGame;
    @FXML
    private Button trainCard;
    @FXML
    private Button destinationCard;
    @FXML
    private Button claimRoute;
    @FXML
    private TextArea display;
    @FXML
    private Label nameP1;
    @FXML
    private Label scoreP1;
    @FXML
    private Label tokenP1;
    @FXML
    private Label nameP2;
    @FXML
    private Label scoreP2;
    @FXML
    private Label tokenP2;
    @FXML
    private Circle SF;
    @FXML
    private Circle MV;
    @FXML
    private Circle H;
    @FXML
    private Circle O;
    @FXML
    private Circle V;
    @FXML
    private Circle SR;
    
    private Player P1;
    private Player P2;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Platform.runLater(() -> display.setText("Welcome! Step 1."));
    }
    
    /**
    * This method retrieves player data and updates the player board
    * @param player1
    * @param player2
    */
    public void setScoreBoard(Player player1, Player player2) {

        this.P1 = player1;
        this.P2 = player2;
        
        this.nameP1.setText(this.P1.getName());
        this.scoreP1.setText(this.P1.getPoints());
        this.tokenP1.setText(this.P1.getTrains());

        this.nameP2.setText(this.P2.getName());
        this.scoreP2.setText(this.P2.getPoints());
        this.tokenP2.setText(this.P2.getTrains());
    }
}
