package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "범균");
		map.put("address", "관악구");
		map.put("language", "자바");
		System.out.println("최초 추가: " + map);
		map.put("name", "최범균"); // 값 수정
		System.out.println("name 값 수정: " + map);
		System.out.println("name 값: " + map.get("name"));
		System.out.println("name1 값: " + map.get("name1"));
		String removed = map.remove("address");
		System.out.println("삭제된 값: " + removed);
		System.out.println("address 키 존재: " + map.containsKey("address"));
		System.out.println("최범균 값 존재: " + map.containsValue("최범균"));
		Set<String> keySet = map.keySet();
		System.out.println("키 집합: " + keySet);
		Collection<String> values = map.values();
		System.out.println("값 집합: " + values);
	}
}
