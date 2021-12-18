/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p1_karimguifarro11911125;

/**
 *
 * @author karim
 */
public class Jugadores {
  String nombre;
    int vida,ataque;
    String tipo;
    public Jugadores() {
    }

    public Jugadores(String nombre, int vida, int ataque, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
