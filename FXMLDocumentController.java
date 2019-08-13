/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Michael Davis
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private JFXTextField faculty;
    @FXML
    private JFXTextField department;
    @FXML
    private JFXTextField level;
    @FXML
    private JFXTextField course;
    @FXML
    private JFXButton saveButton;
    @FXML
    private JFXButton cancelButton;
    
    DatabaseHandler databasehandler ;
    private void handleButtonAction(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        databasehandler = new DatabaseHandler();
    }    

    @FXML
    private void savecourse(ActionEvent event) {
    }

    @FXML
    private void cancel(ActionEvent event) {
    }
    
}
