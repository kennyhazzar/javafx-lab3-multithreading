module com.example.javafxlab3multithreading {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxlab3multithreading to javafx.fxml;
    exports com.example.javafxlab3multithreading;
}