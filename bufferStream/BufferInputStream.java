package bufferStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferInputStream {
	
	public static void main(String[] args) {
		BufferedInputStream b;
		try {
			b = new BufferedInputStream(new FileInputStream("demo.txt"));
		
		int i=0;
		while(i!=-1) {
			i=b.read();
			System.out.print((char)i);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
