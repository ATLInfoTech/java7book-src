package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataProcessor {

	public void process(String dataFile) {
		Path dataPath = Paths.get(dataFile);

		Logger logger = Logger.getLogger("dataprocessor");
		logger.setLevel(Level.FINEST);
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINEST);
		logger.addHandler(handler);
		logger.setUseParentHandlers(false);
		
		logger.log(Level.INFO, "���� ���� ���: {0}", dataPath);
		logger.info(dataFile + " ���� = " + Files.exists(dataPath));
		logger.log(Level.INFO, "{0} ���� ���� = {1}",
				new Object[] {dataFile, !Files.isDirectory(dataPath) });

		try (FileInputStream fis = new FileInputStream(dataPath.toFile())) {
			// dataPath ���Ϸκ��� ������ ����
		} catch (IOException ex) {
			logger.log(Level.SEVERE, "���� �б� ����: " + dataPath, ex);
		}
		logger.warning("warning");
		logger.config("!! config");
	}

	public static void main(String[] args) {
		new DataProcessor().process("configFile");
	}
}
