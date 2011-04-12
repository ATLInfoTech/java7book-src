package ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOSample {

	public static void main(String[] args) {
		write();
		read();
	}
	private static void write() {
		try (OutputStream out = new FileOutputStream("test.txt")){
			out.write(1);
			out.write(2);
			out.write(3);
			out.write(4);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	private static void read() {
		try (InputStream is = new FileInputStream("test.txt")){
			int data = -1;
			System.out.println(is.available());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
//			while ((data = is.read()) != -1) {
//				System.out.println(data);
//			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
