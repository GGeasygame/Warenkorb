module ch.ictbz.warenkorb.warenkorb {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens ch.ictbz.warenkorb.warenkorb to javafx.fxml;
    exports ch.ictbz.warenkorb.warenkorb;
}