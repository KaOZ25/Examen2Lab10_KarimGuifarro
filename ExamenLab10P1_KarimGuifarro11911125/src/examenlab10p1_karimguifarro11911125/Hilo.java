/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab10p1_karimguifarro11911125;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author karim
 */
public class Hilo extends Thread{
     private JProgressBar n,m;
      private JLabel jl,jl1;
     int vid1,vid2,atq1,atq2;

    public Hilo(JProgressBar n, JProgressBar m, JLabel jl, JLabel jl1, int vid1, int vid2, int atq1, int atq2) {
        this.n = n;
        this.m = m;
        this.jl = jl;
        this.jl1 = jl1;
        this.vid1 = vid1;
        this.vid2 = vid2;
        this.atq1 = atq1;
        this.atq2 = atq2;
    }

    

    public JProgressBar getN() {
        return n;
    }

    public void setN(JProgressBar n) {
        this.n = n;
    }

    public JProgressBar getM() {
        return m;
    }

    public void setM(JProgressBar m) {
        this.m = m;
    }

    public int getVid1() {
        return vid1;
    }

    public void setVid1(int vid1) {
        this.vid1 = vid1;
    }

    public int getVid2() {
        return vid2;
    }

    public void setVid2(int vid2) {
        this.vid2 = vid2;
    }

    public int getAtq1() {
        return atq1;
    }

    public void setAtq1(int atq1) {
        this.atq1 = atq1;
    }

    public int getAtq2() {
        return atq2;
    }

    public void setAtq2(int atq2) {
        this.atq2 = atq2;
    }
     
    @Override
    public void run() {
        int cont=0;
     while(true){
         n.setValue(vid1 - atq2);
         jl.setText(String.valueOf(vid1-atq2));
            if (cont ==2) {
             m.setValue(vid2 - atq1);
         jl1.setText(String.valueOf(vid2-atq1)); 
         }
            try {
                Thread.sleep(500);
                cont++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    }
    
}
