import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class twitter implements ActionListener {
	JFrame fram = new JFrame();
	 JPanel pan = new JPanel();
	 JButton but = new JButton();
	 JTextField fei = new JTextField(6);

		public static void main(String[] args) {
			twitter tweet = new twitter();
			tweet.run();
		}
 void run(){
	 but.addActionListener(this);
fram.setVisible(true);
fram.add(pan);
pan.add(but);
pan.add(fei);
 fram.pack();
 }
@Override

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
