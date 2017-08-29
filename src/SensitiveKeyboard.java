import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener {
public void start(){
	JFrame Jferm =  new JFrame();
	Jferm.setVisible(true); 
	 Jferm.addKeyListener(this); 
}
	 public static void main(String[] args) {
SensitiveKeyboard senstiveKeyboard = new SensitiveKeyboard();
senstiveKeyboard.start();
	 }
	@Override
	public void keyTyped(KeyEvent e) {
speak("ouch");		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

}
