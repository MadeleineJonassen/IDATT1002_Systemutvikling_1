package no.ntnu.idatt1002.demo.homePage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HomePage extends Application {
  @Override
  public void start(Stage stage) throws IOException {

    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/SpendWiseHomePage.fxml")));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}