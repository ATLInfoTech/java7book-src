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
			// ������ �������� �ʴ� ����� ���� ó��
			e.printStackTrace();
		} catch (IOException e) {
			// ���� �д� ���� ������ �ִ� ����� ���� ó��
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
