package sequenceInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class UsingTwoFile {
	
	public static void main(String[] args) {
		try {
			SequenceInputStream s=new SequenceInputStream(new FileInputStream("demo.txt"),new FileInputStream("ram.txt"));
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
