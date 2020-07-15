package grundlagen;

import java.awt.*;

public class Rectangle extends Canvas {

    public void paint(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.fillRect(20, 20, 100, 40);
        graphics.setColor(Color.BLACK);
        graphics.drawString("Red Rectangle", 20, 20);
        setLocation(20, 15);
    }
}
