package cs1302.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 * Represents a basic image viewer app.
 */
public class ImageApp extends Application {
    // Declare instance variables for all components of your application
    VBox vbox;
    Scene scene;

    public ImageApp() {
        System.out.println("2) Creating an instance of the ImageApp Application");

        // Initialize all instance variables.

        vbox = new VBox();
    } // ImageApp

    @Override
    public void init() {
        System.out.println("3) Executing the init method");

        // Connect the components to be consistent with the scene graph.

    } // init

    @Override
    public void start(Stage stage) {
        // Add the components to the scene and show the stage.
        // You may not need to modify this method.
        System.out.println("4) Executing the start method");

        scene = new Scene(vbox);

        // Add the scene to the stage
        stage.setScene(scene);
        stage.setTitle("cs1302 Image App!");
        stage.sizeToScene();
        stage.show();
        System.out.println("5) Waiting for the application to finish");
    } // main

    @Override
    public void stop() {
        // Typically used for application cleanup. Not needed for this application
        System.out.println("6) Executing the stop method");
    } // stop

} // ImageApp
