import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JButton button1 = new JButton();

	public static void main(String[] args) {
		TootMachine machine = new TootMachine();
		machine.drawButton();
	}

	private void drawButton() {
		// TODO Auto-generated method stub
		frame.add(pan);
		pan.add(button1);
		frame.setSize(200, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addActionListener(this);
		frame.setVisible(true);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if (buttonPressed == button1) {
			playSound("Fart-Squeeze-Yer-Knees_Mike-Koenig.wav");
		}
	}
}
