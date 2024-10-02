	package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		System.out.print(shape);
		int color1 = in.nextInt();
		int color2 = in.nextInt();
		int color3 = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double v1 = in.nextDouble();
		double v2 = in.nextDouble();
		double v3 = in.nextDouble();
		double v4 = in.nextDouble();
	
		StdDraw.setPenColor(color1,color2,color3);
		if (shape .equals("rectangle")) {
			//System.out.print("squrea");
			if (isFilled == true) {
				StdDraw.filledRectangle(v1,v2,v3,v4);
			//	System.out.print("poP");
		}
			else if (isFilled == false) {
				StdDraw.rectangle(v1, v2, v3, v4);
			}
		}
		else if (shape .equals("triangle")) { 
			double v5 = in.nextDouble();
			double v6 = in.nextDouble();
			double[] x = {v1,v2,v3};
			double [] y = {v4,v5,v6};
			if (isFilled == true) {
				StdDraw.filledPolygon(x,y);
			//	System.out.print("poP");
		}
			else if (isFilled == false) {
				StdDraw.polygon(x,y);
		}
		}
		
		
	}
}
