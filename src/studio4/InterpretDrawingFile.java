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
		//int color1 = in.nextInt();
		//int color2 = in.nextInt();
		//int color3 = in.nextInt();
		double dim1 = in.nextDouble();
		double dim2 = in.nextDouble();
		double dim3 = in.nextDouble();
		double dim4 = in.nextDouble();
		//StdDraw.setPenColor(StdDraw.BLUE);
		//StdDraw.filledEllipse(dim1, dim2, dim3, dim4);
		System.out.println(dim1);
	}
}
