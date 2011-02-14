package ch07;

import java.io.IOException;
import java.sql.SQLException;

public class TempCloseableTest {

	public static void main(String[] args) {
		try (TempCloseable t = new TempCloseable("t") ;
		     TempCloseable c = new TempCloseable("c")) {
			t.work(0);
		} catch (SQLException ex) {
			// 발생하지 않음
			System.err.println("SQLException 발생:" + ex.getMessage());
			ex.printStackTrace();
		} catch (IOException ex) {
			// t.close()와 c.close()에서 발생
			System.err.println("IOException 발생:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
