package ch07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class FileExceptionSample3 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\notexist.txt");
		} catch (FileNotFoundException ex) {
			// ���� ó��
		} catch (SQLException ex) {
			// catch ���� ������ ����!! try-catch �ڵ� ��Ͽ��� �߻��� �� ����!
		}
	}
}
