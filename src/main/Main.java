package main;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**author
 * @author EL IDRISSI Mehdi
 * @author TOLLOT Quentin*/


public class Main extends Application {

    public static void main(String[] args) throws SQLException {

    	
        launch(args);

    }

	@Override
	public void start(Stage stage) throws IOException {
		// TODO Auto-generated method stub
		stage.setTitle("Erasmus-TP");
		FXMLLoader loader = new FXMLLoader(new File("scenes/Scene_Menu.fxml").toURL());
        Parent root = loader.load();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}