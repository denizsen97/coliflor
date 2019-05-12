package UI.ui_Place;

import ProductManager.Product.BookRental.BookUser;
import ProductManager.Product.PlaceRental.PlaceUser;
import UI.RentalData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PlaceAccountController implements Initializable {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    private Scene ui_Place;
    private String username;
    @FXML
    private Text userName, userSurname, userPhone, userEmail, userAddress;

    public Scene initializeScene(String fxmlName) throws java.io.IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlName));
        Parent root = (Parent)loader.load();
        return new Scene(root, WIDTH,HEIGHT);
    }

    public void backPlaceMainPage(ActionEvent event) throws Exception
    {
        ui_Place = initializeScene("ui_Place.fxml");
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.setScene(ui_Place);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        BufferedReader Buff = null;
        try {
            Buff = new BufferedReader(new FileReader("../logs.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            username = ( Buff.readLine());
            System.out.println(username);
        } catch (IOException e) {
            e.printStackTrace();
        }
        RentalData data = new RentalData();
        PlaceUser user = RentalData.returnPlaceUser(username);
        userName.setText(user.getUsername());
        userSurname.setText(user.getName());
        userPhone.setText(user.getPhoneNumber()+"");
        userEmail.setText(user.getEmail());
        userAddress.setText(user.getAddress());
    }
}
