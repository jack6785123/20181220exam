import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ball extends JLabel implements Runnable {
    private ImageIcon iconball = new ImageIcon("球.png");
    private ImageIcon bombbs = new ImageIcon("1.png");
    private int x,y;
    private int i = 0;
    private boolean show =false;
    private boolean bomb = false;
    public ball() {
        init();

    }
    public void init(){

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
            if(x>0){

            }


        }
        //////////////////////////////////
        System.out.println("爆炸動畫");
            //////////////////////////////////
            show = false;
            i = 0;
            ball.this.setIcon(null);
        }
    public void setShow(boolean show) {
        ball.this.setIcon(iconball);
        this.show = show;
    }
    public boolean getShow(){
        return show;
    }
    public void setBomb(boolean bomb){
        ball.this.setIcon(bombbs);
        this.bomb = bomb;
    }
    public boolean getBomb(){
        return bomb;
    }
}
