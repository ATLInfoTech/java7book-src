package ch13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopySample {

	public static void main(String[] args) {
		try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(args[0]));
				BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(args[1]))) {
			byte[] data = new byte[512];
			int len = -1;
			while ((len = is.read(data)) != -1) {
				os.write(data, 0, len);
			}
		} catch (IOException ex) {
			System.out.println("복사 중 예외 발생: " + ex.getMessage());
		}

	}
}
