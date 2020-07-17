package grundlagen;

import java.awt.*;

public class CloseWindowMain {
    public static void main(String[] args) {
        Frame window = new Frame();
        window.addWindowListener(new WindowClosingAdapter());
        window.setSize(400, 300);
        window.setVisible(true);
    }
}
