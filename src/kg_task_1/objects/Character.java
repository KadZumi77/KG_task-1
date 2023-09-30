package kg_task_1.objects;

import java.awt.*;

public class Character {
    private int x;
    private int y;


    public Character(int x, int y) {
        this.y = y;
        this.x = x;
    }


    public void draw(Graphics2D g) {
        //ноги
        g.setPaint(new Color(59, 39, 26));
        g.fillOval(x + 130, y + 505, 20, 12);
        g.fillOval(x + 160, y + 505, 20, 12);
        //левая рука
        g.setPaint(new Color(133, 125, 122));
        g.fillOval(x + 174, y + 460, 15, 40);
        //рукоять меча 1
        g.setPaint(new Color(21, 20, 20));
        g.fillRect(x + 170, y + 485, 25, 7);
        //рукоять меча 2
        g.setPaint(new Color(180, 155, 92));
        g.fillRect(x + 190, y + 477, 5, 23);
        //лезвие(прямоугольник)
        g.setPaint(new Color(164, 163, 155));
        g.fillRect(x + 195, y + 479, 80, 19);
        //блик на лезвии
        g.setPaint(new Color(211, 211, 209));
        g.fillRect(x + 195, y + 479, 80, 5);
        //туловище
        g.setPaint(new Color(96, 91, 89));
        g.fillOval(x + 127, y + 440, 55, 70);
        //шлем
        g.setPaint(new Color(68, 66, 62));
        g.fillRect(x + 134, y + 440 - 35, 45, 50);

        g.setPaint(new Color(19, 18, 18));
        g.fillRect(x + 145, y + 440 - 20, 30, 10);
        //правая рука
        g.setPaint(new Color(133, 125, 122));
        g.fillOval(x + 120, y + 460, 15, 40);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}   
