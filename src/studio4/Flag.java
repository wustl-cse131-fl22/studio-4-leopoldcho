package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		
		StdDraw.setPenColor(113, 186, 235);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(255, 150, 80);
		double [] xCords= {0.1,0.1,0.9};
		double [] yCords= {0.75,0.25,0.25};
		StdDraw.filledPolygon(xCords, yCords);
		StdDraw.setPenColor(113, 186, 235);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.25);
		

		
		
	}
}