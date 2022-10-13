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
		Scanner in = new Scanner(f);
		
		String shapeType=in.next();
		int redComponent=in.nextInt();
		int greenComponent=in.nextInt();
		int blueComponent=in.nextInt();
		boolean isFilled=in.nextBoolean();
	
		double parameterOne=in.nextDouble();
		double parameterTwo=in.nextDouble();
		double parameterThree=in.nextDouble() ;
		double parameterFour=in.nextDouble();
		double parameterFive=in.nextDouble();
		double parameterSix=in.nextDouble();
		
		double[] xCords= {parameterOne,parameterThree,parameterFive};
		double[] yCords= {parameterTwo,parameterFour,parameterSix};
		
		
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if(isFilled&&shapeType.equals("ellipse")) {
		StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else if(!isFilled&&shapeType.equals("ellipse")) {
		StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		
		if(isFilled&&shapeType.equals("rectangle")) {
		StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else if(!isFilled&&shapeType.equals("rectangle")) {
		StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		
		if(isFilled&&shapeType.equals("triangle")) {
		StdDraw.filledPolygon(xCords, yCords);
		}
		else if(!isFilled&&shapeType.equals("triangle")) {
		StdDraw.polygon(xCords, yCords);
		}
		
	}
}
