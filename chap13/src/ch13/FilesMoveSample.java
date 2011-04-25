package ch13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class FilesMoveSample {

	public static void main(String[] args) {
		Path src = Paths.get(args[0]);
		Path target = Paths.get(args[1]);
		if (args.length > 2 && "atomic".equals(args[2])) {
			moveWithAtomic(src, target);
		} else {
			move(src, target);
		}
	}

	private static void moveWithAtomic(Path src, Path target) {
		try {
			Files.move(src, target, ATOMIC_MOVE, REPLACE_EXISTING);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void move(Path src, Path target) {
		try {
			Files.move(src, target);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
