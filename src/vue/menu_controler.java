package vue;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class menu_controler {

    @FXML
    private Button bouton_admin;

    @FXML
    private Button bouton_enseignant;

    @FXML
    private Button bouton_etudiant;

    @FXML
    void bouton_enseignant_action(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(new File("scenes/Scene_login_teacher.fxml").toURL());
    	Parent root = loader.load();
		
    	Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	
    	stage.setScene(scene);

    	stage.show();
    }

    @FXML
    void bouton_etudiant_action(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(new File("scenes/Scene_login_student.fxml").toURL());
    	Parent root = loader.load();
		
    	Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	
    	stage.setScene(scene);

    	stage.show();
    }

    @FXML
    void bouton_admin_action(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(new File("scenes/Scene_Admin_choix.fxml").toURL());
    	Parent root = loader.load();
		
    	Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    	
    	stage.setScene(scene);

    	stage.show();
    }
    
}