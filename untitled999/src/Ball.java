import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ball extends JLabel implements Runnable {
    private ImageIcon iconball = new ImageIcon("球.png");
    private ImageIcon bombbs = new ImageIcon("1.png");
    private JLabel jlb = new JLabel();
    private int x,y;
    private Timer t1,t2;
    private int i = 0;
    private boolean show =false;
    private boolean bomb = false;
    public Ball(int x1, int y1) {
        x = x1;
        y = y1;
        t1 = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ball.this.setIcon(bombbs);
            }
        });
        t2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ball.this.setIcon(null);
            }
        });
    }
    @Override
    public void run() {
        t1.start();
//        while (true) {
//
//            i++;
//
//            System.out.println(i);
//            if (i >= 3) {
//                break;
//            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        //////////////////////////////////
//        System.out.println("爆炸動畫");
//        //////////////////////////////////
//        show = false;
//        bomb = false;
//        i = 0;
//        Ball.this.setIcon(null);
    }
//
//    public void setShow(boolean show) {
//        Ball.this.setIcon(iconball);
//        this.show = show;
//    }
//    public boolean getShow(){
//        return show;
//    }
//    public void setBomb(boolean bomb){
//        Ball.this.setIcon(bombbs);
//        this.bomb = bomb;
//    }
//    public boolean getBomb(){
//        return bomb;
//    }
}