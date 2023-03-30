package cs1302.app;

import javafx.application.Application;

/**
 * Driver for the {@code ImageApp} class.
 */
public class ImageDriver {

    /**
     * Main entry-point into the application.
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        try {
            System.out.println("1) Start the JavaFX runtime.");
            Application.launch(ImageApp.class, args);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
            checkX11(e);
            System.exit(1);
        } // try
    } // main

    /**
     * Check and report if an exception is related to an X11 display issue.
     */
    private static void checkX11(Exception e) {
        String message = e.getMessage();
        boolean isUOE = e instanceof UnsupportedOperationException;
        boolean isRelatedToDisplay = message != null && message.contains("DISPLAY");
        if (isUOE && isRelatedToDisplay) {
            String line = "-".repeat(80);
            String note = ""
                + "Since an UnsupportedOperationException was thrown and it "
                + "mentions DISPLAY, this suggests that you either: \n"
                + "  1) did not enable X11/X-forwarding via -XYC when you logged "
                + "in via ssh; or \n"
                + "  2) your X11/X-forwarding connection has "
                + "timed out. \n"
                + "Please logout, then log back in using 'ssh -XYC' to "
                + "re-establish the X11 connection.";
            System.err.println(line);
            System.err.println(note);
            System.err.println(line);
        } // if
    } // checkX11

} // ImageDriver
