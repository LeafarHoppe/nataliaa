package natalia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundPanel extends JFrame {
    
    Font fonte = new Font("Arial", Font.BOLD, 50);
    
    ImageIcon img = new ImageIcon(getClass().getResource("Natalia1.jpg"));
    JLabel labimg = new JLabel(img);
    
    Graf gr;

    public BackgroundPanel() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        gr = new Graf();
        add(gr);
    }
    
    public class Graf extends JPanel{
        public void paintComponent(Graphics g){
        super.paintComponent(g);
        labimg.setBounds(0, 0, 500, 500);
        add(labimg);
        
        Graphics2D letra = (Graphics2D) g;
        letra.setFont(fonte);
        letra.setColor(Color.red);
        letra.drawString("Olá, mundo!", 100, 100);
    }
    }
    
    public static void main(String[] args) {
        new BackgroundPanel();
    }
        
}