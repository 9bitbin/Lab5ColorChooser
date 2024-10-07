module himal.lab5colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens himal.lab5colorchooser to javafx.fxml;
    exports himal.lab5colorchooser;
}