import java.awt.Graphics;

public class SnowFlakeDrawing{
	
	//add location attributes
	int x, y;
	
	//add velocity attributes
	int vx, vy;
	
	//width variable
	int width;

	public SnowFlakeDrawing() {
		//random formula
		//(int)(Math.random()*(range+1))+min;
		
		//initial values
		y = (int)(Math.random()*(-800));
		x = (int)(Math.random()*(801));
		
		vx = (int)(Math.random()*(5))-2;
		vy = (int)(Math.random()*(3))+2;
		
		width = (int)(Math.random()*(4))+2;
	}

	public void paint(Graphics g) {
		update();
		
		//call the drawing method
		g.fillOval(x,  y,  width,  width);

	}
	
	/* update the picture variable location */
	private void update() {
		//update the x and y variables as needed
		//based on velocity variables
		vy = (int)(Math.random()*(3))+2;
		y+=vy;
		x+=vx;
		if(y >= 800) {
			y = 0;
		}
		if(x > 800 || x < 0) {
			x = (int)(Math.random()*(801));
		}
		
	}
}
