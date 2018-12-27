import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

import java.awt.event.*;
import java.io.*;

public class DoubleGames extends JFrame {
    private ImageIcon icon = new ImageIcon("aa.png");
    private  JLabel jlb = new JLabel();
    private JLabel jlb2 = new JLabel();
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenw = screenSize.width;
    private int screenh = screenSize.height;
    private int frw =800 , frh =500 ;
    Login li;
    private int  weight = 800 , hight = 460;
    public DoubleGames(Login lg){
        li = lg;
        ex1();
    }
    public void ex1() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(screenw/2-frw/2,screenh/2-frh/2,frw,frh);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Login fr = new Login();
                fr.setVisible(true);
            }
        });
        this.setLayout(null);
        jlb.setOpaque(true);
        this.add(jlb);
        Image img = icon.getImage();
        Image img1 = img.getScaledInstance(800,500,Image.SCALE_SMOOTH);
        icon.setImage(img1);
        jlb.setIcon(icon);
        jlb.setBounds(0, 0, 800, 500);
        jlb.add(jlb2);
        jlb2.setBounds(0, 0, 80, 80);
        this.setResizable(false);






    }
}