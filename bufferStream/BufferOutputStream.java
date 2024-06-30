package bufferStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class BufferOutputStream {
	
	public static void main(String[] args) {
		try {
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("demo.txt",true));
			String st="i have completed java course";
			byte[] bytes = st.getBytes();
			System.out.println(Arrays.toString(bytes));
			bos.write(bytes);
			bos.flush();
			bos.close();
			System.out.println("data inserted done");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
