package sequenceInputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class UsingMultipleFile {

	public static void main(String[] args) {
		try {
			Vector v=new Vector();
			v.add(new FileInputStream("D:\\BRIDGElabz\\DayOne\\src\\main\\java\\simpleProgram\\CountDigitNumber.java"));
			v.add(new FileInputStream("D:\\BRIDGElabz\\DayOne\\src\\main\\java\\simpleProgram\\SortArray.java"));
			v.add(new FileInputStream("D:\\BRIDGElabz\\DayOne\\src\\main\\java\\simpleProgram\\ReverseArray.java"));
			v.add(new FileInputStream("D:\\BRIDGElabz\\DayOne\\src\\main\\java\\simpleProgram\\ReverseInteger.java"));
			Enumeration e=v.elements();
			SequenceInputStream s=new SequenceInputStream(e);
		int i=0;
		while(i!=-1) {
			i=s.read();
			System.out.print((char)i);
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
