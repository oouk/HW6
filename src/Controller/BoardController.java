package Controller;

import Model.Board;
import Model.City;
import Model.Deck;
import Model.DestinationCards;
import Model.Player;
import Model.Route;
import Model.TrainTokens;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Circle;

/**
 * Title: HW6 Date: 12/7/2018
 *
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

    //variables
    private Board board = new Board();
    private Player P1;
    private Player P2;
    private int choice;
    private Scanner sc = new Scanner(System.in);
    private Deck aDeck = new Deck();
    private DestinationCards dc1;
    private DestinationCards dc2;
    private DestinationCards dc3;
    private boolean enoughTrainsa;
    private int numTrainCards = 0;
    private boolean drawInsideClaim = false;
    private int endCount = 0;
    private City c1 = new City("Oakland");
    private City c2 = new City("Hayward");
    private City c3 = new City("Vallejo");
    private City c4 = new City("Mountain View");
    private City c5 = new City("San Rafael");
    private City c6 = new City("San Francisco");

    /**
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //create cities and routes
        Route r1 = new Route("Red", 2, "R1");
        Route r2 = new Route("Blue", 5, "R2");
        Route r3 = new Route("Yellow", 4, "R3");
        Route r4 = new Route("Red", 2, "R4");
        Route r5 = new Route("Blue", 5, "R5");
        Route r6 = new Route("Yellow", 4, "R6");
        Route r7 = new Route("Green", 3, "R7");

        c1.addRoute(r2);
        c1.addRoute(r3);
        c1.addRoute(r7);

        c2.addRoute(r5);
        c2.addRoute(r6);
        c2.addRoute(r7);

        c3.addRoute(r4);
        c3.addRoute(r3);

        c4.addRoute(r1);
        c4.addRoute(r6);

        c5.addRoute(r5);
        c5.addRoute(r4);
        c5.addRoute(r7);

        c6.addRoute(r1);
        c6.addRoute(r2);

        //initiliaze decks and board
        aDeck.setTCDeck();
        aDeck.setDCDeck(c1, c2, c3, c4, c5, c6);
        aDeck.setFaceUp();
        board.initializeBoard(c1, c2, c3, c4, c5, c6);
        board.addroutes(r1, r2, r3, r4, r5, r6, r7);
    }

    /**
     * This method retrieves player data and updates the player board
     *
     * @param player1
     * @param player2
     */
    @FXML
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

    /**
     * ends the game, closes screen
     *
     * @param event
     */
    @FXML
    public void startGame(ActionEvent event) {
        //give players Train Car Cards
        P1.addTrainCarCards(aDeck.drawTrainCarCard(), aDeck.drawTrainCarCard());
        P2.addTrainCarCards(aDeck.drawTrainCarCard(), aDeck.drawTrainCarCard());
        Player playerNow = P1;

        //give players Destination Cards
        for (int i = 0; i < 2; i++) {
            display.setText(playerNow.getName() + ", here are your first two destination cards: ");
            dc1 = aDeck.drawDestinationCard();
            display.setText("First Destination Card: " + dc1.toString());
            dc2 = aDeck.drawDestinationCard();
            display.setText("Second Destination Card: " + dc2.toString());
            display.setText("Would you like to discard one?\n"
                    + "[1] : The First One\n"
                    + "[2] : The Second One\n"
                    + "[0] : None\n");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Ok!");
                    playerNow.addDestinationCards(dc1, dc2);
                    break;
                case 1:
                    playerNow.addDestinationCards(dc2);
                    aDeck.discardDestinationCard(dc1);
                    break;
                case 2:
                    playerNow.addDestinationCards(dc1);
                    aDeck.discardDestinationCard(dc2);
                    break;
                default:
                    break;
            }
            if (playerNow.getName().equalsIgnoreCase(P1.getName())) {
                P1 = playerNow;
                playerNow = P2;
            }
        }
    }

    /**
     * ends the game, closes screen
     *
     * @param event
     */
    @FXML
    public void endGame(ActionEvent event) {
        Platform.exit();
    }

    /**
     * draws two train cards
     *
     * @param event
     */
    @FXML
    public void drawTrainCard(ActionEvent event) {

    }

    /**
     * draws two destination cards
     *
     * @param event
     */
    @FXML
    public void drawDestinationCard(ActionEvent event) {

    }

    /**
     * claims a route
     *
     * @param event
     */
    @FXML
    public void claimRoute(ActionEvent event) {

    }
}
