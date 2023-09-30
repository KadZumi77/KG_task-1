package kg_task_1.objects;

import java.awt.*;

public class Ground {

    private int height;
    private int width;

    public Ground(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void draw(Graphics2D g) {
        g.setPaint(new Color(101, 57, 24));
        g.fillRect(0, 500, width, height);

        g.setPaint(new Color(15, 126, 25));
        g.fillRect(0, 500, width, 20);
    }
}
