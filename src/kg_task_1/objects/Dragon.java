package kg_task_1.objects;

import java.awt.*;

public class Dragon {
    public void draw(Graphics2D g, int startX, int startY) {

        int[] x = {startX +646, startX +679, startX +726, startX +753, startX +751, startX +757, startX +761, startX +784, startX +806,
                startX +799, startX +831, startX +825, startX +849, startX +875, startX +855, startX +848, startX + 848, startX +857, startX +837,
                startX +813, startX +802, startX +789, startX +791, startX +808, startX +837, startX +866, startX +883, startX +880, startX +865, startX +837,
                startX +816, startX +802, startX +788, startX +774, startX +750, startX +729, startX +712, startX +697, startX +695, startX +688,
                startX +682, startX +689, startX +698, startX +711, startX +703, startX +714, startX +723, startX +711, startX +694, startX +699,
                startX +682, startX +646};

        int[] y = {startY+73, startY+74, startY+93, startY+127, startY+95, startY+77, startY+84, startY+53, startY+46, startY+53, startY+52, startY+58,
                startY+63, startY+79, startY+76, startY+82, startY+96, startY+120, startY+111, startY+115, startY+126, startY+149, startY+170, startY+188,
                startY+208, startY+211, startY+200, startY+213, startY+216, startY+217, startY+207, startY+198, startY+193, startY+181, startY+177,
                startY+176, startY+166, startY+150, startY+163, startY+150, startY+143, startY+138, startY+140, startY+136, startY+142, startY+152, startY+135,
                startY+113, startY+104, startY+98, startY+84, startY+73};

        g.setPaint(new Color(0, 0, 0));
        g.fillPolygon(x, y, x.length);
    }
}
