import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {
	 public static void main(String[] args) throws MalformedURLException {
		JFrame fram = new JFrame("Ferit fails");
JLabel lab;
String urlOfAnimalSuckingAtJumping = "http://78.media.tumblr.com/fb876f3b0bd087d90343e2af61f28b8c/tumblr_nlgpkxfK8P1s612eao1_500.gif";
lab = createImage(urlOfAnimalSuckingAtJumping);
fram.add(lab);
fram.setVisible(true);
fram.setLocationRelativeTo(null);
fram.pack();



	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: 
	         * 		- have a title such as "Gerbil Fail"
	         */

		 
	       
	    }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}


