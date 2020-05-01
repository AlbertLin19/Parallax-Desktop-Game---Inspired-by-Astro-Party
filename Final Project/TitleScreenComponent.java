import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class TitleScreenComponent extends JComponent {
	BufferedImage backgroundImage;
	
	public TitleScreenComponent() {
		try {
			backgroundImage = ImageIO.read(new File("FinalProjectParallaxGameGraphics/spaceBackground.jpg"));
		} catch (IOException e) {
			System.out.println("ERROR! COULD NOT LOAD AWESOME BACKGROUND PICTURE! MAKE SURE YOU HAVE THE GRAPHICS FOLDER INSIDE THE SAME DIRECTORY AS THE RUNNABLE JAR!");
			e.printStackTrace();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D canvas = (Graphics2D) g;
		if (backgroundImage != null) {
			canvas.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
		} else {
			canvas.drawString("GRAPHICS FILE NOT FOUND! MAKE SURE YOU HAVE THE GRAPHICS FOLDER INSIDE THE SAME DIRECTORY AS THE RUNNABLE JAR!", 150, getHeight()/2);
		}
		
		Font titleFont = new Font("Title Font", Font.BOLD, 40);
		canvas.setFont(titleFont);
		canvas.setColor(new Color(255, 235, 215));
		String info1 = "Welcome to Parallax!";
		String info2 = "Designed by Albert Lin";
		String info3 = "with the guidance of Mr. Kinney";
		String info4 = "AP Computer Science Final Project 2018";
		canvas.drawString(info1, 400, 50);
		canvas.drawString(info2, 400, 150);
		canvas.drawString(info3, 400, 200);
		canvas.drawString(info4, 400, 300);
		
		Font directionsFont = new Font("Directions Font", Font.BOLD, 25);
		canvas.setFont(directionsFont);
		canvas.setColor(new Color(255, 235, 215));
		String direct1 = "Standard WASD and arrow key controls";
		String direct2 = "Button to fire ammo can be set with the Key Bindings button (default are Q and Shift)";
		String direct3 = "Pickup ammo drops on the field";
		String direct4 = "Ammo, health, and shield shown at the bottom of the screen";
		String direct5 = "Hit the start button at the bottom of the screen whenever you are ready! Press again to restart the match.";
		canvas.drawString(direct1, 100, 650);
		canvas.drawString(direct2, 100, 700);
		canvas.drawString(direct3, 100, 750);
		canvas.drawString(direct4, 100, 800);
		canvas.drawString(direct5, 100, 850);
	}
}
