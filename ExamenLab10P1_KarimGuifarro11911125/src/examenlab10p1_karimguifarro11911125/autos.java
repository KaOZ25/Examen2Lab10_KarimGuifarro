/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p1_karimguifarro11911125;

import java.io.Serializable;

/**
 *
 * @author karim
 */
public class autos implements Serializable{
      String  nombre;
    int velocidad, porcentaje_derrape, ataque, vida;
    
    public autos() {
    }

    public autos(String nombre, int velocidad, int porcentaje_derrape, int ataque, int vida) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.porcentaje_derrape = porcentaje_derrape;
        this.ataque = ataque;
        this.vida = vida;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPorcentaje_derrape() {
        return porcentaje_derrape;
    }

    public void setPorcentaje_derrape(int porcentaje_derrape) {
        this.porcentaje_derrape = porcentaje_derrape;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

  

    @Override
    public String toString() {
        return nombre;
    }
}
