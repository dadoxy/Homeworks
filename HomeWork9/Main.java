package HomeWork9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.black);
		g.setFont(new Font("default", Font.BOLD, 16));
		g.drawString("An array of numbers !! ", 250, 25);
		g.drawString(""+ ((int)(Math.random()*11)), 75, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 135, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 195, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 255, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 315, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 375, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 435, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 495, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 555, 75);
		g.drawString(""+ ((int)(Math.random()*11)), 615, 75);
		g.drawRect(50, 50, 60, 40);
		g.drawRect(110, 50, 60, 40);
		g.drawRect(170, 50, 60, 40);
		g.drawRect(230, 50, 60, 40);
		g.drawRect(290, 50, 60, 40);
		g.drawRect(350, 50, 60, 40);
		g.drawRect(410, 50, 60, 40);
		g.drawRect(470, 50, 60, 40);
		g.drawRect(530, 50, 60, 40);
		g.drawRect(590, 50, 60, 40);
		w.setImage(img);
	}
}
