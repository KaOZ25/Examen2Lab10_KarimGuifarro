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
public class Ataque extends autos{

    public Ataque() {
    }

    public Ataque(String nombre, int velocidad, int porcentaje_derrape, int ataque, int vida) {
        super(nombre, velocidad, porcentaje_derrape, ataque, vida);
    }
    
     public Random r=new Random();
    public int extatq(int ataque){
        int ext;
        int min=ataque/2;
        ext =min+r.nextInt(ataque);
        return ext;
    }
}
