package ch13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReadSample {

	public static void main(String[] args) {
		if ("b".equals(args[0])) {
			printBytes(Paths.get(args[1]));
		} else {
			cat(Paths.get(args[1]));
		}
	}

	private static void printBytes(Path path) {
		try {
			byte[] bytes = Files.readAllBytes(path);
			for (byte b : bytes) {
				System.out.print(Integer.toHexString(b));
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void cat(Path path) {
		try {
			List<String> lines = Files.readAllLines(path, Charset.forName("euc-kr"));
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
