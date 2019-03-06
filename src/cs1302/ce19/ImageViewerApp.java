package cs1302.ce19;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class ImageViewerApp extends Application {

    public void start(Stage stage) {

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        stage.setScene(scene);
        stage.setTitle("1302 Image Viewer!");
        stage.sizeToScene();
        stage.show();
	
    } // main

} // ImageViewerApp

