package Genetic_Algorithms.TT;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Main extends Application {

    // static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chooseExcel.fxml"));
        primaryStage.setTitle("Stage 1");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        // ExtensionFilter ex1 = new ExtensionFilter("Excel Files", "*.xls", "*.xlsx");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
