import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculature implements ActionListener {
public static void main(String[] args) {
	Calculature calc = new Calculature();
	calc.run();
}
JFrame frame = new JFrame();
JPanel pan = new JPanel();
JButton but1 = new JButton("addition");
JButton but2 = new JButton("multiplication");
JButton but3 = new JButton("Exponent");
JButton but4 = new JButton("squareroot");
JTextField field = new JTextField(3);
JTextField field2 = new JTextField(3);
JLabel label = new JLabel();

private void run() {
	// TODO Auto-generated method stub
frame.add(pan);
pan.add(but1);
pan.add(but2);
pan.add(but3);
pan.add(but4);
pan.add(label);
pan.add(field);
pan.add(field2);
frame.pack();
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
but1.addActionListener(this);
but2.addActionListener(this);
but3.addActionListener(this);
but4.addActionListener(this);
}

public int multiply(int a, int b) {
	return (a * b);
}
public int addation(int a, int b) {
	return (a + b);
}
public double squareroot(double a) {
	double awnser = Math.sqrt(a);
	return (awnser);
}
public double exponent(double a, double b) {
	double result = Math.pow(a,b);
	return (result);	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == but2) {
		String input1 = field.getText();
		String input2 = field2.getText();
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);
		int awns = multiply(int1, int2);
		String awn = Integer.toString(awns);
		label.setText(awn);
}
	if (buttonPressed == but1) {
		String input1 = field.getText();
		String input2 = field2.getText();
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);
		int awns = addation(int1, int2);
		String awn = Integer.toString(awns);
		label.setText(awn);
}
	if (buttonPressed == but4) {
		String input1 = field.getText();
		String input2 = field2.getText();
		int int1 = Integer.parseInt(input1);
		double awns = squareroot(int1);
		String awn = Double.toString(awns);
		label.setText(awn);
}
	if (buttonPressed == but3) {
		String input1 = field.getText();
		String input2 = field2.getText();
		int int1 = Integer.parseInt(input1);
		int int2 = Integer.parseInt(input2);
		double awns = exponent(int1, int2);
		String awn = Double.toString(awns);
		label.setText(awn);
}
	}
	}
	
