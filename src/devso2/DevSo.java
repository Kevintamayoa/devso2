/*
 * To change this license header, choose License Headers in Project Properate file, choose Tools | Templatesties.
 * To change this templ
 * and open the template in the editor.
 */
package devso2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author macbook
 */
public class DevSo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       login o = new login();
       o.setVisible(true);
       //setVisible(false); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
