/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Graphics2D;

/**
 *
 * @author Usuario 1
 */
public class Nube {
    int diametro = 20;
    int diametro2=40;
    int x=700;
    int y=100;
    
    private Juego juego1;
    
    public Nube(Juego juego1){
        this.juego1=juego1;
    }
    public void mover(){
        x=x-1;
        if(x==-50){
            x=700;
        }
    }
    
    public void paint(Graphics2D g){
        g.fillOval(x,y,diametro,diametro);
        g.fillOval(x, y-15, diametro2, diametro2);
        g.fillOval(x, y, diametro, diametro);
    }
    
}
