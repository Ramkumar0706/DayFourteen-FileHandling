package byteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ByteArrayInputStreamDemo {
	
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("byteArray.txt");
			byte[] bytes = f.readAllBytes();
			ByteArrayInputStream bb=new ByteArrayInputStream(bytes);
			int i=0;
		//	bb.read(bytes);
			while(i!=-1) {
				i=bb.read();
				System.out.print((char)i);
			}
			System.out.println(bb.toString());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
