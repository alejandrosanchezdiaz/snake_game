package Snake_V1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {

    List<Point> snakePoints;
    int xDir, yDir;
    boolean isMoving, elongate;

    final int STARTSIZE = 20, STARTX = 150, STARTY = 150;

    public Snake() {
        snakePoints = new ArrayList<Point>();
        xDir = 0;
        yDir = 0;
        isMoving = false;
        elongate = false;
        snakePoints.add(new Point(STARTX, STARTY));
        for (int i = 1; i < STARTSIZE; i++) {
            snakePoints.add(new Point(STARTX - i * 4, STARTY));
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        for (Point p : snakePoints) {
            g.fillRect(p.getX(), p.getY(), 4, 4);
        }
    }

    public void move() {
        Point temp = snakePoints.get(0);
        Point last = snakePoints.get(snakePoints.size() - 1);
        Point newStart = new Point(temp.getX() + xDir * 4, temp.getY() + yDir * 4);
        for(int i = snakePoints.size() - 1; i >= 1; i--){
            snakePoints.set(i, snakePoints.get(i - 1));
        }
        snakePoints.set(0, newStart);
    }

    public int getXDir() {
        return xDir;
    }

    public void setXDir(int x) {
        this.xDir = x;
    }

    public int getYDir() {
        return yDir;
    }

    public void setYDir(int y) {
        this.yDir = y;
    }

    //X position of head of snake
    public int getX() {
        return snakePoints.get(0).getX();
    }

    public int getY() {
        return snakePoints.get(0).getY();
    }


}
