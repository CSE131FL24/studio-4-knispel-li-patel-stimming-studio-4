package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//new draw = StdDraw System(StdDraw);
		StdDraw.setPenColor(60,120,200);
		StdDraw.filledRectangle(.5, .5, .35, .2);
	//	StdDraw.setPenColor(200,200,50);
	//	StdDraw.filledCircle(.35,.55,.05);
	//	StdDraw.filledCircle(.35,.45,.05);
	//	StdDraw.filledEllipse(.5, .5, .15, .03);
	//	StdDraw.setPenColor(20,60,20);
		StdDraw.picture(.5, .5, "src/studio4/DOUG.png", 0.6, 0.4	);
	}
	
}