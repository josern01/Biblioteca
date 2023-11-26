package proyectojuego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Obs extends JPanel {

    private boolean juegoFinalizado = false;
    private JButton btnSiguienteNivel;
    public int puntos = 0;
    private int puntajeActual = 5;
    private int nivelActual = 1;
    private JButton btnPausarReanudar;
    private JButton btnReiniciar;

//    private static final int PUNTOS_PARA_CAMBIAR_NIVEL = 5;
    private boolean juegoPausado = false;
    private Image imagenDeFondo;
    private Timer timer;

    Personaje personaje = new Personaje(this, 100, 200);
    Nivel1 obstaculo1 = new Nivel1(this, 60, 50, 400, 200, "a.png");
    Nivel1 obstaculo5 = new Nivel1(this, 60, 50, 300, 100, "a.png");
    Personaje personaje2 = new Personaje(this, 100, 200);
    Nivel2 obstaculo2 = new Nivel2(this, 60, 50, 400, 200, "a.png");
    Nivel2 obstaculo3 = new Nivel2(this, 60, 50, 300, 150, "a.png");

    public Obs() {

        // Inicializar el temporizador
        int delay = 25; // Ajusta el tiempo de retraso según tus necesidades
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mover();
                repaint();
            }
        });
        timer.start();
        cargarImagenDeFondo();
        init();
    }

    private void cargarImagenDeFondo() {
        try {
            imagenDeFondo = new ImageIcon(getClass().getResource("fondo.jpg")).getImage();
        } catch (Exception e) {
            e.printStackTrace();
            // Puedes imprimir información sobre el error o mostrar un mensaje de error
        }
    }

    private void init() {
        setFocusable(true);
//        imagenDeFondo = new ImageIcon(getClass().getResource("fondo.jpg")).getImage();
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.keyPressed(e);
            }
        });

        btnSiguienteNivel = new JButton("Siguiente Nivel");
        add(btnSiguienteNivel);
        btnSiguienteNivel.addActionListener(e -> cambiarNivel());

        btnReiniciar = new JButton("Reiniciar");
        add(btnReiniciar);

        btnReiniciar.addActionListener(e -> reiniciarJuego());
        btnPausarReanudar = new JButton("Pausar/Reanudar-Iniciar");
        btnPausarReanudar.addActionListener(e -> pausarReanudarJuego());
        add(btnPausarReanudar);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                requestFocusInWindow();
            }
        });
    }

    private void cambiarNivel() {

        // Lógica para cambiar al siguiente nivel
        nivelActual++;
        puntos = 0; // Reinicia los puntos para el nuevo nivel
        actualizarFondo();

        revalidate();
        repaint();
    }

    private void actualizarFondo() {
        // Aquí puedes agregar la lógica para cambiar el fondo según el nuevo nivel.
        // Por ejemplo, podrías utilizar un switch para determinar el nivel actual
        // y cargar la imagen de fondo correspondiente.

        switch (nivelActual) {
            case 1:
                imagenDeFondo = new ImageIcon(getClass().getResource("fondo.jpg")).getImage();
                break;
            case 2:
                imagenDeFondo = new ImageIcon(getClass().getResource("p.jpg")).getImage();
                // Si tienes la clase Nivel2, puedes cargar la imagen de fondo correspondiente
                // a ese nivel utilizando su lógica.
                // Por ejemplo, si Nivel2 tiene un método para obtener la imagen de fondo:
                // imagenDeFondo = nivel2.obtenerImagenDeFondo();
                break;
            // Otros casos para niveles adicionales...
            default:
                // Lógica para niveles adicionales
                break;
        }
    }

    private void pausarReanudarJuego() {
        juegoPausado = !juegoPausado;
        if (juegoPausado) {
            timer.stop();
        } else {
            timer.start();
        }
        requestFocusInWindow();
    }

    private void reiniciarJuego() {
        juegoFinalizado = false;
        puntos = 0;
        puntajeActual = 0;
        nivelActual = 1;
//        imagenDeFondo = new ImageIcon(getClass().getResource("fondo.jpg")).getImage();

        obstaculo1 = new Nivel1(this, 60, 50, 700, 200, "a.png");
        obstaculo5 = new Nivel1(this, 60, 50, 300, 100, "a.png");
        obstaculo5.setPosX(300);
        obstaculo1.setPosX(700);
        switch (nivelActual) {
            case 1:
                imagenDeFondo = new ImageIcon(getClass().getResource("fondo.jpg")).getImage();
                break;
            case 2:
                imagenDeFondo = new ImageIcon(getClass().getResource("p.jpg")).getImage();
                break;
            // Agrega más casos para niveles adicionales si es necesario
            default:
                // Lógica para niveles adicionales
                break;
        }

        revalidate();
        repaint();
        requestFocusInWindow();
    }

    public void mover() {
        if (!juegoPausado) {
            personaje.mover();
            obstaculo1.mover();
            obstaculo5.mover();
            obstaculo3.mover();

            // Verificar colisiones para el nivel 1
            if (verificarColisionesNivel1()) {
                manejarColision();
            }

            // Verificar colisiones para el nivel 2
            if (verificarColisionesNivel2()) {
                manejarColision();
            }

            // Verificar si se ha completado el nivel
            if (puntos >= 3) {
                nivelCompletado();
            }
        }
    }

    private boolean verificarColisionesNivel1() {
        // Lógica para verificar colisiones en el nivel 1
        // Devuelve true si hay colisión, de lo contrario, devuelve false
        return personaje.getBounds().intersects(obstaculo1.getBounds())
                || personaje.getBounds().intersects(obstaculo5.getBounds());
    }
    

    private boolean verificarColisionesNivel2() {
        // Lógica para verificar colisiones en el nivel 2
        // Devuelve true si hay colisión, de lo contrario, devuelve false
        return personaje.getBounds().intersects(obstaculo3.getBounds());
    }

    private void manejarColision() {
        // Lógica para manejar la colisión
        // Puedes ajustar esta lógica según tus necesidades
        finJuego();  // Por ejemplo, puedes finalizar el juego en caso de colisión
    }

    private void nivelCompletado() {
        // Detener el temporizador
        timer.stop();

        // Mostrar el mensaje de "Nivel Completado"
        JOptionPane.showMessageDialog(this, "Nivel Completado", "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE);

        // Puedes realizar otras acciones después de completar el nivel si es necesario
        // Por ejemplo, reiniciar el juego
        reiniciarJuego();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g.drawImage(imagenDeFondo, 0, 0, getWidth(), getHeight(), this);
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);
        if (nivelActual == 1) {
            obstaculo1.paintFondo(g2);
        } else if (nivelActual == 2) {

            // Puedes hacer lo mismo para otros niveles si es necesario
            // nivel2.paintFondo(g2);
        }
        if (juegoPausado) {
            g.setColor(Color.RED);
            g.drawString("Juego Pausado", getWidth() / 2 - 60, getHeight() / 2);
        }
    }

    public void dibujar(Graphics2D g) {
        g.setColor(Color.BLACK);
        personaje.paint(g);
        g.setColor(Color.red);
        obstaculo1.paint(g);
        g.setColor(Color.red);
        obstaculo5.paint(g);
        mover();
    }

    public void dibujarPuntaje(Graphics2D g) {
        Font score = new Font("Arial", Font.BOLD, 20);
        g.setFont(score);
        g.setColor(Color.white);
        g.drawString("Nivel " + nivelActual + " - Puntaje: " + puntos, 200, 50);

        if (juegoFinalizado) {
            g.setColor(Color.red);
            g.drawString("Game Over *risas*", ((float) getBounds().getCenterX() / 2) + 50, 70);
        }
    }

    public void finJuego() {
        juegoFinalizado = true;
        timer.stop();

        revalidate();
        repaint();
    }
}
