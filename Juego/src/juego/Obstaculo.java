/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Usuario 1
 */
public class Obstaculo {

    int ancho;
    int alto;
    int x ;
    int y ;
    int x1 = -5;
    Image imagenObstaculo;
    
    //segundo obstaculo
    

    private Juego juego1;

    public Obstaculo(Juego juego1,int ancho,int alto, int x, int y, String imagenPath) {
        this.juego1 = juego1;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        try {
            imagenObstaculo = ImageIO.read(getClass().getResource(imagenPath));
        } catch (IOException e) {
            System.err.println("Error cargando la imagen del obstáculo: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
     public void setPosX(int posX) {
        this.x = posX;
    }

    public void setPosY(int posY) {
        this.y = posY;
    }
    
    
    
    

//     Cargar la imagen del personaje en el constructor
    void mover() {
        if (x <= -50) {
            juego1.puntos++;
            x = 700;
        } else {
            if (colision()) {
                juego1.finJuego();
            } else {
                x = x + x1;
            }
        }
    }

    private boolean colision() {
        return juego1.personaje1.getBounds().intersects(getBounds());
        
              

    }

    void paint(Graphics2D g) {
    // g.fillRect(x, y, ancho, alto);
    g.drawImage(imagenObstaculo, x, y, ancho, alto, null);
}

    public Rectangle getBounds() {
        return new Rectangle(x, y, ancho, alto);
    }

}


