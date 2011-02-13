package ch07;

import java.io.FileReader;
import java.io.IOException;

public class FileAutoClosableSample {
	
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("c:\\notexist.txt")) {
			int ch = -1;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
