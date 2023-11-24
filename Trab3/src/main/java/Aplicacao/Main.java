package Aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("Cadastro de Equipamentos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}