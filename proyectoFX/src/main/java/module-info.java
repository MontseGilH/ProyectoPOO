module com.example.proyectopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectopoo to javafx.fxml;
    exports com.example.proyectopoo;
}