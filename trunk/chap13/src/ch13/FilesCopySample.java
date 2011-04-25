package ch13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

public class FilesCopySample {

	public static void main(String[] args) {
		Path src = Paths.get(args[0]);
		Path target = Paths.get(args[1]);
		if (args.length == 2) {
			copyWithAttributes(src, target);
			return;
		}
		if ("replace".equals(args[2])) {
			copyWithReplace(src, target);
		} else {
			copyWithAttributes(src, target);
		}
	}

	private static void copyWithAttributes(Path src, Path target) {
		try {
			Files.copy(src, target, COPY_ATTRIBUTES);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void copyWithReplace(Path src, Path target) {
		try {
			Files.copy(src, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
