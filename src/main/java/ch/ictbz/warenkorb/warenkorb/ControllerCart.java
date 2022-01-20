package ch.ictbz.warenkorb.warenkorb;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.LinkedList;

public class ControllerCart {
    @FXML
    private TextArea ordersTextArea;

    private LinkedList<OrderItem> orderedItems;
    private Stage stage;


    @FXML
    protected void onButtonCancel() {
        stage.close();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setItems(LinkedList<OrderItem> orderedItems) {
        this.orderedItems = orderedItems;
    }
    public void displayOrders() {
        String orders = "";
        for (int i = 0; i < orderedItems.size(); i++) {
            orders += orderedItems.get(i).getAmount();
            orders += " Ex.     ";
            orders += orderedItems.get(i).getProductName();
            orders += "\n";
        }
        ordersTextArea.setText(orders);
    }
}
