import javax.swing.JOptionPane;

public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
 Human Rob = new Human("rob");
 Human Ro = new Human("ross");
		//2. create a new Robot army of good and evil robots.
 Robot evil =  new Robot("123",true);
 Robot good =  new Robot("Rart",false);	
		//3. command your robot army to destroy a human
	evil.destroy(Rob);
	good.destroy(Ro);
	}
}
 
/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}
 
/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			JOptionPane.showMessageDialog(null,"Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			JOptionPane.showMessageDialog(null,"No!! The robot " + name + " loves " +man.getName());
		}
	}
}

