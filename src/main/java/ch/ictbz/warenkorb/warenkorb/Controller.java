package ch.ictbz.warenkorb.warenkorb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.LinkedList;

public class Controller {
    @FXML
    private TextField productTextField;
    @FXML
    private TextField amountTextField;

    private LinkedList<OrderItem> orderedItems = new LinkedList<OrderItem>();

    @FXML
    protected void onHyperLinkDisplayCart() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("viewCart.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        ControllerCart controller = fxmlLoader.getController();
        controller.setStage(stage);
        controller.setItems(orderedItems);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        controller.displayOrders();
    }

    @FXML
    protected void onButtonAddToCart() {
        OrderItem item = new OrderItem();
        item.setProductName(productTextField.getText());
        item.setAmount(Integer.parseInt(amountTextField.getText()));
        orderedItems.add(item);
    }
}