package Weekend03;

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
		
		g.drawRect(0, 0, 500, 300);
		g.setColor(Color.BLUE);
		g.drawString("Java", 10, 15);
		g.setColor(Color.BLACK);
		g.drawRect(50, 30, 150, 200);
		g.drawRect(49, 30, 149, 200);
		g.drawRect(48, 30, 148, 200);
		g.drawRect(47, 30, 147, 200);
		g.setColor(Color.BLUE);
		g.drawString("lang",55 , 45);
		g.setColor(Color.BLACK);
		g.drawRect(70, 50, 110, 95);
		g.setColor(Color.GREEN);
		g.drawString("Math",75 , 75);
		g.setColor(Color.BLACK);
		g.drawRect(80, 85, 90, 20);
		g.setColor(Color.RED);
		g.drawString("Sqrt()", 90, 100);
		g.setColor(Color.BLACK);
		g.drawRect(80, 115, 90, 20);
		g.setColor(Color.RED);
		g.drawString("Random()", 85, 130);
		g.setColor(Color.BLACK);
		g.drawRect(70, 155, 110, 30);
		g.setColor(Color.GREEN);
		g.drawString("String", 80, 175);
		g.setColor(Color.BLACK);
		g.drawRect(70, 190, 110, 30);
		g.setColor(Color.GREEN);
		g.drawString("Integer", 80, 210);
		g.setColor(Color.BLACK);
		g.drawRect(220, 30, 150, 200);
		g.drawRect(219, 30, 149, 200);
		g.drawRect(218, 30, 148, 200);
		g.drawRect(217, 30, 147, 200);
		g.setColor(Color.BLUE);
		g.drawString("awt",225 , 45);
		g.setColor(Color.BLACK);
		g.drawRect(240, 50, 110, 95);
		g.setColor(Color.GREEN);
		g.drawString("Graphics",245 , 75);
		g.setColor(Color.BLACK);
		g.drawRect(250, 85, 90, 20);
		g.setColor(Color.RED);
		g.drawString("drawRect()", 255, 100);
		g.setColor(Color.BLACK);
		g.drawRect(250, 115, 90, 20);
		g.setColor(Color.RED);
		g.drawString("setColor()", 255, 130);
		g.setColor(Color.BLACK);
		g.drawRect(240, 155, 110, 30);
		g.setColor(Color.GREEN);
		g.drawString("Color", 250, 175);
		g.setColor(Color.BLACK);
		g.drawRect(240, 190, 110, 30);
		g.setColor(Color.GREEN);
		g.drawString("Font", 250, 210);
		g.setColor(Color.BLACK);
		g.drawRect(400, 30, 75, 200);
		g.drawRect(399, 30, 74, 200);
		g.drawRect(398, 30, 73, 200);
		g.drawRect(397, 30, 72, 200);
		g.setColor(Color.BLUE);
		g.drawString("util",405 , 45);
		w.setImage(img);
	}
}
