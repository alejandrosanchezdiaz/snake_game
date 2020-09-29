package Snake_V1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements Runnable, KeyListener {

    Graphics gfx;
    Image img;

    public void init(){
        this.resize(400, 400);
        img = createImage(400,400);
        gfx = img.getGraphics();
    }

    public void paint(Graphics g){
        gfx.setColor(Color.black);
        gfx.fillRect(0,0,400,400);

        g.drawImage(img,0,0,null);
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
        if(e.getKeyCode() == KeyEvent.VK_UP){

        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){

        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){

        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){

        }
    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}
