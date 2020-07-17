package grundlagen;

import java.awt.*;

public class MultiWindow extends Frame {

    public MultiWindow(String title) throws HeadlessException {
        super(title);
        setBackground(Color.YELLOW.darker());
        setSize(400, 200);
        add(new Rechteck());
        addWindowListener(new WindowClosingAdapter());
        setVisible(true);
    }

    public static void main(String[] args) {
        MultiWindow f1, f2, f3;
        f1 = new MultiWindow("first window");
        f2 = new MultiWindow("second window");
        f3 = new MultiWindow("third window");
        f1.setLocation(200, 200);
        f2.setLocation(400, 300);
        f3.setLocation(600, 400);

    }
}
