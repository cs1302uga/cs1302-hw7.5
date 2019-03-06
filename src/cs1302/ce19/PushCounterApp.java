
package cs1302.ce19;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

public class PushCounterApp extends Application {

    public void start(Stage stage) {

        Button button = new Button("Increment!");

        /*
          EventHandler<ActionEvent> handler = (ActionEvent event) -> {
          System.out.println(event + " clicked");
          };
          button.setOnAction(handler);
        */

        button.setOnAction(event -> System.out.println(event + " clicked"));
	
        HBox hbox = new HBox(8);
        hbox.getChildren().add(button);
        Scene scene = new Scene(hbox);

        stage.setScene(scene);
        stage.setTitle("PushCounterFX!");
        stage.sizeToScene();
        stage.show();
	
    } // main

} // PushCounterApp

