package ch08;

public class CageHelper {
	public static <T extends Tiger> void push(Cage<T> cage, T animal) {
		cage.add(animal);
	}
}
