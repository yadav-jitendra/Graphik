package grundlagen;

import java.awt.*;

public class Fenster extends Frame {
    private String name;

    Fenster(String title) {
        super(title);
        add(new Rechteck());

        setBackground(Color.yellow.darker());
        setSize(700, 550);
        setLocation(200, 20);

        addWindowListener(new WindowClosingAdapter());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Fenster("Jitendra");
    }
}
