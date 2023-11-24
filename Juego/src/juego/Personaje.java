package juego;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import juego.Juego;

public class Personaje {

    int ancho = 50;
    int alto = 50;
    int x = 50;
    int y = 200;
    int x1 = 0;
    int y1 = 0;
    private Juego juego1;
    boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    Image imagenPersonaje1; // Variable para la primera imagen del personaje
    Image imagenPersonaje2; // Variable para la segunda imagen del personaje
    boolean usarImagen1 = true; // Indica si se debe usar la primera o segunda imagen

    public Personaje(Juego juego1,int xInicial,int yInicial) {
        this.juego1 = juego1;

        // Cargar las imágenes del personaje en el constructor
        try {
            imagenPersonaje1 = ImageIO.read(getClass().getResource("/char.png"));
            imagenPersonaje2 = ImageIO.read(getClass().getResource("4.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = xInicial;
    this.y = yInicial;
    }

    public void mover() {
        if (x + x1 > 0 && x + x1 < juego1.getWidth() - ancho) {
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
        } else {
            g.drawImage(imagenPersonaje2, x, y, ancho, alto, null);
        }
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            saltando = true;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            cambiarImagen();
        }
    }

    private void cambiarImagen() {
        usarImagen1 = !usarImagen1; // Cambiar el estado para alternar entre las imágenes
    }

    public Rectangle getBounds() {
        return new Rectangle(x + 5, y + y1, ancho, alto);
    }
}
    