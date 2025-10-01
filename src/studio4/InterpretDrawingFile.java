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
		String name = in.next();
		int color1 = in.nextInt();
		int color2 = in.nextInt();
		int color3 = in.nextInt();
		boolean filled = in.nextBoolean();
		double dim1 = in.nextDouble();
		double dim2 = in.nextDouble();
		double dim3 = in.nextDouble();
		double dim4 = in.nextDouble();
		StdDraw.setPenColor(color1, color2, color3);
		StdDraw.filledEllipse(dim1, dim2, dim3, dim4);
	}
}
