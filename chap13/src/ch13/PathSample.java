package ch13;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {

	public static void main(String[] args) {
		System.out.println("------ 경로");
		printPathInfo(Paths.get(args[0]));

		System.out.println("------ 절대 경로");
		printPathInfo(Paths.get(args[0]).toAbsolutePath().normalize());
	}

	private static void printPathInfo(Path path) {
		System.out.println("경로 = " + path);
		System.out.println("개수 = " + path.getNameCount());
		for (Path pathElement : path) {
			System.out.format("--> %s\n", pathElement);
		}
		System.out.println("이름 = " + path.getFileName());
		System.out.println("부모 = " + path.getParent());
		System.out.println("루트 = " + path.getRoot());
		System.out.println("절대 = " + path.isAbsolute());
	}
}
