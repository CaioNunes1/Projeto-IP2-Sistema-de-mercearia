module com.example.projetoip2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.projetoip2 to javafx.fxml;
    exports com.example.projetoip2.GUI;
    opens com.example.projetoip2.GUI to javafx.fxml;
}