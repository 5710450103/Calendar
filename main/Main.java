//Khanathit Phattarapanich 5710450103

package ku.sci.cs.myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * Hello world!
 *
 */
public class Main extends Application
{
    public static void main( String[] args )
    {
    	launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("My Events");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static Window getPrimaryStage() {
		// TODO Auto-generated method stub
		return null;
	}
}
