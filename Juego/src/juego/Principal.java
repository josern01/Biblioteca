package juego;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Principal {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("juego1");
        Juego juego1 = new Juego();
        ventana.add(juego1);
        ventana.setSize(710, 290);
        ventana.setLocation(400, 200);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       int delay = 15; // Milisegundos entre actualizaciones
        Timer timer = new Timer(delay, e -> {
            if (!juego1.juegoFinalizado) {
                juego1.repaint();
            }
        });
        timer.start();
    }
}