import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class spamAlot implements ActionListener {
	static final String FAKE_USERNAME = "your-best-friend-bob@gmail.com";
	static final String FAKE_PASSWORD = "soupysoup";
	JFrame fram = new JFrame("spamers hackers");
JPanel pan = new JPanel();
JButton butt = new JButton("good");
JButton bu = new JButton("bad");
JTextField text = new JTextField();


public static void main(String[] args) {
spamAlot alot = new spamAlot();
alot.run();
}
private void run() {
	// TODO Auto-generated method stub
text.setColumns(6);	fram.setVisible(true);
fram.add(pan);
pan.add(butt);
pan.add(bu);
pan.add(text);
fram.pack();
bu.addActionListener(this);
butt.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String wil = "rwillia2004@gmail.com";
String sub = "This is a great, totally NOT spam, email";
String con = "You have the best daughter ever, not Emma, Rachel, yeah she is great! She cleans the kitchen, she cooks, she is just the best.";
sendSpam(wil, sub, con);
}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;

	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}
}
