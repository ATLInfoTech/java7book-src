package ch11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeHashMapComp {

	public static void main(String[] args) {
		testMap("HashMap �׽�Ʈ", new HashMap<Integer, String>());
		testMap("TreeMap �׽�Ʈ", new TreeMap<Integer, String>());
	}
	
	private static void testMap(String msg, Map<Integer, String> map) {
		map.put(11, "����"); map.put(4, "��"); map.put(9, "��");
		map.put(3, "��"); map.put(17, "��ĥ"); map.put(2, "��");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.print(msg + " = ");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey() + ":"+entry.getValue());
			System.out.print(" ");
		}
		System.out.println();
	}
}
