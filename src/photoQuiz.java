 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
	
		// 2. create a variable of type "Component" that will hold your image
String URl = "https://qph.ec.quoracdn.net/main-qimg-57bb938d73830771f2b50f4eca310271-c";
	// 3. use the "createImage()" method below to initialize your Component
Component UTR;
UTR = createImage(URl);
		// 4. add the image to the quiz window
quizWindow.add(UTR);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String awn = JOptionPane.showInputDialog("Is there a cat in this photo");
		// 7. print "CORRECT" if the user gave the right answer
if(awn.equals("no")){
	JOptionPane.showMessageDialog(null,"Correct");}
		// 8. print "INCORRECT" if the answer is wrong
if(awn.equals("yes")){
	JOptionPane.showMessageDialog(null,"Incorrect, there is two cats");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(UTR);
		// 10. find another image and create it (might take more than one line of code)
String url = "http://www.english-heritage.org.uk/remote/www.english-heritage.org.uk/content/properties/stonehenge/portico/2670999/stonehenge-sunrise?w=640&mode=none&scale=downscale&quality=60&anchor=middlecenter";

		// 11. add the second image to the quiz window
Component utr;
utr = createImage(url);
quizWindow.add(utr);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String today = JOptionPane.showInputDialog(null,"Is this a calender built by the kelts?");
		// 14+ check answer, say if correct or incorrect, etc.
if (today.equals("yes")){
	JOptionPane.showMessageDialog(null,"Correct");
}
if (today.equals("no")){
	JOptionPane.showMessageDialog(null,"Incorrect");
	}
	}
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




