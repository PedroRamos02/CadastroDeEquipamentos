module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens Aplicacao to javafx.fxml;
    exports Aplicacao;
}