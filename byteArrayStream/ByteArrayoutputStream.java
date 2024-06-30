package byteArrayStream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class ByteArrayoutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("byteArray.txt");
			String st="welcome to java file handling";
			ByteArrayOutputStream b=new ByteArrayOutputStream();
			b.write(st.getBytes());
			b.writeTo(f);
			System.out.println(b.toString());
			System.out.println("data inserted successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
