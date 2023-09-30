package kg_task_1;

import kg_task_1.objects.*;
import kg_task_1.objects.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawPanel extends JPanel {

    private int width =1000;
    private int height = 600;
    private int partWidth;
    private int partHeight;
    private final Back background;
    private final Ground ground;
    private final Mount1 mountain1;
    private final Mount2 mountain2;
    private final Sun sun;
    private final Tablo tablo;
    private final Character character;
    private final Dragon dragon;
    private boolean dragonTop = false;
    private int dragonAmplitude = 0;

    private boolean isMove = false;
    private boolean backMove = false;

    public DrawPanel() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                update();
                repaint();
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 2, 1000 / 60);

        background = new Back(1000, 600);
        ground = new Ground(1000, 400);
        mountain1 = new Mount1(1000, 500, partHeight);
        mountain2 = new Mount2(1000, 500, partHeight);
        dragon = new Dragon(partWidth, partHeight+40);
        sun = new Sun(200, 100, 50, 70, 15, Color.YELLOW);
        tablo = new Tablo(partWidth, partHeight);

        character = new Character(partWidth, partHeight);

        MyKey listener = new MyKey();
        addKeyListener(listener);
        setFocusable(true);
        /*this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //character.setX(character.getX()+4);
                //repaint();
                isMove = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isMove = false;
            }
        });*/

        /*this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    isMove=true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                isMove = false;
            }
        });*/

    }

    private void update() {
        if (isMove && character.getX()<width-300){
            character.setX(character.getX() + 2);
            }
        if (backMove && character.getX()>-100){
            character.setX(character.getX() - 2);
            }

        if (dragonTop) {
            dragonAmplitude++;
            if (dragonAmplitude == 50) {
                dragonTop = false;
            }
        } else {
            dragonAmplitude--;
            if (dragonAmplitude == -50) {
                dragonTop = true;
            }
        }
        dragon.setStartY((dragon.getStartY() + (int) (5 * Math.sin(dragonAmplitude * 0.01f))));
    }


    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        background.draw(g);

        mountain1.draw(g);

        mountain2.draw(g);

        dragon.draw(g);

        ground.draw(g);

        character.draw(g);

        sun.draw(g);

        tablo.draw(g);


    }

    private class MyKey implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                isMove = true;

            }
            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                backMove = true;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            isMove = false;
            backMove = false;
        }
    }

}
