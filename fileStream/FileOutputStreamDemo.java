package fileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream out=new FileOutputStream("demo.txt",true);
			String st="\n I am ramkumar";
			byte[] bytes = st.getBytes();
			out.write(bytes);
			out.flush();
			FileInputStream stream=new FileInputStream("demo.txt");
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
