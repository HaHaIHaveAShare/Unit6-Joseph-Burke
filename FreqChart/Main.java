import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application  {
    public static void main (String [] args)  {
	Application.launch(args);
    }
    private Scene scene;
    @Override
    public void start(Stage stage) throws IOException  {
        // Create the Pane and all Details
	Parent chart = FXMLLoader.load(getClass().getResource("chart.fxml"));
        scene = new Scene (chart);
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Frequency Chart");
	//stage.setResizable(false);
	stage.sizeToScene();
        // Display the Stage
        stage.show();
    }
}
