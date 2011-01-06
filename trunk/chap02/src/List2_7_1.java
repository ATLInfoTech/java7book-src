import java.util.Arrays;

public class List2_7_1 {
	public static void main(String[] args) {
		int[] values = {3, 6, 1, 9, 10, 5};
		Arrays.sort(values, 1, 5);
		System.out.println( Arrays.toString(values) );
	}
}