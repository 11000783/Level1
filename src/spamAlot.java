import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamAlot {
public static void main(String[] args) {
JFrame fram = new JFrame("spamers hackers");
JPanel pan = new JPanel();
JButton butt = new JButton("good");
JButton bu = new JButton("bad");
JTextField text = new JTextField();
text.setColumns(6);
fram.setVisible(true);

fram.add(pan);
pan.add(butt);
pan.add(bu);
pan.add(text);
fram.pack();
}
}