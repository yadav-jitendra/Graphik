package grundlagen;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowClosingAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.out.println("closing window "+ e.getWindow().getName());
    }

    public static void main(String[] args) {
        Frame window = new Frame();
        window.addWindowListener(new WindowClosingAdapter());
        window.setSize(400, 300);
        window.setVisible(true);
    }
}
