package himal.lab5colorchooser;

/**
 * Himal Shrestha
 * R01955141
 * CSC 325 - Software Engineering
 * LAB 5 Color Chooser Part 2
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ColorChooser extends Application {

    /**
     * The start method is the main entry point for JavaFX applications.
     * It loads the FXML file and sets up the primary stage (window) for the app.
     *
     * @param stage the primary stage for this application, onto which
     *              the application scene can be set.
     * @throws Exception if the FXML file cannot be loaded.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML layout for the application from the file "ColorChooser.fxml"
        Parent root = FXMLLoader.load(getClass().getResource("ColorChooser.fxml"));

        // Create a new Scene with the loaded FXML layout
        Scene scene = new Scene(root);

        // Set the title of the application window
        stage.setTitle("Himal's Epic Color Chooser");

        // Attach the Scene to the Stage
        stage.setScene(scene);

        // Display the Stage (window) to the user
        stage.show();
    }

    /**
     * The main method serves as the entry point for the application.
     * It calls the launch method, which in turn calls the start method.
     *
     * @param args the command-line arguments passed to the program.
     */
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
