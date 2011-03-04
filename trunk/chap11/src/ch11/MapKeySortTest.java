package ch11;

import java.util.TreeMap;

public class MapKeySortTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> map1 = new TreeMap<>();
		map1.put(1, "일"); map1.put(10, "십"); map1.put(4, "사"); 
		map1.put(9, "구"); map1.put(7, "칠"); map1.put(2, "이"); 
		
		System.out.println("SortedMap 기능");
		System.out.println("첫 번째 키: " + map1.firstKey());
		System.out.println("5 이전: " + map1.headMap(5));
		System.out.println("7 이후: " + map1.tailMap(7));
		
		System.out.println("NavigableMap 기능");
		System.out.println("마지막 쌍: " + map1.lastEntry());
		System.out.println("5 포함 이후: " + map1.tailMap(7, true));
		System.out.println("4보다 큰 첫 번째 key: " +map1.higherKey(4));
		System.out.println("4보다 작은 첫 번째 key: " +map1.lowerKey(4));
		System.out.println("4와 같거나 큰 첫 번째 key: " +map1.ceilingKey(4));
		System.out.println("6과 같거나 작은 첫 번째 key: " +map1.floorKey(6));
	}
}
