
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Ventana1 extends JFrame {

  
    public Ventana1() {
        this.setTitle("Charmander");
        this.setSize(1000, 1000); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); 

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
        pan1.setBounds(40, 60, 80, 40);
        this.add(pan1);
        
   
        JPanel pan2 = new JPanel();
        pan2.setBackground(Color.black);
        pan2.setBounds(100, 80, 60, 40);   //cada cuadro de 20  
        this.add(pan2);
        JPanel pan3 = new JPanel();
        pan3.setBackground(Color.orange);
        pan3.setBounds(140, 80, 80, 40);   //cada cuadro de 20  
        this.add(pan3);
        JPanel pan4 = new JPanel();
        pan4.setBackground(Color.black);
        pan4.setBounds(200, 80, 40, 40);
        this.add(pan4);
        JPanel pan5 = new JPanel();
        pan5.setBackground(Color.black);
        pan5.setBounds(80, 100, 40, 60);
        this.add(pan5);
        JPanel pan6 = new JPanel();
        pan6.setBackground(Color.orange);
        pan6.setBounds(100, 100, 140, 40);
        this.add(pan6);
        JPanel pan7 = new JPanel();
        pan7.setBackground(Color.black);
        pan7.setBounds(220, 100, 40, 60);
        this.add(pan7);
        JPanel pan8 = new JPanel();
        pan8.setBackground(Color.orange);
        pan8.setBounds(100, 120, 140,40);
        this.add(pan8);
        JPanel pan9 = new JPanel();
        pan9.setBackground(Color.black);
        pan9.setBounds(60, 140, 40, 60);
        this.add(pan9);
        JPanel pan10 = new JPanel();
        pan10.setBackground(Color.black);
        pan10.setBounds(260, 140, 40, 100);
        this.add(pan10);
        JPanel pan11 = new JPanel();
        pan11.setBackground(Color.orange);
        pan11.setBounds(80, 140, 180, 40);
        this.add(pan11);
        JPanel pan13 = new JPanel();
        pan13.setBackground(Color.white);
        pan13.setBounds(160, 160, 40, 40);
        this.add(pan13);
        JPanel pan14 = new JPanel();
        pan14.setBackground(Color.black);
        pan14.setBounds(180, 160, 40, 80);
        this.add(pan14);
        JPanel pan12 = new JPanel();
        pan12.setBackground(Color.orange);
        pan12.setBounds(80, 160, 180, 40);
        this.add(pan12);
        JPanel pan15 = new JPanel();
        pan15.setBackground(Color.black);
        pan15.setBounds(40, 180, 40, 60);
        this.add(pan15);
        JPanel pan16 = new JPanel();
        pan16.setBackground(Color.orange);
        pan16.setBounds(60, 180, 120, 40);
        this.add(pan16);
        JPanel pan17 = new JPanel();
        Color color = new Color(71, 0, 255);
        pan17.setBackground(color);
        pan17.setBounds(160, 180, 40, 40);
        this.add(pan17);
        JPanel pan18 = new JPanel();
        pan18.setBackground(Color.black);
        pan18.setBounds(160, 200, 50, 40);
        this.add(pan18);
        JPanel pan19 = new JPanel();
        pan19.setBackground(Color.orange);
        pan19.setBounds(60, 200, 120, 40);   //ancho alto
        this.add(pan19);
        JPanel pan20 = new JPanel();
        pan20.setBackground(Color.orange);
        pan20.setBounds(200, 180, 40, 60);
        this.add(pan20);

        JPanel pan21 = new JPanel();
        Color color21 = new Color(245, 137, 57);   //oarangeeee
        pan21.setBackground(color21);
        pan21.setBounds(220, 180, 40, 60);
        this.add(pan21);

        JPanel pan22 = new JPanel();
        pan22.setBackground(Color.black);
        pan22.setBounds(60, 220, 40, 40);
        this.add(pan22);

        JPanel pan23 = new JPanel();
        Color color23 = new Color(245, 137, 57);
        pan23.setBackground(color23);
        pan23.setBounds(80, 220, 40, 40);
        this.add(pan23);
        JPanel pan24 = new JPanel();
        pan24.setBackground(color.orange);
        pan24.setBounds(100, 220, 80, 40);
        this.add(pan24);
        JPanel pan25 = new JPanel();
        Color color25 = new Color(245, 137, 57);
        pan25.setBackground(color25);
        pan25.setBounds(160, 220, 120, 60);
        this.add(pan25);
        JPanel pan26 = new JPanel();
        pan26.setBackground(color.black);
        pan26.setBounds(80, 240, 60, 40);
        this.add(pan26);
        JPanel pan27 = new JPanel();
        Color color27 = new Color(245, 137, 57);
        pan27.setBackground(color27);
        pan27.setBounds(120, 240, 60, 40);
        this.add(pan27);
        JPanel pan28 = new JPanel();
        pan28.setBackground(color.black);
        pan28.setBounds(120, 260, 60, 40);
        this.add(pan28);
        JPanel pan29 = new JPanel();
        pan29.setBackground(color.black);
        pan29.setBounds(260, 220, 40, 60);
        this.add(pan29);
        JPanel pan30 = new JPanel();
        Color color30 = new Color(246, 205, 175);
        pan30.setBackground(color30);
        pan30.setBounds(160, 260, 40, 80);
        this.add(pan30);
        JPanel pan31 = new JPanel();
        Color color31 = new Color(246, 205, 175);
        pan31.setBackground(color31);
        pan31.setBounds(180, 280, 40, 80);
        this.add(pan31);
        JPanel pan32 = new JPanel();
        Color color32 = new Color(246, 205, 175);
        pan32.setBackground(color32);
        pan32.setBounds(200, 320, 40, 60);
        this.add(pan32);
        JPanel pan34 = new JPanel();
        pan34.setBackground(color.black);
        pan34.setBounds(220, 260, 40, 40);
        this.add(pan34);
        JPanel pan33 = new JPanel();
        Color color33 = new Color(245, 137, 57);   //oarangeeee
        pan33.setBackground(color33);
        pan33.setBounds(180, 260, 120, 40);
        this.add(pan33);
        JPanel pan35 = new JPanel();
        pan35.setBackground(color.black);
        pan35.setBounds(280, 260, 40, 40);
        this.add(pan35);
        JPanel pan36 = new JPanel();
        pan36.setBackground(color.black);
        pan36.setBounds(120, 320, 40, 60);
        this.add(pan36);
        JPanel pan37 = new JPanel();
        pan37.setBackground(color.black);
        pan37.setBounds(140, 280, 40, 60);    //ancho alto   
        this.add(pan37);
        JPanel pan81 = new JPanel();
        pan81.setBackground(color.orange);
        pan81.setBounds(240, 280, 40, 40);
        this.add(pan81);
        JPanel pan38 = new JPanel();
        pan38.setBackground(color.black);
        pan38.setBounds(200, 280, 40, 60);
        this.add(pan38);
        JPanel pan39 = new JPanel();    
        pan39.setBackground(color.black);
        pan39.setBounds(220, 320, 60, 40);
        this.add(pan39);
        JPanel pan40 = new JPanel();
        pan40.setBackground(color.black);
        pan40.setBounds(260, 300, 40, 40);
        this.add(pan40);
        JPanel pan41 = new JPanel();
        Color color41 = new Color(245, 137, 57);
        pan41.setBackground(color41);
        pan41.setBounds(200, 280, 120, 40);
        this.add(pan41);
        JPanel pan42 = new JPanel();
        pan42.setBackground(color.black);
        pan42.setBounds(300, 280, 40, 40);
        this.add(pan42);
        JPanel pan43 = new JPanel();
        pan43.setBackground(color.black);
        pan43.setBounds(320, 260, 40, 40);
        this.add(pan43);
        JPanel pan44 = new JPanel();
        pan44.setBackground(color.black);
        pan44.setBounds(340, 240, 40, 40);
        this.add(pan44);
        JPanel pan45 = new JPanel();
        pan45.setBackground(color.black);
        pan45.setBounds(380, 40, 40, 40);
        this.add(pan45);
        JPanel pan57 = new JPanel();
        pan57.setBackground(color.yellow);   //amarillo
        pan57.setBounds(400, 120, 40, 80);
        this.add(pan57);
        JPanel pan58 = new JPanel();
        pan58.setBackground(color.yellow);   //amarillo
        pan58.setBounds(380, 140, 40, 80);
        this.add(pan58);
        JPanel pan48 = new JPanel();
        pan48.setBackground(color.red);   //rojo
        pan48.setBounds(360, 120, 40, 80);
        this.add(pan48);
        JPanel pan49 = new JPanel();
        pan49.setBackground(color.red);   //rojo
        pan49.setBounds(380, 60, 40, 180);
        this.add(pan49);
        JPanel pan50 = new JPanel();
        pan50.setBackground(color.red);   //rojo
        pan50.setBounds(400, 80, 40, 140);
        this.add(pan50);
        JPanel pan51 = new JPanel();
        pan51.setBackground(color.red);   //rojo
        pan51.setBounds(360, 120, 40, 80);
        this.add(pan51);
        JPanel pan56 = new JPanel();
        pan56.setBackground(color.red);   //rojo
        pan56.setBounds(420, 120, 40, 80);
        this.add(pan56);
        JPanel pan46 = new JPanel();
        pan46.setBackground(color.black);
        pan46.setBounds(440, 120, 40, 80);
        this.add(pan46);
        JPanel pan47 = new JPanel();
        pan47.setBackground(color.black);
        pan47.setBounds(340, 120, 40, 80);
        this.add(pan47);
        JPanel pan52 = new JPanel();
        pan52.setBackground(color.black);
        pan52.setBounds(360, 60, 40, 80);
        this.add(pan52);
        JPanel pan53 = new JPanel();
        pan53.setBackground(color.black);
        pan53.setBounds(400, 60, 40, 40);
        this.add(pan53);
        JPanel pan54 = new JPanel();
        pan54.setBackground(color.black);
        pan54.setBounds(420, 80, 40, 60);
        this.add(pan54);
        JPanel pan55 = new JPanel();
        pan55.setBackground(color.black);
        pan55.setBounds(360, 180, 40, 80);
        this.add(pan55);
        JPanel pan59 = new JPanel();
        pan59.setBackground(color.black);
        pan59.setBounds(420, 160, 40, 40);
        this.add(pan59);
        JPanel pan60 = new JPanel();
        pan60.setBackground(color.black);
        pan60.setBounds(400, 200, 40, 80);
        this.add(pan60);
        JPanel pan61 = new JPanel();
        pan61.setBackground(color.black);
        pan61.setBounds(420, 180, 40, 40);
        this.add(pan61);
        JPanel pan62 = new JPanel();
        pan62.setBackground(color.black);
        pan62.setBounds(380, 260, 40, 60);
        this.add(pan62);
        JPanel pan63 = new JPanel();
        pan63.setBackground(color.black);
        pan63.setBounds(360, 300, 40, 40);
        this.add(pan63);
        JPanel pan64 = new JPanel();
        pan64.setBackground(color.black);
        pan64.setBounds(340, 320, 40, 40);
        this.add(pan64);
        JPanel pan65 = new JPanel();
        pan65.setBackground(color.black);
        pan65.setBounds(320, 300, 40, 80);
        this.add(pan65);
        JPanel pan66 = new JPanel();
        pan66.setBackground(color.black);
        pan66.setBounds(300, 360, 40, 60);
        this.add(pan66);
        JPanel pan67 = new JPanel();
        pan67.setBackground(color.black);
        pan67.setBounds(240, 400, 80, 40);
        this.add(pan67);
        JPanel pan68 = new JPanel();
        pan68.setBackground(color.black);
        pan68.setBounds(220, 380, 40, 40);
        this.add(pan68);
        JPanel pan69 = new JPanel();
        pan69.setBackground(color.black);
        pan69.setBounds(140, 360, 100, 40);
        this.add(pan69);
        JPanel pan72 = new JPanel();
        pan72.setBackground(color.black);
        pan72.setBounds(180, 340, 40, 40);
        this.add(pan72);
        JPanel pan70 = new JPanel();
        Color color70 = new Color(245, 137, 57);   //oarangeeee
        pan70.setBackground(color70);
        pan70.setBounds(140, 320, 60, 40);
        this.add(pan70);
        JPanel pan71 = new JPanel();
        Color color71 = new Color(245, 137, 57);   //oarangeeee
        pan71.setBackground(color71);
        pan71.setBounds(160, 340, 40, 40);
        this.add(pan71);
        JPanel pan73 = new JPanel();
        Color color73 = new Color(245, 137, 57);   //oarangeeee
        pan73.setBackground(color73);
        pan73.setBounds(220, 360, 100, 40);
        this.add(pan73);
        JPanel pan74 = new JPanel();
        Color color74 = new Color(245, 137, 57);   //oarangeeee
        pan74.setBackground(color74);
        pan74.setBounds(260, 380, 40, 40);
        this.add(pan74);
        JPanel pan75 = new JPanel();
        Color color75 = new Color(245, 137, 57);   //oarangeeee
        pan75.setBackground(color75);
        pan75.setBounds(280, 300, 40, 100);
        this.add(pan75);
        JPanel pan76 = new JPanel();
        Color color76 = new Color(245, 137, 57);   //oarangeeee
        pan76.setBackground(color76);
        pan76.setBounds(300, 340, 40, 40);
        this.add(pan76);
        JPanel pan77 = new JPanel();
        Color color77 = new Color(245, 137, 57);   //oarangeeee
        pan77.setBackground(color77);
        pan77.setBounds(340, 260, 40, 80);
        this.add(pan77);
        JPanel pan78 = new JPanel();
        Color color78 = new Color(245, 137, 57);   //oarangeeee
        pan78.setBackground(color78);
        pan78.setBounds(320, 280, 80, 40);
        this.add(pan78);
        JPanel pan79 = new JPanel();
        Color color79 = new Color(245, 137, 57);   //oarangeeee
        pan79.setBackground(color79);
        pan79.setBounds(240, 300, 40, 40);
        this.add(pan79);
        JPanel pan80 = new JPanel();
        pan80.setBackground(color.orange);
        pan80.setBounds(220, 300, 40, 40);
        this.add(pan80);
        JPanel pan82 = new JPanel();
        pan82.setBackground(color.orange);
        pan82.setBounds(220, 340, 80, 40);
        this.add(pan82);
        JPanel pan83 = new JPanel();
        pan83.setBackground(color.orange);
        pan83.setBounds(260, 320, 40, 40);
        this.add(pan83);
        JPanel pan84 = new JPanel();
        pan84.setBackground(color.orange);
        pan84.setBounds(300, 300, 40, 60);
        this.add(pan84);
        JPanel pan85 = new JPanel();
        pan85.setBackground(color.orange);
        pan85.setBounds(380, 220, 40, 60);
        this.add(pan85);
        JPanel pan86 = new JPanel();
        pan86.setBackground(color.orange);
        pan86.setBounds(360, 240, 40, 60);
        this.add(pan86);

        //FONDO
        JPanel pan88 = new JPanel();
        Color color88 = new Color(164, 224, 243);
        pan88.setBackground(color88);
        pan88.setBounds(0, 0, 1000, 1000);
        this.add(pan88);
        

        //, uml jframe, movimiento, 
    }
        
   

    public static void main(String[] args) {
        Ventana1 ventana1 = new Ventana1();
         
        

    }
}

    