package proyectojuego;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Personaje {
    
    int ancho = 50;
    int alto = 50;
    int x = 50;
    int y = 200;
    int x1 = 0;
    int y1 = 0;
    private Obs juego;
    boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    Image imagenPersonaje1; 
    boolean usarImagen1 = true; 
    
    public Personaje(Obs juego, int xInicial, int yInicial) {
        this.juego = juego;

        // Cargar las imágenes del personaje en el constructor
        try {
            imagenPersonaje1 = ImageIO.read(getClass().getResource("/char.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = xInicial;
        this.y = yInicial;
    }

    public void mover() {
        if (x + x1 > 0 && x + x1 < juego.getWidth() - ancho) {
            x = x + x1;
            if (saltando) {
                if (y == 200) {
                    sube = true;
                    y1 = -5;
                    baja = false;
                }
                if (y == 90) {
                    baja = true;
                    y1 = 5;
                    sube = false;
                }
                if (sube) {
                    y = y + y1;
                }
                if (baja) {
                    y = y + y1;
                    if (y == 200) {
                        saltando = false;
                    }
                }
            }
        }
    }

    public void paint(Graphics2D g) {
        // Dibujar la imagen del personaje según el estado actual
        if (usarImagen1) {
            g.drawImage(imagenPersonaje1, x, y, ancho, alto, null);
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !saltando) {
            saltando = true;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            cambiarImagen();
        }
    }

    private void cambiarImagen() {
        usarImagen1 = !usarImagen1;
    }

    public Rectangle getBounds() {
        return new Rectangle(x + 5, y + y1, ancho, alto);
    }
}
