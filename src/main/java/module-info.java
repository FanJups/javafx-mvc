module com.javafx.mvc {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;
	requires java.base;
	requires javafx.graphics;

    opens com.javafx.mvc to javafx.fxml;
    exports com.javafx.mvc;
}