package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double[] x = {0.05, 0.5, 0.95};
		double[] y = {0.15, 0.95, 0.15};
		StdDraw.polygon(x, y);
		StdDraw.circle(0.5, 0.45, 0.45);
		StdDraw.ellipse(0.5, 0.5, 0.2, 0.1);
	}
}