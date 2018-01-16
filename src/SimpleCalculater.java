import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculater implements ActionListener {
	public static void main(String[] args) {
		SimpleCalculater simple = new SimpleCalculater();
		simple.run();
	}

	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JButton butt1 = new JButton("divison");
	JButton butt2 = new JButton("multiplaction");
	JButton butt3 = new JButton("subcration");
	JButton butt4 = new JButton("addation");
	JTextField field = new JTextField(3);
	JTextField field2 = new JTextField(3);
	JLabel label = new JLabel();

	private void run() {
		// TODO Auto-generated method stub
		frame.add(pan);
		pan.add(butt1);
		pan.add(butt2);
		pan.add(butt3);
		pan.add(butt4);
		pan.add(label);
		pan.add(field);
		pan.add(field2);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		butt1.addActionListener(this);
		butt2.addActionListener(this);
		butt3.addActionListener(this);
		butt4.addActionListener(this);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public int divide(int a, int b) {
		return (a / b);
	}

	public int substract(int a, int b) {
		return (a - b);
	}

	public int addation(int a, int b) {
		return (a + b);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == butt1) {
			String input1 = field.getText();
			String input2 = field2.getText();
			int int1 = Integer.parseInt(input1);
			int int2 = Integer.parseInt(input2);
			int awns = divide(int1, int2);
			String awn = Integer.toString(awns);
			label.setText(awn);

		}
		if (buttonPressed == butt2) {
			String input1 = field.getText();
			String input2 = field2.getText();
			int int1 = Integer.parseInt(input1);
			int int2 = Integer.parseInt(input2);
			int awns = multiply(int1, int2);
			String awn = Integer.toString(awns);
			label.setText(awn);

		}
		if (buttonPressed == butt3) {
			String input1 = field.getText();
			String input2 = field2.getText();
			int int1 = Integer.parseInt(input1);
			int int2 = Integer.parseInt(input2);
			int awns = substract(int1, int2);
			String awn = Integer.toString(awns);
			label.setText(awn);

		}
		if (buttonPressed == butt4) {
			String input1 = field.getText();
			String input2 = field2.getText();
			int int1 = Integer.parseInt(input1);
			int int2 = Integer.parseInt(input2);
			int awns = addation(int1, int2);
			String awn = Integer.toString(awns);
			label.setText(awn);

		}
	}

}
