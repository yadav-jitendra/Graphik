package grundlagen;

import java.awt.*;

public class Rechteck extends Canvas {

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(20, 20, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Red Rectangle", 20, 20);
        setLocation(20, 15);
    }
}
