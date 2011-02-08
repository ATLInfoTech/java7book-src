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
			// 예외 처리
		} catch (SQLException ex) {
			// catch 구문 컴파일 에러!! try-catch 코드 블록에서 발생할 수 없음!
		}
	}
}
