package ch13;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {
	public static void main(String[] args) {
		relativePath();
		absolutePath();
	}

	private static void relativePath() {
		Path sourcePath  = Paths.get("source.txt");
		printPathInfo(sourcePath);
	}

	private static void absolutePath() {
		System.out.println("절대 경로");
		Path sourcePath  = Paths.get("source.txt").toAbsolutePath();
		printPathInfo(sourcePath);
	}

	private static void printPathInfo(Path path) {
		System.out.println("개수 = " + path.getNameCount());
		for (int i = 0 ; i < path.getNameCount() ; i++) {
			System.out.format("--> %d: %s\n", i, path.getName(i));
		}
		// System.out.println("이름 = " + path.getFileName());
		System.out.println("부모 = " + path.getParent());
		System.out.println("루트 = " + path.getRoot());
		System.out.println("절대 = " + path.isAbsolute());
		try {
			System.out.println("실제 = " + path.toRealPath(true));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
