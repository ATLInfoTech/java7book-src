package ch13;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArraySample {

	public static void main(String[] args) {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream(1024);

		try (FileInputStream fis = new FileInputStream(args[0])) {
			byte[] data = new byte[512];
			int len = -1;
			while ((len = fis.read(data)) != -1) {
				byteOut.write(data, 0, len);
			}
			byte[] readData = byteOut.toByteArray();
			System.out.println(Arrays.toString(readData));
			System.out.println(byteOut.toString());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
