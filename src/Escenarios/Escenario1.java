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
private Image suelo=new Image ("suelo_guerra.jpg");
private Obstaculo [] obstaculos;
    public Escenario1() {
    this.panel = new Pane();
    this.tablero = new Canvas(600,600);
    panel.getChildren().add(tablero);
    this.lapiz = 
              tablero.getGraphicsContext2D();
    lapiz.drawImage(suelo, 0, 0);
    lapiz.setFill(Color.BLACK);
    this.obstaculos=new Obstaculo[12];
    obstaculos[0]=new Pared (10,50,0,100);
    obstaculos[1]=new Pared (10,80,0,350);
    obstaculos[2]=new Pared (150,10,80,0);
    obstaculos[3]=new Pared (350,10,250,350);
    obstaculos[4]=new Pared (350,10,350,0);
    obstaculos[5]=new Pared (150,10,620,500);
    obstaculos[6]=new Pared (10,50,550,250);
    obstaculos[7]=new Pared (150,10,620,450);
    obstaculos[8]=new Cactus (500,100,25);
    obstaculos[9]=new Cactus(310,35,25);
    obstaculos[10]=new Cactus (290,570,25);
    obstaculos[11]=new Cactus (375,30,25);
    
    for(Obstaculo obstaculo:this.obstaculos){
        if(obstaculo instanceof Pared){
        lapiz.fillRect(obstaculo.getPosX(),obstaculo.getPosY(),((Pared) obstaculo).getWidth(), ((Pared) obstaculo).getHeight());
    }if(obstaculo instanceof Cactus){
        lapiz.fillOval(obstaculo.getPosX(),obstaculo.getPosY(),((Cactus) obstaculo).getRadio(),((Cactus) obstaculo).getRadio());
    }
    }
    }

@Override
    public Scene getScena() {
     return this.escena;
    }

    @Override
    public void handle(long now) {
    
       
    }
    
}




   

