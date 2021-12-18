/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p1_karimguifarro11911125;

import java.util.Random;

/**
 *
 * @author karim
 */
public class Malvado extends autos{

    public Malvado() {
    }

    public Malvado(String nombre, int velocidad, int porcentaje_derrape, int ataque, int vida) {
        super(nombre, velocidad, porcentaje_derrape, ataque, vida);
    }
    
     public Random r=new Random();
    public void evil(int vida,int ataque){
        int ext,ext1;
        ext =1000 + r.nextInt(5000);
        ext1 =300 + r.nextInt(700);
        vida=ext;
        ataque=ext1;
    }
}
