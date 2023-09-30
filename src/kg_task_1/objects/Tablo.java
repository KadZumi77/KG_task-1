package kg_task_1.objects;

import java.awt.*;

public class Tablo {
    private int startX;
    private int startY;

    public Tablo(int startX, int startY) {
        this.startX=startX;
        this.startY=startY;
    }
    public void draw(Graphics2D g) {
        g.setPaint(new Color(79, 32, 5));
        g.fillRect(830, 480, 20, 70);

        g.setPaint(new Color(79, 32, 5));
        int[] x = {startX + 729, startX + 866, startX + 866, startX + 901, startX + 902,
                startX + 912, startX + 934, startX + 918, startX + 909,
                startX + 912, startX + 866, startX + 866, startX + 801,
                startX + 809, startX + 774, startX + 729, startX + 729};
        int[] y = {startY + 421, startY + 421,startY + 378, startY + 409,
                startY + 426, startY + 422, startY + 446, startY + 468,
                startY + 457, startY + 475, startY + 521, startY + 480, startY + 480,
                startY + 464, startY + 480, startY + 480, startY + 421};

        g.fillPolygon(x, y, x.length);

        //Draw String
        g.setPaint(new Color(0, 0, 0));
        g.setFont(new Font("Consolas", Font.BOLD, 16));
        g.drawString("The Princess is there", startX + 737, startY + 453);
    }
}
