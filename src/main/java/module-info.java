module com.example.lasttestfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lasttestfx to javafx.fxml;
    exports com.example.lasttestfx;
}