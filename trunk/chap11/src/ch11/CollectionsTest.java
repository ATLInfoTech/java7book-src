package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		minMaxTest();
		sortTest();
	}
	
	private static void minMaxTest() {
		Collection<Integer> coll = new ArrayList<>();
		coll.add(1); coll.add(4); coll.add(-3); coll.add(7);
		coll.add(31); coll.add(8); coll.add(9); coll.add(10);
		Integer max = Collections.max(coll);
		Integer min = Collections.min(coll);
		System.out.println(max+ ", " + min);
	}
	
	private static void sortTest() {
		List<Integer> list = new ArrayList<>();
		list.add(1); list.add(4); list.add(-3); list.add(7);
		list.add(31); list.add(8); list.add(9); list.add(10);
		Collections.sort(list);
		System.out.println(list); // [-3, 1, 4, 7, 8, 9, 10, 31]
	}
}
