import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy
	// its Location.
	String mirImage = "/Users/league/Desktop/Level1/src/Miranda_Sings.jpg";
	String emmaImage = "/Users/league/Desktop/Level1/src/55a674b1fff2c16856a6bd9e_emma-stone-aloha-miscast.jpg";
	String steveImage = "/Users/league/Desktop/Level1/src/stevecarell-presstour-1.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the
		// image.
		window.setSize(200, 200);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer

		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
		String awn = JOptionPane.showInputDialog("What celeb is this?!");
		if (awn.equals("Miranda Sings")) {
			JOptionPane.showConfirmDialog(null, "Correct");
			score++;
		} else {
			JOptionPane.showConfirmDialog(null, "Incorrect, it was Miranda Sings.");
		}
		showNextImage();
		
	window.setSize(200, 200);
	String aw = JOptionPane.showInputDialog("What celeb is this?!");
	if (aw.equals("Emma Stone")) {
		JOptionPane.showConfirmDialog(null, "Correct");
		score++;
	} else {
		JOptionPane.showConfirmDialog(null, "Incorrect, it was Emma Stone.");
	}
	showNextImage();
	window.setSize(200, 200);
	String wn = JOptionPane.showInputDialog("What celeb is this?!");
	if (wn.equals("Steve Carwell")) {
		JOptionPane.showConfirmDialog(null, "Correct");
		score++;
	} else {
		JOptionPane.showConfirmDialog(null, "Incorrect, it was Steve Carwell.");
	}
	
	
}
	
	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(mirImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(emmaImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(steveImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
