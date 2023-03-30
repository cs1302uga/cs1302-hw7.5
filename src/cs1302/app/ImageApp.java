package cs1302.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 * Represents a basic image viewer app.
 */
public class ImageApp extends Application {

    // Declare instance variables for the components and other shared objects
    // of your application so that they can be accessed from instance our
    // instance methods -- private or package private visibility can be used,
    // as appropriate.

    Stage stage;
    Scene scene;
    VBox root;

    /**
     * Construct an {@code ImageApp} object.
     */
    public ImageApp() {
        System.out.println("2) Creating an instance of the ImageApp Application");
        // 1) Setup instance variables for the stage and scene so that we can
        // access them from other instance methods; an app MUST ONLY construct
        // a Scene or a Stage object in the start(Stage) method or after the
        // start(Stage) method is called -- therefore, we will reassign these
        // later in the start(Stage) method.
        this.stage = null;
        this.scene = null;
        // 2) Construct other nodes / components and objects.
        this.root = new VBox();
    } // ImageApp

    @Override
    public void init() {
        System.out.println("3) Executing the init method");
        // 1) Initialize the expected scene graph / structure.
        // 2) initialize and associate event handlers.
    } // init

    @Override
    public void start(Stage stage) {
        System.out.println("4) Executing the start method");
        this.stage = stage;
        this.scene = scene = new Scene(root);
        this.stage.setScene(scene);
        this.stage.setTitle("cs1302 ImageApp!");
        this.stage.sizeToScene(); // resize stage (window) to match scene size
        this.stage.show(); // actually show the stage (window)
        System.out.println("5) Waiting for the application to finish");
    } // main

    @Override
    public void stop() {
        // This method is typically used for application cleanup. It is not
        // needed for this application, but we included it so that you can
        // see that it does get called as part of the JavaFX application
        // life-cycle.
        System.out.println("6) Executing the stop method");
    } // stop

} // ImageApp
