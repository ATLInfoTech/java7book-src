package ch07;

import java.io.IOException;
import java.sql.SQLException;

public class TempCloseable implements AutoCloseable {
	private String name;
	
	public TempCloseable(String name) {
		this.name = name;
	}

	public void work(int value) throws SQLException {
		System.err.println("work() ����");
		if (value == 1) {
			throw new SQLException("�ǵ��� SQLException �߻�");
		}
	}
	
	@Override
	public void close() throws IOException {
		System.err.println(name + " close() ����");
		throw new IOException(name + "���� �ǵ��� IOException �߻�");
	}

}
