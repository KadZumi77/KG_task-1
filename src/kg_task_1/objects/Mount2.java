package kg_task_1.objects;

import kg_task_1.Utils;

import java.awt.*;

public class Mount2 {
    private int width;
    private int height;
    private int startY;

    public Mount2(int width, int height, int startY) {

        this.width = width;
        this.height = height;
        this.startY = startY;
    }
    public void draw(Graphics2D g) {
        int[] x = {-10, 0, 220, 375, 500, 650, 850, 940, 1100, 1300, 1300};
                 //-10, 0, 110, 270, 360, 530, 630, 675, 880, 990, 1160, 1300, 1300
        int[] y = {600, startY+380, startY + 240, startY + 380, startY +290, startY +450,
                startY +270, startY + 390, startY+240, startY+380, 600};
        g.setPaint(new LinearGradientPaint(width / 2, Utils.findMin(y), width / 2, height - (int) (height / 20),
                new float[] {0.1f, 0.9f},
                new Color[] {new Color(186, 197, 204), new Color(63, 75, 91)}));
        g.fillPolygon(x, y, x.length);
    }
}
