import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class practice2 implements ActionListener {
public static void main(String[] args) {
	practice2 pract = new practice2();
pract.run();
}
 JFrame frame = new JFrame();
 JPanel pan = new JPanel();
 JButton butt1 = new JButton();
 JButton butt2 = new JButton();
private void run() {
	// TODO Auto-generated method stub
frame.add(pan);
pan.add(butt1);
pan.add(butt2);
butt1.addActionListener(this);
butt2.addActionListener(this);
frame.pack();
frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonpressed = (JButton)e.getSource();
	if(buttonpressed == butt1){
		System.out.println("You pressed button 1");
	}
	else if (buttonpressed == butt2) {
		System.out.println("You pressed button 2");
	}
}
}
