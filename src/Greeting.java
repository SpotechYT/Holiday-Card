import java.awt.Graphics;


public class Greeting{
	
	//add location attributes
	int x, y;
	
	//add velocity attributes
	int vy;

	//adds greeting attributes
	String greeting;

	public Greeting(String greet) {
		//random formula
		//(int)(Math.random()*(range+1))+min;
		
		//initial values
		y = 0;
		x = 0;

		greeting = greet;

		vy = (int)(Math.random()*(3))+2;
	}

	public void paint(Graphics g) {
		update();
		
		//draws the greetin on screen
		g.drawString(greeting, x, y);
	}
	
	/* update the picture variable location */
	private void update() {
		//update the x and y variables as needed
		//based on velocity variables
		vy = (int)(Math.random()*(3))+2;
		y+=vy;
		if(y >= 550) {
			y = 550;
		}
	}
}
