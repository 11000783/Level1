import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackAMole implements ActionListener {
	JFrame fram = new JFrame();
	JPanel pan = new JPanel();
	JButton but10 = new JButton();
	JButton but11 = new JButton();
	JButton but12 = new JButton();
	JButton but13 = new JButton();
	JButton but14 = new JButton();
	JButton but15 = new JButton();

	public static void main(String[] args) {
		whackAMole mole = new whackAMole();
		mole.drawButton();
	}

	private void drawButton() {
		// TODO Auto-generated method stub

		fram.add(pan);
		pan.add(but10);
		pan.add(but11);
		pan.add(but12);
		pan.add(but13);
		pan.add(but14);
		pan.add(but15);
		fram.setSize(200, 120);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Random fred = new Random();
		int rad = fred.nextInt(7);
		but10.addActionListener(this);
		but11.addActionListener(this);
		but12.addActionListener(this);
		but13.addActionListener(this);
		but14.addActionListener(this);
		but15.addActionListener(this);
		run(rad);
		fram.setVisible(true);
	}

	private void run(int buton) {
		// TODO Auto-generated method stub
		
if (buton == 1) {
	but11.setText("mole");
}
if (buton == 2) {
	but12.setText("mole");
}
if (buton == 3) {
	but13.setText("mole");
}
if (buton == 4) {
	but14.setText("mole");
}
if (buton == 5) {
	but15.setText("mole");
}
if (buton == 6) {
	but10.setText("mole");
}

	}
private void resetMoles()
{
	but10.setText("");
	but11.setText("");
	but12.setText("");
	but13.setText("");
	but14.setText("");
	but15.setText("");
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fram.dispose();
		resetMoles();
		drawButton();
		
	}
	
}
