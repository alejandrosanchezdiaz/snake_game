package Snake_V1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements Runnable, KeyListener {

    public void init(){
        this.resize(400, 400);
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0,0,400,400);
    }

    public void update(Graphics g){
        paint(g);
    }

    public void repaint(Graphics g){
        paint(g);
    }

    public void run() {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
