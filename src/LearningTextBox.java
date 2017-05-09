import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LearningTextBox {

JFrame window = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField text = new JTextField(10);
	void createWindow(){
	window.add(panel);
	window.setVisible(true);
panel.add(text);
window.pack();
panel.add(button);
window.setSize(1000,1000);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
button.addActionListener((e)->{
		String results = text.getText();
		System.out.println(results);
	});
	}	
}
