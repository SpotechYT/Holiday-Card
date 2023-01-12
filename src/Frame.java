import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Font;

public class Frame extends JPanel implements ActionListener, MouseListener, KeyListener {
	
	//Variables
	int amountSnow = 5000;
	
	//Objects in the game are declared here
	//be sure to initialize them in the constructor for Frame
 	SnowFlakeDrawing[] snow = new SnowFlakeDrawing[amountSnow];
 	Background background = new Background("Bkg.jpg");
	Greeting greetText = new Greeting("Happy Holidays!");
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Font myFont = new Font("Courier New", 1, 50);
		g.setFont(myFont);
		g.setColor(Color.red);
		g.fillRect(0, 0, 1000, 1000);	
		
		background.paint(g);
		greetText.paint(g);
		
		//draw the snowflakes
		g.setColor(Color.white);
		for(int i=0; i < snow.length; i++) {
			snow[i].paint(g);
		}
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}

	public Frame() {
		JFrame f = new JFrame("Thank you! Happy Holidays!");
		f.setSize(new Dimension(800, 600));
		f.setBackground(Color.blue);
		f.add(this);
		f.setResizable(false);
		
		BufferedImage cursorImg;

		// Cursor Image
		try {
			cursorImg =  ImageIO.read(new File("dog1.png"));
			Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
				    cursorImg, new Point(0, 0), "blank cursor");
		//	f.getContentPane().setCursor(blankCursor);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Initiliaze the instance vars here
		// ===========================================================
		
		//visit the snow array and create a SnowFlakeDrawing object and
		//put it in the array at every position of the array
		
		for(int i=0; i < snow.length; i++) {
			SnowFlakeDrawing snowflake = new SnowFlakeDrawing();
			snow[i] = snowflake;
		}
		
		// ===========================================================

 
		f.setLayout(new GridLayout(1,2));
		f.addMouseListener(this);
		f.addKeyListener(this);
		Timer t = new Timer(16, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("here");
		
		//traverse the 1d array of objects
		//check for collision
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
