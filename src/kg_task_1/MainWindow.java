package kg_task_1;

import javax.swing.*;

public class MainWindow extends JFrame {
    private final DrawPanel drawPanel;

    public MainWindow() {
        drawPanel = new DrawPanel();
        this.add(drawPanel);
    }
}
