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
import javafx.scene.paint.ImagePattern;
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
private Image suelo=new Image ("Imagenes/suelo_guerra2.jpeg");
private Obstaculo [] obstaculos;
    public Escenario2() {
    this.panel = new Pane();
    this.tablero = new Canvas(626,417);
    panel.getChildren().add(tablero);
    this.lapiz = 
              tablero.getGraphicsContext2D();
    lapiz.drawImage(suelo, 0, 0);
    lapiz.setFill(Color.BLACK);
    lapiz.fillRect(0,0,10,616);
    lapiz.fillRect(616,0,10,407);
    lapiz.fillRect(0,407,626,10);
    lapiz.fillRect(10,0,616,10);
    this.obstaculos=new Obstaculo[13];
    obstaculos[0]=new Pared (80,20,85,90);
    obstaculos[1]=new Pared (20,65,165,45);
    obstaculos[2]=new Pared (80,20,95,260);
    obstaculos[3]=new Pared (20,65,175,260);
    obstaculos[4]=new Pared (20,65,400,10);
    obstaculos[5]=new Pared(80,20,400,55);
    obstaculos[6]=new Pared (20,65,450,300);
    obstaculos[7]=new Pared (80,20,450,300);
    obstaculos[8]=new Pared (20,65,300,320);
    obstaculos[9]=new Pared (80,20,300,100);
    obstaculos[10]=new Pared (50,50,400,240);
    obstaculos[11]=new Puas ( 30, 100,500, 120);
    obstaculos[12]=new Puas ( 30, 80,190, 150);
    for(Obstaculo obstaculo:this.obstaculos){
        if(obstaculo instanceof Pared){
        lapiz.setFill(new ImagePattern (obstaculo.getTextura()));
        lapiz.fillRect(obstaculo.getPosX(),obstaculo.getPosY(),((Pared) obstaculo).getWidth(), ((Pared) obstaculo).getHeight());
    }if(obstaculo instanceof Puas){
        lapiz.setFill(new ImagePattern (obstaculo.getTextura()));
        lapiz.fillOval(obstaculo.getPosX(),obstaculo.getPosY(),((Puas) obstaculo).getWidth(),((Puas) obstaculo).getHeight());
    }
    }
    this.escena=new Scene(panel,626,417);
    }
Shape obstaculoA = new Rectangle(0,0,10,616);
Shape obstaculoB = new Rectangle(616,0,10,407);
Shape obstaculoC = new Rectangle(0,407,626,10);
Shape obstaculoD = new Rectangle(10,0,616,10);
Shape obstaculo1 = new Rectangle(80,20,85,90);
Shape obstaculo2 = new Rectangle(20,65,165,45);
Shape obstaculo3 = new Rectangle(80,20,95,260);
Shape obstaculo4 = new Rectangle(20,65,175,260);
Shape obstaculo5 = new Rectangle(20,65,400,10);
Shape obstaculo6 = new Rectangle(80,20,400,55);
Shape obstaculo7 = new Rectangle(20,65,450,300);
Shape obstaculo8 = new Rectangle(80,20,450,300);
Shape obstaculo9 = new Rectangle(20,65,300,320);
Shape obstaculo10 = new Rectangle(80,20,300,100);
Shape obstaculo11 = new Rectangle( 50,50,400,240);
Shape obstaculo12 = new Rectangle(30, 100,500, 120);
Shape obstaculo13 = new Rectangle(30, 80,190, 150);



@Override
    public Scene getScena() {
     return this.escena;
    }

    @Override
    public void handle(long now) {
    
       
    }
}
