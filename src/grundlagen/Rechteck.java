package grundlagen;

import java.awt.*;

public class Rechteck extends Canvas {

    public void paint(Graphics g){
        g.setColor(Color.red);            // first set color of the object
        g.fillRect(20, 20, 100, 40);    // then create the object

        g.setColor(Color.BLACK);           // first set color of the object
        g.drawString("Red Rectangle", 25, 40);  // then create the object

        setLocation(20, 15);        // location of the canvas
    }
}
