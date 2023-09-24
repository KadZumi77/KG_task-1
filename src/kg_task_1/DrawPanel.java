package kg_task_1;

import kg_task_1.objects.*;
import kg_task_1.objects.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel{

    private int partWidth;
    private int partHeight;

    private Sun sun;

    private Character character;
    private int dragonY;
    private boolean dragonTop;
    private int dragonAmplitude;

    public DrawPanel() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                update();
                repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 1000 / 60);

        character = new Character(0, 0);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                character.setX(character.getX()+2);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }
        });
    }

    private void update() {
        if (dragonTop) {
            dragonAmplitude++;
            if (dragonAmplitude == 60) {
                dragonTop = false;
            }
        } else {
            dragonAmplitude--;
            if (dragonAmplitude == -60) {
                dragonTop = true;
            }
        }
        dragonY = (int) (20 * Math.sin(dragonAmplitude * 0.01f));
    }



    /*public void DrawPanel() {
        character = new Character(0, 0);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                character.setX(character.getX() + 1);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }
        });
    }*/

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        partWidth = getWidth() / 100;
        partHeight = getHeight() / 100;

        Back background = new Back();
        background.draw(g, getWidth(), getHeight());


        Mount1 mountain1 = new Mount1();
        mountain1.draw(g, getWidth(), getHeight(), partHeight);

        Mount2 mountain2 = new Mount2();
        mountain2.draw(g, getWidth(), getHeight(), partHeight);

        Dragon dragon = new Dragon();
        dragon.draw(g, partWidth , dragonY);

        Ground ground = new Ground();
        ground.draw(g, getWidth(), getHeight());

        //Character character = new Character(0, 0);
        character.draw(g);

        sun = new Sun(200, 100, 50, 70, 15, Color.YELLOW);
        sun.draw(g);


    }



    /*@Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            character.setX(character.getX()+2);
            repaint();
        }
    }*/

}
