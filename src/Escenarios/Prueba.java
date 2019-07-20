/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenarios;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Prueba extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Escenario2 escena=new Escenario2();
        Scene esc=escena.getScena();
        primaryStage.setScene(esc);
        primaryStage.show();
    }
    
}
