import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ventana extends JFrame {
    private JPanel pan100; 
    private JPanel pan101;
    private JPanel pan102;
    private JPanel pan103;
    private JPanel pan104;
    private JPanel pan105;
    private JPanel pan106;
    private JPanel pan107;
    private JPanel pan108;
    private JPanel pan109;
    private JPanel pan110;
    private JPanel pan111;
    private JPanel pan112;
    private JPanel pan113;
    private JPanel pan114;
    private JPanel pan115;
    private JPanel pan116;
    
    
    private Color color1 = Color.BLACK;
    private Color color3 = Color.red;
    private Color color4 = Color.yellow;
    private Color color2 = new Color(164, 224, 243);
    private Timer timer;

    public Ventana() {
        this.setTitle("Charmander");
        this.setSize(500, 500); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); 
        
        pan100 = new JPanel();
        pan100.setBackground(color1);
        pan100.setBounds(360, 20, 20, 20);
        this.add(pan100);
        pan101 = new JPanel();
        pan101.setBackground(color1);
        pan101.setBounds(340, 40, 20, 60);
        this.add(pan101);
        pan102 = new JPanel();
        pan102.setBackground(color1);
        pan102.setBounds(380, 40, 20, 20);
        this.add(pan102);
        pan103 = new JPanel();
        pan103.setBackground(color1);
        pan103.setBounds(320, 100, 20, 60);
        this.add(pan103);
        pan104 = new JPanel();
        pan104.setBackground(color1);
        pan104.setBounds(340, 160, 20, 40);
        this.add(pan104);
        pan105 = new JPanel();
        pan105.setBackground(color1);
        pan105.setBounds(400, 60, 20, 40);
        this.add(pan105);
        pan106 = new JPanel();
        pan106.setBackground(color1);
        pan106.setBounds(420, 100, 20, 60);
        this.add(pan106);
        pan107 = new JPanel();
        pan107.setBackground(color1);
        pan107.setBounds(400, 160, 20, 20);
        this.add(pan107);
        pan108 = new JPanel();
        pan108.setBackground(color1);
        pan108.setBounds(380, 180, 20, 20);
        this.add(pan108);
        pan109 = new JPanel();
        pan109.setBackground(color1);
        pan109.setBounds(360, 40, 20, 80);
        this.add(pan109);
        pan110 = new JPanel();
        pan110.setBackground(color1);
        pan110.setBounds(380, 60, 20, 40);
        this.add(pan110);
        pan111 = new JPanel();
        pan111.setBackground(color1);
        pan111.setBounds(340, 100, 20, 60);
        this.add(pan111);
        pan112 = new JPanel();
        pan112.setBackground(color1);
        pan112.setBounds(400, 100, 20, 60);
        this.add(pan112);
        pan113 = new JPanel();
        pan113.setBackground(color1);
        pan113.setBounds(380, 160, 20, 20);
        this.add(pan113);
        pan114 = new JPanel();
        pan114.setBackground(color1);
        pan114.setBounds(360, 180, 20, 20);
        this.add(pan114);
        pan115 = new JPanel();
        pan115.setBackground(color1);
        pan115.setBounds(360, 120, 20, 60);
        this.add(pan115);
        pan116 = new JPanel();
        pan116.setBackground(color1);
        pan116.setBounds(380, 100, 20, 60);
        this.add(pan116);
         timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan100.getBackground() == color1) {
                    pan100.setBackground(color2);
                } else {
                    pan100.setBackground(color1);
                }
            }
        });
         timer.start();
         timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan101.getBackground() == color1) {
                    pan101.setBackground(color2);
                } else {
                    pan101.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan102.getBackground() == color1) {
                    pan102.setBackground(color2);
                } else {
                    pan102.setBackground(color1);
                }
            }
        });
        timer.start();
          timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan103.getBackground() == color1) {
                    pan103.setBackground(color2);
                } else {
                    pan103.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan104.getBackground() == color1) {
                    pan104.setBackground(color2);
                } else {
                    pan104.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan105.getBackground() == color1) {
                    pan105.setBackground(color2);
                } else {
                    pan105.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan106.getBackground() == color1) {
                    pan106.setBackground(color2);
                } else {
                    pan106.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan107.getBackground() == color1) {
                    pan107.setBackground(color2);
                } else {
                    pan107.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan108.getBackground() == color1) {
                    pan108.setBackground(color2);
                } else {
                    pan108.setBackground(color1);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan109.getBackground() == color2) {
                    pan109.setBackground(color3);
                } else {
                    pan109.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan110.getBackground() == color2) {
                    pan110.setBackground(color3);
                } else {
                    pan110.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan111.getBackground() == color2) {
                    pan111.setBackground(color3);
                } else {
                    pan111.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan112.getBackground() == color2) {
                    pan112.setBackground(color3);
                } else {
                    pan112.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan113.getBackground() == color2) {
                    pan113.setBackground(color3);
                } else {
                    pan113.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan114.getBackground() == color2) {
                    pan114.setBackground(color3);
                } else {
                    pan114.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan115.getBackground() == color2) {
                    pan115.setBackground(color4);
                } else {
                    pan115.setBackground(color2);
                }
            }
        });
        timer.start();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pan116.getBackground() == color2) {
                    pan116.setBackground(color4);
                } else {
                    pan116.setBackground(color2);
                }
            }
        });
        timer.start();

        Componentes(); 
       
        this.setVisible(true);
        
    }

    public void Componentes() {
       
        /*JPanel pan89 = new JPanel();
        pan89.setBackground(Color.green);
        pan89.setBounds(300,20,140,180);     //COLA MOVIMIENTO
        this.add(pan89);*/
       
        JPanel pan1 = new JPanel();
        pan1.setBackground(Color.black);
        pan1.setBounds(120,40,60,20);   //cada cuadro de 20     ancho, alto
        this.add(pan1);
        JPanel pan2 = new JPanel();
        pan2.setBackground(Color.black);
        pan2.setBounds(80,60,40,20);   //cada cuadro de 20  
        this.add(pan2);
        JPanel pan3 = new JPanel();
        pan3.setBackground(Color.orange);
        pan3.setBounds(120,60,60,20);   //cada cuadro de 20  
        this.add(pan3);
        JPanel pan4 = new JPanel();
        pan4.setBackground(Color.black);
        pan4.setBounds(180,60,20,20);   
        this.add(pan4);
        JPanel pan5 = new JPanel();
        pan5.setBackground(Color.black);
        pan5.setBounds(60,80,20,40);   
        this.add(pan5);
        JPanel pan6 = new JPanel();
        pan6.setBackground(Color.orange);
        pan6.setBounds(80,80,120,20);   
        this.add(pan6);
        JPanel pan7 = new JPanel();
        pan7.setBackground(Color.black);
        pan7.setBounds(200,80,20,40);   
        this.add(pan7);
        JPanel pan8 = new JPanel();
        pan8.setBackground(Color.orange);
        pan8.setBounds(80,100,120,20);   
        this.add(pan8);
        JPanel pan9 = new JPanel();
            pan9.setBackground(Color.black);
        pan9.setBounds(40,120,20,40);   
        this.add(pan9);
        JPanel pan10 = new JPanel();
        pan10.setBackground(Color.black);
        pan10.setBounds(220,120,20,80);   
        this.add(pan10);
        JPanel pan11 = new JPanel();
        pan11.setBackground(Color.orange);
        pan11.setBounds(60,120,160,20);   
        this.add(pan11);   
        JPanel pan13 = new JPanel();
        pan13.setBackground(Color.white);
        pan13.setBounds(140,140,20,20);   
        this.add(pan13);
        JPanel pan14 = new JPanel();
        pan14.setBackground(Color.black);
        pan14.setBounds(160,140,20,60);   
        this.add(pan14);
        JPanel pan12 = new JPanel();
        pan12.setBackground(Color.orange);
        pan12.setBounds(60,140,160,20);   
        this.add(pan12);
        JPanel pan15 = new JPanel();
        pan15.setBackground(Color.black);
        pan15.setBounds(20,160,20,40);   
        this.add(pan15);
        JPanel pan16 = new JPanel();
        pan16.setBackground(Color.orange);
        pan16.setBounds(40,160,100,20);   
        this.add(pan16);
        JPanel pan17 = new JPanel();
        Color color = new Color(51, 246, 255);
        pan17.setBackground(color);
        pan17.setBounds(140,160,20,20);   
        this.add(pan17);
        JPanel pan18 = new JPanel();
        pan18.setBackground(Color.black);
        pan18.setBounds(140,180,30,20);   
        this.add(pan18);
        JPanel pan19 = new JPanel();
        pan19.setBackground(Color.orange);
        pan19.setBounds(40,180,100,20);   //ancho alto
        this.add(pan19);
        JPanel pan20 = new JPanel();
        pan20.setBackground(Color.orange);
        pan20.setBounds(180,160,20,40);   
        this.add(pan20);
        
        JPanel pan21 = new JPanel();
        Color color21 = new Color(245, 137, 57);   //oarangeeee
        pan21.setBackground(color21);
        pan21.setBounds(200,160,20,40);   
        this.add(pan21);
        
        JPanel pan22 = new JPanel();
        pan22.setBackground(Color.black);
        pan22.setBounds(40,200,20,20);   
        this.add(pan22);
        
        JPanel pan23 = new JPanel();
        Color color23 = new Color(245, 137, 57);
        pan23.setBackground(color23);
        pan23.setBounds(60,200,20,20);   
        this.add(pan23);
        JPanel pan24 = new JPanel();
        pan24.setBackground(color.orange);
        pan24.setBounds(80,200,60,20);   
        this.add(pan24);
        JPanel pan25 = new JPanel();
        Color color25 = new Color(245, 137, 57);
        pan25.setBackground(color25);
        pan25.setBounds(140,200,100,40);   
        this.add(pan25);
        JPanel pan26 = new JPanel();
        pan26.setBackground(color.black);
        pan26.setBounds(60,220,40,20);   
        this.add(pan26);
        JPanel pan27 = new JPanel();
        Color color27 = new Color(245, 137, 57);
        pan27.setBackground(color27);
        pan27.setBounds(100,220,40,20);   
        this.add(pan27);
        JPanel pan28 = new JPanel();
        pan28.setBackground(color.black);
        pan28.setBounds(100,240,40,20);   
        this.add(pan28);
        JPanel pan29 = new JPanel();
        pan29.setBackground(color.black);
        pan29.setBounds(240,200,20,40);   
        this.add(pan29);
        JPanel pan30 = new JPanel();
        Color color30 = new Color(246, 205, 175 );
        pan30.setBackground(color30);
        pan30.setBounds(140,240,20,60);   
        this.add(pan30);
        JPanel pan31 = new JPanel();
        Color color31 = new Color(246, 205, 175 );
        pan31.setBackground(color31);
        pan31.setBounds(160,260,20,60);   
        this.add(pan31);
        JPanel pan32 = new JPanel();
        Color color32 = new Color(246, 205, 175 );
        pan32.setBackground(color32);
        pan32.setBounds(180,300,20,40);   
        this.add(pan32);
        JPanel pan34 = new JPanel();
        pan34.setBackground(color.black);
        pan34.setBounds(200,240,20,20);   
        this.add(pan34);
        JPanel pan33 = new JPanel();
        Color color33 = new Color(245, 137, 57);   //oarangeeee
        pan33.setBackground(color33);
        pan33.setBounds(160,240,100,20);   
        this.add(pan33);
        JPanel pan35 = new JPanel();
        pan35.setBackground(color.black);
        pan35.setBounds(260,240,20,20);   
        this.add(pan35);
        JPanel pan36 = new JPanel();
        pan36.setBackground(color.black);
        pan36.setBounds(100,300,20,40);   
        this.add(pan36);
        JPanel pan37 = new JPanel();
        pan37.setBackground(color.black);
        pan37.setBounds(120,260,20,40);    //ancho alto   
        this.add(pan37);
        JPanel pan81 = new JPanel();
        pan81.setBackground(color.orange);
        pan81.setBounds(220,260,20,20);   
        this.add(pan81);
        JPanel pan38 = new JPanel();
        pan38.setBackground(color.black);
        pan38.setBounds(180,260,20,40);   
        this.add(pan38);
        JPanel pan39 = new JPanel();
        pan39.setBackground(color.black);
        pan39.setBounds(200,300,40,20);   
        this.add(pan39);
        JPanel pan40 = new JPanel();
        pan40.setBackground(color.black);
        pan40.setBounds(240,280,20,20);   
        this.add(pan40);
        JPanel pan41 = new JPanel();
        Color color41 = new Color(245, 137, 57);
        pan41.setBackground(color41);
        pan41.setBounds(180,260,100,20);   
        this.add(pan41);
        JPanel pan42 = new JPanel();
        pan42.setBackground(color.black);
        pan42.setBounds(280,260,20,20);   
        this.add(pan42);
        JPanel pan43 = new JPanel();
        pan43.setBackground(color.black);
        pan43.setBounds(300,240,20,20);   
        this.add(pan43);
        JPanel pan44 = new JPanel();
        pan44.setBackground(color.black);
        pan44.setBounds(320,220,20,20);   
        this.add(pan44);
        JPanel pan45 = new JPanel();
        pan45.setBackground(color.black);
        pan45.setBounds(360,20,20,20);   
        this.add(pan45);
        JPanel pan57 = new JPanel();
        pan57.setBackground(color.yellow);   //amarillo
        pan57.setBounds(380,100,20,60);   
        this.add(pan57);
        JPanel pan58 = new JPanel();
        pan58.setBackground(color.yellow);   //amarillo
        pan58.setBounds(360,120,20,60);   
        this.add(pan58);
        JPanel pan48 = new JPanel();
        pan48.setBackground(color.red);   //rojo
        pan48.setBounds(340,100,20,60);   
        this.add(pan48);
        JPanel pan49 = new JPanel();
        pan49.setBackground(color.red);   //rojo
        pan49.setBounds(360,40,20,160);   
        this.add(pan49);
        JPanel pan50 = new JPanel();
        pan50.setBackground(color.red);   //rojo
        pan50.setBounds(380,60,20,120);   
        this.add(pan50);
        JPanel pan51 = new JPanel();
        pan51.setBackground(color.red);   //rojo
        pan51.setBounds(340,100,20,60);   
        this.add(pan51);
        JPanel pan56 = new JPanel();
        pan56.setBackground(color.red);   //rojo
        pan56.setBounds(400,100,20,60);   
        this.add(pan56);
        JPanel pan46 = new JPanel();
        pan46.setBackground(color.black);
        pan46.setBounds(420,100,20,60);   
        this.add(pan46);
        JPanel pan47 = new JPanel();
        pan47.setBackground(color.black);
        pan47.setBounds(320,100,20,60);   
        this.add(pan47);
        JPanel pan52 = new JPanel();
        pan52.setBackground(color.black);
        pan52.setBounds(340,40,20,60);   
        this.add(pan52);
        JPanel pan53 = new JPanel();
        pan53.setBackground(color.black);
        pan53.setBounds(380,40,20,20);   
        this.add(pan53);
        JPanel pan54 = new JPanel();
        pan54.setBackground(color.black);
        pan54.setBounds(400,60,20,40);   
        this.add(pan54);
        JPanel pan55 = new JPanel();
        pan55.setBackground(color.black);
        pan55.setBounds(340,160,20,60);   
        this.add(pan55);
        JPanel pan59 = new JPanel();
        pan59.setBackground(color.black);
        pan59.setBounds(400,140,20,20);   
        this.add(pan59);
        JPanel pan60 = new JPanel();
        pan60.setBackground(color.black);
        pan60.setBounds(380,180,20,60);   
        this.add(pan60);
        JPanel pan61 = new JPanel();
        pan61.setBackground(color.black);
        pan61.setBounds(400,160,20,20);   
        this.add(pan61);
        JPanel pan62 = new JPanel();
        pan62.setBackground(color.black);
        pan62.setBounds(360,240,20,40);   
        this.add(pan62);
        JPanel pan63 = new JPanel();
        pan63.setBackground(color.black);
        pan63.setBounds(340,280,20,20);   
        this.add(pan63);
        JPanel pan64 = new JPanel();
        pan64.setBackground(color.black);
        pan64.setBounds(320,300,20,20);   
        this.add(pan64);
        JPanel pan65 = new JPanel();
        pan65.setBackground(color.black);
        pan65.setBounds(300,280,20,60);   
        this.add(pan65);
        JPanel pan66 = new JPanel();
        pan66.setBackground(color.black);
        pan66.setBounds(280,340,20,40);   
        this.add(pan66);
        JPanel pan67 = new JPanel();
        pan67.setBackground(color.black);
        pan67.setBounds(220,380,60,20);   
        this.add(pan67);
        JPanel pan68 = new JPanel();
        pan68.setBackground(color.black);
        pan68.setBounds(200,360,20,20);   
        this.add(pan68);
        JPanel pan69 = new JPanel();
        pan69.setBackground(color.black);
        pan69.setBounds(120,340,80,20);   
        this.add(pan69);
        JPanel pan72 = new JPanel();
        pan72.setBackground(color.black);
        pan72.setBounds(160,320,20,20);   
        this.add(pan72);
        JPanel pan70 = new JPanel();
        Color color70 = new Color(245, 137, 57);   //oarangeeee
        pan70.setBackground(color70);
        pan70.setBounds(120,300,40,20);   
        this.add(pan70);
        JPanel pan71 = new JPanel();
        Color color71 = new Color(245, 137, 57);   //oarangeeee
        pan71.setBackground(color71);
        pan71.setBounds(140,320,20,20);   
        this.add(pan71);
        JPanel pan73 = new JPanel();
        Color color73 = new Color(245, 137, 57);   //oarangeeee
        pan73.setBackground(color73);
        pan73.setBounds(200,340,80,20);   
        this.add(pan73);
        JPanel pan74 = new JPanel();
        Color color74 = new Color(245, 137, 57);   //oarangeeee
        pan74.setBackground(color74);
        pan74.setBounds(240,360,20,20);   
        this.add(pan74);
        JPanel pan75 = new JPanel();
        Color color75 = new Color(245, 137, 57);   //oarangeeee
        pan75.setBackground(color75);
        pan75.setBounds(260,280,20,80);   
        this.add(pan75);
        JPanel pan76 = new JPanel();
        Color color76 = new Color(245, 137, 57);   //oarangeeee
        pan76.setBackground(color76);
        pan76.setBounds(280,320,20,20);   
        this.add(pan76);
        JPanel pan77 = new JPanel();
        Color color77 = new Color(245, 137, 57);   //oarangeeee
        pan77.setBackground(color77);
        pan77.setBounds(320,240,20,60);   
        this.add(pan77);
        JPanel pan78 = new JPanel();
        Color color78 = new Color(245, 137, 57);   //oarangeeee
        pan78.setBackground(color78);
        pan78.setBounds(300,260,60,20);   
        this.add(pan78);
        JPanel pan79 = new JPanel();
        Color color79 = new Color(245, 137, 57);   //oarangeeee
        pan79.setBackground(color74);
        pan79.setBounds(220,280,20,20);   
        this.add(pan79);
        JPanel pan80 = new JPanel();
        pan80.setBackground(color.orange);
        pan80.setBounds(200,280,20,20);   
        this.add(pan80);
        JPanel pan82 = new JPanel();
        pan82.setBackground(color.orange);
        pan82.setBounds(200,320,60,20);   
        this.add(pan82);
        JPanel pan83 = new JPanel();
        pan83.setBackground(color.orange);
        pan83.setBounds(240,300,20,20);   
        this.add(pan83);
        JPanel pan84 = new JPanel();
        pan84.setBackground(color.orange);
        pan84.setBounds(280,280,20,40);   
        this.add(pan84);
        JPanel pan85 = new JPanel();
        pan85.setBackground(color.orange);
        pan85.setBounds(360,200,20,40);   
        this.add(pan85);
        JPanel pan86 = new JPanel();
        pan86.setBackground(color.orange);
        pan86.setBounds(340,220,20,40);   
        this.add(pan86);
        
  
        //FONDO
        JPanel pan88 = new JPanel();
        Color color88 = new Color(164, 224, 243);   
        pan88.setBackground(color88);
        pan88.setBounds(0,0,700,700);   
        this.add(pan88);
        
        
        
         
    }


    public static void main(String[] args) {
        Ventana ventana = new Ventana();
    }
}
