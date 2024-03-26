module org.charlesoft.kwide {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.charlesoft.kwide to javafx.fxml;
    exports org.charlesoft.kwide;
}