package kg_task_1;

import kg_task_1.objects.Back;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel{
    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        Back background = new Back();
        background.draw(g, getWidth(), getHeight());
    }
}
