package View;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Title: HW6
 * Date: 12/9/2018
 * @author sphein; oouk
 */
public class Game extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent playerInfo = FXMLLoader.load(getClass().getResource("Introduction.fxml"));
        Scene playerScene = new Scene(playerInfo);
            
        primaryStage.setTitle("Introduction");
        primaryStage.setScene(playerScene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
