package ch07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionSample2 {

	public static void main(String[] args) {
		FileReader fr = new FileReader("c:\\notexist.txt");
		int ch = -1;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
		fr.close();
	}
}
