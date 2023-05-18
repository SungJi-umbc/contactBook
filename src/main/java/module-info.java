module com.example.contactbook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.contactbook to javafx.fxml;
    exports com.contactbook;
}