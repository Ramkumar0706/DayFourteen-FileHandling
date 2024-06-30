package fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		File file=new File("demo.txt");
		try {
			FileInputStream stream=new FileInputStream(file);
			int available = stream.available();
			System.out.println(available);
			int i=0;
			while(i!=-1) {
				i=stream.read();
				System.out.print((char)i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
