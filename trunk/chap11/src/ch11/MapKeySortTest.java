package ch11;

import java.util.TreeMap;

public class MapKeySortTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.put(1, "��"); map1.put(10, "��"); map1.put(4, "��"); 
		map1.put(9, "��"); map1.put(7, "ĥ"); map1.put(2, "��"); 
		
		System.out.println("SortedMap ���");
		System.out.println("ù ��° Ű: " + map1.firstKey());
		System.out.println("5 ����: " + map1.headMap(5));
		System.out.println("7 ����: " + map1.tailMap(7));
		
		System.out.println("NavigableMap ���");
		System.out.println("������ ��: " + map1.lastEntry());
		System.out.println("5 ���� ����: " + map1.tailMap(7, true));
		System.out.println("4���� ū ù ��° key: " +map1.higherKey(4));
		System.out.println("4���� ���� ù ��° key: " +map1.lowerKey(4));
		System.out.println("4�� ���ų� ū ù ��° key: " +map1.ceilingKey(4));
		System.out.println("6�� ���ų� ���� ù ��° key: " +map1.floorKey(6));
	}
}
