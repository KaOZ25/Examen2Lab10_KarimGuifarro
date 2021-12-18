/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p1_karimguifarro11911125;

import java.util.Random;


public class Belicos extends autos{
    public Random r=new Random();

    public Belicos() {
    }
    
    public Belicos(String nombre, int velocidad, int porcentaje_derrape, int ataque, int vida) {
        super(nombre, velocidad, porcentaje_derrape, ataque, vida);
    }
    
    public int videx(int vida){
        int ext;
        int min=vida/2;
        ext =min+r.nextInt(vida);
        return ext;
    }
}
