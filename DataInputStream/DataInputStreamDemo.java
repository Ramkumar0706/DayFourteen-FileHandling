package DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamDemo {
	
	public static void main(String[] args) {
		try {
			DataInputStream dis=new DataInputStream(new FileInputStream("ram.txt"));
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
		//	dis.readChar();
			System.out.println((char)dis.readChar());
			
			int i=0;
			while(i!=-1) {
				//i=dis.readInt();
				System.out.println((char)i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
