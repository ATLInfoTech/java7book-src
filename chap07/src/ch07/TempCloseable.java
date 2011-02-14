package ch07;

import java.io.IOException;
import java.sql.SQLException;

public class TempCloseable implements AutoCloseable {
	private String name;
	
	public TempCloseable(String name) {
		this.name = name;
	}

	public void work(int value) throws SQLException {
		System.err.println("work() 실행");
		if (value == 1) {
			throw new SQLException("의도적 SQLException 발생");
		}
	}
	
	@Override
	public void close() throws IOException {
		System.err.println(name + " close() 실행");
		throw new IOException(name + "에서 의도적 IOException 발생");
	}

}
