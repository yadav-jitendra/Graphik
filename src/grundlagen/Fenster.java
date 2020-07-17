package grundlagen;

import java.awt.*;

public class Fenster extends Frame {
    private String name;

    Fenster(String name) {
        super(name);
        add(new Rechteck());
        setBackground(Color.yellow);
        setSize(200, 150);
        setLocation(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fenster("Jitendra");
    }
}
