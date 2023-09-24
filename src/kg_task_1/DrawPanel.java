package kg_task_1;

import kg_task_1.objects.Back;
import kg_task_1.objects.Dragon;
import kg_task_1.objects.Mount1;
import kg_task_1.objects.Mount2;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel{

    private int partWidth;
    private int partHeight;
    private int dragonY;
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Back background = new Back();
        background.draw(g, getWidth(), getHeight());


        Mount1 mountain1 = new Mount1();
        mountain1.draw(g, getWidth(), getHeight(), partHeight);

        Mount2 mountain2 = new Mount2();
        mountain2.draw(g, getWidth(), getHeight(), partHeight);

        Dragon dragon = new Dragon();
        dragon.draw(g,  partWidth , dragonY);
    }
}
