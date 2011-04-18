package ch13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopySample {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader(args[0]);
				FileWriter writer = new FileWriter(args[1])) {
			char[] data = new char[512];
			int len = -1;
			while ((len = reader.read(data)) != -1) {
				writer.write(data, 0, len);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
