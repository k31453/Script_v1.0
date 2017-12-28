package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button uAccount;

    @FXML
    private Button uDC;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException{
        Parent accountView = FXMLLoader.load(getClass().getResource("Account.fxml"));
        Scene accountScene = new Scene(accountView);
        //this line get stage information
        //new
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(accountScene);
        window.show();

    }

}
