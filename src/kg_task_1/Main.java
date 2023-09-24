package kg_task_1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow startFrame = new MainWindow();
        int centerX = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 50);
        int centerY = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 50);


        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        startFrame.setLocationRelativeTo(null); //положение фрейма по центру
        startFrame.setLocation(centerX, centerY);

        startFrame.setVisible(true);

        startFrame.setSize(1000, 600);
    }
}