
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ball extends JLabel implements Runnable {
    private ImageIcon iconball = new ImageIcon("球.png");
    private int i = 0;
    private boolean show =false;
    public Ball() {

    }

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
            if (i >= 3) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //////////////////////////////////

        System.out.println("爆炸動畫");
        
        //////////////////////////////////
        show=false;
        i=0;
        Ball.this.setIcon(null);
    }
    public void setShow(boolean show) {
        Ball.this.setIcon(iconball);
        this.show = show;
    }
    public boolean getShow(){
        return show;
    }
}