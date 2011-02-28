package ch11;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a"); list.add(0, "b"); // list [b, a]
		System.out.println("b�� �ε��� 0�� �߰�: " + list);
		
		List<String> added = new ArrayList<>();
		added.add("1"); added.add("2");
		list.addAll(1, added);  // list [b, 1, 2, a]
		System.out.println("[1, 2]�� �ε��� 1�� �߰�: " + list);
		
		list.add("2"); // list [b, 1, 2, a, 2]
		System.out.println("2�� �ڿ� �߰�: " + list);
		
		System.out.println("0�� �ε���: " + list.get(0));
		System.out.println("3�� �ε���: " + list.get(3));
		
		System.out.println("2�� ù ��° �ε���: " + list.indexOf("2"));
		System.out.println("2�� ������ �ε���: " + list.lastIndexOf("2"));
		
		boolean removed2 = list.remove("2"); // ù ��° 2 ����, [b, 1, a, 2]
		System.out.println("2 ������: " + removed2 + ", " + list);

		String removedValue = list.remove(0); // [1, a, 2]
		System.out.println("������ �� : " + removedValue + ", list: " + list);
		
		List<String> subList = list.subList(1, 3);
		System.out.println("���� ���: " + subList);
	}
}
