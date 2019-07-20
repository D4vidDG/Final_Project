/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Escenarios.Escenario1;
import Juego.NuevoJuego;

/**
 *
 * @author usuario
 */
public class Controlador1 {
    private Escenario1 escenario;
    private NuevoJuego modelo;

    public Controlador1() {
        this.escenario=new Escenario1();
        this.modelo = new NuevoJuego();
        
    }
    
}
