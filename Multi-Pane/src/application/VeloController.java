package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class VeloController {

    @FXML 
    private ImageView veloCourse;

    @FXML
    private ImageView veloVille;

    @FXML
    void clickOnVeloCourse(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailVelo.fxml"));
        Parent vueVeloCourse = loader.load();

        DetailVeloController detailController = loader.getController();
        detailController.setSelectedImage(veloCourse.getImage());    
        detailController.setSelectedVelo("course");

        Scene sceneVeloCourse = new Scene(vueVeloCourse);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(sceneVeloCourse);
        stage.show();
    }

    @FXML
    void clickOnVeloVille(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailVelo.fxml"));
        Parent vueVeloVille = loader.load();

        DetailVeloController detailController = loader.getController();       
        detailController.setSelectedImage(veloVille.getImage());       
        detailController.setSelectedVelo("ville");

        Scene sceneVeloVille = new Scene(vueVeloVille);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(sceneVeloVille);
        stage.show();
    }

}
