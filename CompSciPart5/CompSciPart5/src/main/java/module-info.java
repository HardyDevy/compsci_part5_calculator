module com.example.compscipart5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.compscipart5 to javafx.fxml;
    exports com.example.compscipart5;
}