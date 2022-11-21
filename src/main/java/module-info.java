module com.playenglish {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    exports com.playenglish;
    opens com.playenglish.controllers to javafx.fxml;
}