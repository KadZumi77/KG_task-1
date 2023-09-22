package kg_task_1;

import kg_task_1.objects.Back;
import kg_task_1.objects.Mount1;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel{

    private int partWidth;
    private int partHeight;
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Back background = new Back();
        background.draw(g, getWidth(), getHeight());


        Mount1 mountain1 = new Mount1();
        mountain1.draw(g, getWidth(), getHeight(), partHeight * 48);
    }
}
