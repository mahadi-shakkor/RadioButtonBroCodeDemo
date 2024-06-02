module com.oop.mahadi.radiobuttonbrocodedemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.radiobuttonbrocodedemo to javafx.fxml;
    exports com.oop.mahadi.radiobuttonbrocodedemo;
}