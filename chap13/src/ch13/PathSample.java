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
		System.out.println("���� ���");
		Path sourcePath  = Paths.get("source.txt").toAbsolutePath();
		printPathInfo(sourcePath);
	}

	private static void printPathInfo(Path path) {
		System.out.println("���� = " + path.getNameCount());
		for (int i = 0 ; i < path.getNameCount() ; i++) {
			System.out.format("--> %d: %s\n", i, path.getName(i));
		}
		// System.out.println("�̸� = " + path.getFileName());
		System.out.println("�θ� = " + path.getParent());
		System.out.println("��Ʈ = " + path.getRoot());
		System.out.println("���� = " + path.isAbsolute());
		try {
			System.out.println("���� = " + path.toRealPath(true));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
