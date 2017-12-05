import java.awt.Dimension;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole {

	public static void main(String[] args) {
	whackAMole mole = new whackAMole(); 
		mole.drawButton();
	}
private void drawButton() {
	// TODO Auto-generated method stub
	JFrame fram = new JFrame();
JPanel pan = new JPanel();
JButton but10 = new JButton();
JButton but11 = new JButton();
JButton but12 = new JButton();
JButton but13 = new JButton();
JButton but14 = new JButton();
JButton but15 = new JButton();
fram.add(pan);
fram.setVisible(true);
pan.add(but10);
pan.add(but11);
pan.add(but12);
pan.add(but13);
pan.add(but14);
pan.add(but15);
fram.setPreferredSize(new Dimension(900, 900));
Random fred = new Random();
fred.nextInt(7);
}
	
}
