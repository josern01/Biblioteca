package proyectojuego;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Nivel2 {

    int ancho;
    int alto;
    int x;
    int y;
    int x1 = -5;
    Image imagenObstaculo;
     Image imagenDeFondo; 
    public Obs juego;

    public Nivel2(Obs juego, int ancho, int alto, int x, int y, String imagenPath) {
        this.juego = juego;
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        try {
            imagenObstaculo = ImageIO.read(getClass().getResource(imagenPath));
//            imagenDeFondo = ImageIO.read(getClass().getResource(fondoPath));
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

    void mover() {
        if (x <= -50) {
            juego.puntos++;
            x = 700;
        } else {
            if (colision()) {
                juego.finJuego();
            } else {
                x = x + x1;
            }
        }
    }

    private boolean colision() {
        return juego.personaje.getBounds().intersects(getBounds());
    }

    void paint(Graphics2D g) {
        g.drawImage(imagenObstaculo, x, y, ancho, alto, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ancho, alto);
    }
    public void paintFondo(Graphics2D g) {
        g.drawImage(imagenDeFondo, 0, 0, juego.getWidth(), juego.getHeight(), null);
    }

    void cambiarImagen(String nueva_imagenpng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


