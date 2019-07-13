/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import javafx.scene.image.Image;
import javafx.scene.shape.Shape;

/**
 *
 * @author usuario
 */
public class Tanque {
    private int vida;
    private String color;
    private Image forma;
    private Shape hitbox;
    private Weapon arma;
    private PowerUp power;
    private int positionX;
    private int puntaje;
    private int positionY;

    public Tanque(int vida, String color, Image forma, Shape hitbox, int positionX, int puntaje, int positionY) {
        this.vida = vida;
        this.forma = forma;
        this.hitbox = hitbox;
        this.positionX = positionX;
        this.puntaje = 0;
        this.positionY = positionY;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Image getForma() {
        return forma;
    }
    public void setForma(Image forma) {
        this.forma = forma;
    }
    public Shape getHitbox() {
        return hitbox;
    }
    public void setHitbox(Shape hitbox) {
        this.hitbox = hitbox;
    }
    public Weapon getArma() {
        return arma;
    }
    public void setArma(Weapon arma) {
        this.arma = arma;
    }
    public PowerUp getPower() {
        return power;
    }
    public void setPower(PowerUp power) {
        this.power = power;
    }
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    
    
    
    public void mover(int x, int y){
        this.positionX=positionX+x;
        this.positionY=positionY+y;
    }
    public void disparar(){
        
    } 
    }
    
    

