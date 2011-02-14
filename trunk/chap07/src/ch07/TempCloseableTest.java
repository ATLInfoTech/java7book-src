package ch07;

import java.io.IOException;
import java.sql.SQLException;

public class TempCloseableTest {

	public static void main(String[] args) {
		try (TempCloseable t = new TempCloseable("t") ;
		     TempCloseable c = new TempCloseable("c")) {
			t.work(0);
		} catch (SQLException ex) {
			// �߻����� ����
			System.err.println("SQLException �߻�:" + ex.getMessage());
			ex.printStackTrace();
		} catch (IOException ex) {
			// t.close()�� c.close()���� �߻�
			System.err.println("IOException �߻�:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
