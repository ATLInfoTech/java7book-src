package ch07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionSample {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\notexist.txt");
			int ch = -1;
			while( (ch = fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// 파일이 존재하지 않는 경우의 예외 처리
			e.printStackTrace();
		} catch (IOException e) {
			// 파일 읽는 도중 문제가 있는 경우의 예외 처리
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
