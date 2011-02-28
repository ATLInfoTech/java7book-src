package ch11;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a"); list.add(0, "b"); // list [b, a]
		System.out.println("b를 인덱스 0에 추가: " + list);
		
		List<String> added = new ArrayList<>();
		added.add("1"); added.add("2");
		list.addAll(1, added);  // list [b, 1, 2, a]
		System.out.println("[1, 2]를 인덱스 1에 추가: " + list);
		
		list.add("2"); // list [b, 1, 2, a, 2]
		System.out.println("2를 뒤에 추가: " + list);
		
		System.out.println("0번 인덱스: " + list.get(0));
		System.out.println("3번 인덱스: " + list.get(3));
		
		System.out.println("2의 첫 번째 인덱스: " + list.indexOf("2"));
		System.out.println("2의 마지막 인덱스: " + list.lastIndexOf("2"));
		
		boolean removed2 = list.remove("2"); // 첫 번째 2 삭제, [b, 1, a, 2]
		System.out.println("2 삭제후: " + removed2 + ", " + list);

		String removedValue = list.remove(0); // [1, a, 2]
		System.out.println("삭제된 값 : " + removedValue + ", list: " + list);
		
		List<String> subList = list.subList(1, 3);
		System.out.println("서브 경로: " + subList);
	}
}
