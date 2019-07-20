/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenarios;


import Juego.Cactus;
import Juego.Obstaculo;
import Juego.Pared;
import javafx.animation.AnimationTimer;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.*;

/**
 *
 * @author usuario
 */
public class Escenario1 extends AnimationTimer implements Vista  {
private Pane panel;
private Canvas tablero;
private GraphicsContext lapiz;
private Scene escena;
private Image suelo=new Image ("Imagenes/suelo_guerra.jpg");
private Obstaculo [] obstaculos;
    public Escenario1() {
    this.panel = new Pane();
    this.tablero = new Canvas(755,580);
    panel.getChildren().add(tablero);
    this.lapiz = 
              tablero.getGraphicsContext2D();
    lapiz.drawImage(suelo, 0, 0);
    lapiz.setFill(Color.BLACK);
    this.obstaculos=new Obstaculo[16];
    obstaculos[0]=new Pared (80,25,0,170);
    obstaculos[1]=new Pared (150,25,0,350);
    obstaculos[2]=new Pared (25,195,170,0);
    obstaculos[3]=new Pared (25,500,280,250);
    obstaculos[4]=new Pared (25,350,450,0);
    obstaculos[5]=new Pared (80,25,675,375);
    obstaculos[6]=new Pared (150,25,605,250);
    obstaculos[7]=new Pared (25,250,560,375);
    obstaculos[8]=new Cactus (600,100,60);
    obstaculos[9]=new Cactus(320,490,60);
    obstaculos[10]=new Cactus (90,460,60);
    obstaculos[11]=new Cactus (375,30,60);
    obstaculos[12]=new Pared(20,560, 0, 0);
    obstaculos[13]=new Pared(735,20,0,0);
    obstaculos[14]=new Pared (20,580,735,0);
    obstaculos[15]=new Pared (755,20,0,560);
    
    for(Obstaculo obstaculo:this.obstaculos){
        if(obstaculo instanceof Pared){
        lapiz.setFill(new ImagePattern (obstaculo.getTextura()));
        lapiz.fillRect(obstaculo.getPosX(),obstaculo.getPosY(),((Pared) obstaculo).getWidth(), ((Pared) obstaculo).getHeight());
    }if(obstaculo instanceof Cactus){
        lapiz.setFill(new ImagePattern(obstaculo.getTextura()));
        lapiz.fillOval(obstaculo.getPosX(),obstaculo.getPosY(),((Cactus) obstaculo).getRadio(),((Cactus) obstaculo).getRadio());
        
    }
    
    }
    this.escena=new Scene(panel,755,580);
    }

@Override
    public Scene getScena() {
     return this.escena;
    }

    @Override
    public void handle(long now) {
    
       
    }
    
}




   

