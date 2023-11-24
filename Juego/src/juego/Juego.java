/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Usuario 1
 */
public class Juego extends JPanel {
    private boolean juegoPausado = false;
    private JButton btnPausa;
    private int nivelActual = 1;
    private int puntajeSiguienteNivel = 5;
    private String[] imagenesDeFondo = {"nivel1/fondo.jpg", "nivel2/p.jpg", /*...*/};

    private Image imagenDeFondo;
    Personaje personaje1 = new Personaje(this, 100, 200);
    Personaje personaje2 = new Personaje(this, 100, 250);
//    Obstaculo obstaculo1 = new Obstaculo(this, 60, 50, 700, 200, "rayo.png");
    Obstaculo obstaculo2 = new Obstaculo(this, 60, 50, 700, 200, "rayo.png");
    Obstaculo obstaculo3 = new Obstaculo(this, 80, 50, 400, 150, "a.png");
    Obstaculo obstaculo4 = new Obstaculo(this, 80, 50, 300, 100, "missile_left.png");
//    Obstaculo obstaculo5 = new Obstaculo(this, 60, 50, 400, 200, "q.png");
//    Obstaculo obstaculo6 = new Obstaculo(this, 60, 50, 600, 150, "rayo.png");
//    Obstaculo obstaculo7 = new Obstaculo(this, 80, 50, 700, 150, "rayo.png");
//    Obstaculo obstaculo8 = new Obstaculo(this, 80, 50, 200, 150, "a.png");
//    Obstaculo obstaculo9 = new Obstaculo(this, 60, 50, 400, 150, "a.png");
//    Obstaculo obstaculo10 = new Obstaculo(this, 60, 50, 300, 150, "q.png");

//    Obstaculo obstaculo3 =  new Obstaculo(this,80,50,500, 200, "q.png");
    private int puntajeActual = 0;
    JButton btnIniciar;
    private JButton btnReiniciar;

    public boolean juegoFinalizado = false;
    public int puntos = 0;

    public Juego() {
        setFocusable(true);
        imagenDeFondo = new ImageIcon(getClass().getResource("fondo.jpg")).getImage();
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje1.keyPressed(e);
            }
        });
        
        btnPausa = new JButton("Pausa/Reanudar");
        btnPausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juegoPausado = !juegoPausado;  // Cambiar el estado de pausa
                if (!juegoPausado) {
                    // Si se reanuda el juego, asegúrate de tener el foco en la ventana
                    requestFocusInWindow();
                }
            }
        });
        add(btnPausa);
    

//        btnIniciar = new JButton("Iniciar Juego");
//        btnIniciar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                iniciarJuego();
//            }
//        });
//        add(btnIniciar);

        btnReiniciar = new JButton("Reiniciar Juego");
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });
        add(btnReiniciar);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                requestFocusInWindow();
            }
        });

//        btnIniciar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                iniciarJuego();
//                requestFocusInWindow();  // Asegurarse de que el panel tenga el foco después de iniciar el juego
//            }
//        });
    }

//    private void iniciarJuego() {
//        juegoFinalizado = false;
//        puntos = 0;
//        nivelActual = 1;
//        imagenDeFondo = new ImageIcon(getClass().getResource(imagenesDeFondo[nivelActual - 1])).getImage();
//        // Restaurar otros estados o componentes si es necesario
//        revalidate();
//        repaint();
//        requestFocusInWindow();
//    }
    private void reiniciarJuego() {
        juegoFinalizado = false;
        puntos = 0;
        nivelActual = 1;
        personaje1 = new Personaje(this, 100, 200);
        personaje2 = new Personaje(this, 100, 250);

//        obstaculo1 = new Obstaculo(this, 60, 50, 700, 200, "rayo.png");
        obstaculo2 = new Obstaculo(this, 60, 50, 700, 200, "rayo.png");
        obstaculo3 = new Obstaculo(this, 80, 50, 400, 150, "a.png");
        obstaculo4 = new Obstaculo(this, 80, 50, 300, 100, "missile_left.png");

//        obstaculo1.setPosX(700);
//        obstaculo1.setPosY(50);

        obstaculo2.setPosX(500);
        obstaculo2.setPosY(150);

        obstaculo3.setPosX(400);
        obstaculo3.setPosY(150);

        obstaculo4.setPosX(300);
        obstaculo4.setPosY(100);

        revalidate();
        repaint();
        requestFocusInWindow();

    }

    void mover() {
        if (!juegoPausado) {
            personaje1.mover();
            obstaculo2.mover();
            obstaculo3.mover();
            obstaculo4.mover();

        if (puntajeActual >= puntajeSiguienteNivel) {
            // Cambia al siguiente nivel
            nivelActual++;
            puntajeActual = 0;

            String imagenPath = imagenesDeFondo[nivelActual - 1];
            if (getClass().getResource(imagenPath) != null) {
                imagenDeFondo = new ImageIcon(getClass().getResource(imagenPath)).getImage();
            } else {
                // Manejar el recurso nulo (por ejemplo, imprimir un mensaje de error)
                System.err.println("Recurso de imagen no encontrado: " + imagenPath);
            }
        }

    }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g.drawImage(imagenDeFondo, 0, 0, getWidth(), getHeight(), this);
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);

    }

    public void aumentarPuntaje(int puntosGanados) {
        puntajeActual += puntosGanados;
    }

    public void dibujar(Graphics2D g) {
//        g.setColor(Color.BLUE);
//        nubecita.paint(g);

        g.setColor(Color.BLACK);
        personaje1.paint(g);

        g.setColor(Color.BLACK);
        personaje2.paint(g);
        g.setColor(Color.red);
        obstaculo2.paint(g);
        g.setColor(Color.red);
        obstaculo3.paint(g);
        g.setColor(Color.red);
        obstaculo4.paint(g);
//        g.setColor(Color.red);
//        obstaculo5.paint(g);
//        g.setColor(Color.red);
//        obstaculo6.paint(g);
//        g.setColor(Color.red);
//        obstaculo7.paint(g);
//        g.setColor(Color.red);
//        obstaculo8.paint(g);
//        g.setColor(Color.red);
//        obstaculo9.paint(g);
//        g.setColor(Color.red);
//        obstaculo10.paint(g);

//        g.setColor(Color.red);
//        obstaculo3.paint(g);
        mover();

    }

    public void dibujarPuntaje(Graphics2D g) {
        Font score = new Font("Arial", Font.BOLD, 20);
        g.setFont(score);
        g.setColor(Color.BLACK);

        g.drawString("Nivel " + nivelActual + " - Puntaje: " + puntos, 500, 20);

        if (juegoFinalizado) {
            g.setColor(Color.red);
            g.drawString("Has perdido", ((float) getBounds().getCenterX() / 2) + 50, 70);
        }
    }

    public void finJuego() {
        juegoFinalizado = true;
        revalidate();
        repaint();

    }

}
