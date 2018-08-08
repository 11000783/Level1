import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class practice implements ActionListener {
public static void main(String[] args) {
	practice prac = new practice();
	prac.run();
}

JFrame frame = new JFrame();
JPanel pan = new JPanel();
JButton butt = new JButton();
JButton butt2 = new JButton();

public void run(){
	frame.add(pan);
	pan.add(butt);
	pan.add(butt2);
	frame.pack();
	frame.setVisible(true);
	butt.addActionListener(this);
	butt2.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonpressed = (JButton)e.getSource();
	if(buttonpressed == butt){
		System.out.println("You pressed button 1.");
	}
	else if(buttonpressed == butt2){
		System.out.println("You pressed button 1.");
	}	
}
}