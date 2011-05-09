package ch14;

import java.util.logging.Logger;

public class ConfigFileTest {

	public static void main(String[] args) {
		Logger.getLogger("stat.log").info("user logged in");
		Logger.getLogger("com.cargocom.sql").fine("fine log message");
	}
}
