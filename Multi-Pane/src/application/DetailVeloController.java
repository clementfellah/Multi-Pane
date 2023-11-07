package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class DetailVeloController {

    @FXML
    private ImageView imageVelo;

    @FXML
    private RadioButton rbYes;

    @FXML
    private ToggleGroup rb;

    @FXML
    private RadioButton rbNo;

    @FXML
    private Button colorOne;

    @FXML
    private Button colorTwo;

    @FXML
    private Button colorThree;

    @FXML
    private Button backButton;

    @FXML
    private Label priceLabel;
    
    @FXML
    private Button resetButton;
    
    @FXML
    private Label additionalPriceLabel;

    private Image selectedImage;
    private String selectedVelo;
    private double basePriceCourse = 849.99;
    private double basePriceVille = 699.99;
    private double colorPrice = 0;
    private boolean colorSelected = false;

    public void setSelectedImage(Image image) {
        this.selectedImage = image;
        imageVelo.setImage(selectedImage);
    }

    public void setSelectedVelo(String veloType) {
        this.selectedVelo = veloType;
        if (veloType.equals("course")) {
            priceLabel.setText("Prix : €" + basePriceCourse);
        } else if (veloType.equals("ville")) {
            priceLabel.setText("Prix : €" + basePriceVille);
        }
        resetColorButtons();
    }

    public void onClickColorOne(ActionEvent event) {
        double totalPrice = 0.0;

        if (this.selectedVelo.equals("course")) {
            this.colorPrice = 80;
            totalPrice = basePriceCourse + colorPrice;
            File file = new File("src/application/assets/course/bmc-purple.jpg");
            Image newImage = new Image(file.toURI().toString());
            imageVelo.setImage(newImage);
        } else if (this.selectedVelo.equals("ville")) {
            this.colorPrice = 80;
            totalPrice = basePriceVille + colorPrice;
            File file = new File("src/application/assets/ville/villeViolet.jpg");
            Image newImage = new Image(file.toURI().toString());
            imageVelo.setImage(newImage);
        }
        additionalPriceLabel.setText("Prix supplémentaire : " + colorPrice + "€");
        priceLabel.setText("Prix : €" + totalPrice);
    }

    public void onClickColorTwo(ActionEvent event) {
        double totalPrice = 0.0;

        if (this.selectedVelo.equals("course")) {
            this.colorPrice = 60;
            totalPrice = basePriceCourse + colorPrice;
            File file = new File("src/application/assets/course/bmc-yellow.jpg");
            Image newImage = new Image(file.toURI().toString());
            imageVelo.setImage(newImage);
        } else if (this.selectedVelo.equals("ville")) {
            this.colorPrice = 60;
            totalPrice = basePriceVille + colorPrice;
            File file = new File("src/application/assets/ville/villeJaune.jpg");
            Image newImage = new Image(file.toURI().toString());
            imageVelo.setImage(newImage);
        }
        additionalPriceLabel.setText("Prix supplémentaire : " + colorPrice + "€");
        priceLabel.setText("Prix : €" + totalPrice);
    }

    public void onClickColorThree(ActionEvent event) {
        double totalPrice = 0.0;

        if (this.selectedVelo.equals("course")) {
            this.colorPrice = 120;
            totalPrice = basePriceCourse + colorPrice;
            File file = new File("src/application/assets/course/bmc-red.jpg");
            Image newImage = new Image(file.toURI().toString());
            imageVelo.setImage(newImage);
        } else if (this.selectedVelo.equals("ville")) {
            this.colorPrice = 120;
            totalPrice = basePriceVille + colorPrice;
            File file = new File("src/application/assets/ville/villeRouge.jpg");
            Image newImage = new Image(file.toURI().toString());
            imageVelo.setImage(newImage);
        }
        additionalPriceLabel.setText("Prix supplémentaire : " + colorPrice + "€");
        priceLabel.setText("Prix : €" + totalPrice);
    }

    
    private void resetColorButtons() {
        colorOne.setDisable(false);
        colorTwo.setDisable(false);
        colorThree.setDisable(false);
        colorSelected = false;
    }

    public void onBackButton(ActionEvent event) throws IOException {
        resetColorButtons();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Velo.fxml"));
        Parent vueVelo = loader.load();
        Scene sceneVelo = new Scene(vueVelo);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(sceneVelo);
        stage.show();
    }
    
    public void onResetButton(ActionEvent event) {

        if (this.selectedVelo.equals("course")) {
            this.colorPrice = 0;
            priceLabel.setText("Prix : €" + basePriceCourse);
        } else if (this.selectedVelo.equals("ville")) {
            this.colorPrice = 0;
            priceLabel.setText("Prix : €" + basePriceVille);
        }
        additionalPriceLabel.setText("Prix supplémentaire : " + colorPrice + "€");
        colorSelected = false;
    }

}
