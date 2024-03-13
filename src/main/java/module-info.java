module org.fcd.practica21di {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.fcd.practica21di to javafx.fxml;
    exports org.fcd.practica21di;
}