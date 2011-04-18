package ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopySample {

	public static void main(String[] args) {
		try (FileInputStream is = new FileInputStream(args[0]);
				FileOutputStream os = new FileOutputStream(args[1])) {
			byte[] data = new byte[512];
			int len = -1;
			while ((len = is.read(data)) != -1) {
				os.write(data, 0, len);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
