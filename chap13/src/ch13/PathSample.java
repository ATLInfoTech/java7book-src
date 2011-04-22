package ch13;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {

	public static void main(String[] args) {
		System.out.println("------ ���");
		printPathInfo(Paths.get(args[0]));

		System.out.println("------ ���� ���");
		printPathInfo(Paths.get(args[0]).toAbsolutePath().normalize());
	}

	private static void printPathInfo(Path path) {
		System.out.println("��� = " + path);
		System.out.println("���� = " + path.getNameCount());
		for (Path pathElement : path) {
			System.out.format("--> %s\n", pathElement);
		}
		System.out.println("�̸� = " + path.getFileName());
		System.out.println("�θ� = " + path.getParent());
		System.out.println("��Ʈ = " + path.getRoot());
		System.out.println("���� = " + path.isAbsolute());
	}
}
