package proyectojuego;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import proyectojuego.Obs;

public class ProyectoJuego {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Obs juego = new Obs();
            JFrame frame = new JFrame("Mi Juego");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Agregar la instancia de juego al frame
            frame.getContentPane().add(juego);

            frame.setSize(600, 400); // Establece el tamaño de la ventana
            frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
            frame.setVisible(true);
        });
    }
}
