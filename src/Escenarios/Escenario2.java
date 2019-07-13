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

/**
 *
 * @author rodri
 */

    import Juego.Cactus;
import Juego.Obstaculo;
import Juego.Pared;
import Juego.Puas;
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
public class Escenario2 extends AnimationTimer implements Vista  {
private Pane panel;
private Canvas tablero;
private GraphicsContext lapiz;
private Scene escena;
private Image suelo=new Image ("suelo_guerra.jpg");
private Obstaculo [] obstaculos;
    public Escenario2() {
    this.panel = new Pane();
    this.tablero = new Canvas(600,600);
    panel.getChildren().add(tablero);
    this.lapiz = 
              tablero.getGraphicsContext2D();
    lapiz.drawImage(suelo, 0, 0);
    lapiz.setFill(Color.BLACK);
    this.obstaculos=new Obstaculo[12];
    obstaculos[0]=new Pared (10,616,0,0);
    obstaculos[1]=new Pared (10,407,616,0);
    obstaculos[2]=new Pared (626,10,0,407);
    obstaculos[3]=new Pared (616,10,10,0);
    obstaculos[4]=new Pared (80,20,85,90);
    obstaculos[5]=new Pared (20,65,165,45);
    obstaculos[6]=new Pared (80,20,95,260);
    obstaculos[7]=new Pared (20,65,175,260);
    obstaculos[8]=new Pared (20,65,400,10);
    obstaculos[9]=new Pared(80,20,400,55);
    obstaculos[10]=new Pared (20,65,450,300);
    obstaculos[10]=new Pared (80,20,450,300);
    obstaculos[10]=new Pared (20,65,300,320);
    obstaculos[10]=new Pared (80,20,300,100);
    obstaculos[10]=new Pared (50,50,400,240);
    obstaculos[11]=new Puas ( 30, 100,500, 120);
    obstaculos[11]=new Puas ( 30, 80,190, 150);
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
