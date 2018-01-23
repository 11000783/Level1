import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
public static void main(String[] args) {
	SlotMachine slot = new SlotMachine();
	slot.run();
}
JFrame frame = new JFrame();
JPanel pan = new JPanel();
JButton butt1 = new JButton("Spin");
JLabel label1 = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JLabel label4 = new JLabel();
Random fred = new Random();

private void run() {
	// TODO Auto-generated method stub
frame.add(pan);
pan.add(butt1);
pan.add(label1);
pan.add(label2);
pan.add(label3);
pan.add(label4);
butt1.addActionListener(this);
frame.pack();
frame.setVisible(true);
frame.setSize(200, 100);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int rad = fred.nextInt(5);
	Random trend = new Random();
	int rad2 = trend.nextInt(5);
	Random trent = new Random();
	int rad3 = trent.nextInt(5);

	label1.setText("" + rad);
	label2.setText(""+ rad2);
	label3.setText(""+ rad3);
	if (label1.getText().equals(label2.getText()) && label1.getText().equals(label3.getText())) {
		label4.setText("You Won");
	}
	else {
		label4.setText("You Lost");
	}
}
}
