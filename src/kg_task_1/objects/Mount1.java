package kg_task_1.objects;

import kg_task_1.Utils;

import java.awt.*;
import java.util.List;

public class Mount1 {
    private int width;
    private int height;
    private int startY;

    public Mount1(int width, int height, int startY) {

        this.width = width;
        this.height = height;
        this.startY = startY;
    }
    public void draw(Graphics2D g) {
        int[] x = {-10, 0, 110, 270, 360, 530, 630, 675, 880, 990, 1160, 1300, 1300};
                //-10, 0, 140, 300, 400, 570, 630, 670, 860, 1000, 1300, 1500};
        int[] y = {600, startY+300, startY + 180, startY + 360, startY +210, startY +385,
                startY +310, startY +350, startY +160, startY + 290, startY+155, startY+300, 600};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int) (height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(154, 168, 176), new Color(41, 49, 58)}));
        g.fillPolygon(x, y, x.length);
    }

}
