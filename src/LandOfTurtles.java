import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		// 1. Create a frame & make it visible
		JFrame fram = new JFrame();

		fram.setVisible(true);
	
		// 2. Add the panel to the frame
		fram.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
				//"data:image/jpeg;base64,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");
		// 4. Instantiate a Turtle

		// 5. Add the turtle to the panel

		// 6. Put 50 Turtles on the beach
		for (int i = 0; i < 50; i++) {
			Turtle turt = new Turtle();
			int ian = new Random().nextInt(800);
			turt.setX(ian);
			panel.addTurtle(turt);

		}
		fram.pack();}
}
