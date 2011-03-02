package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "����");
		map.put("address", "���Ǳ�");
		map.put("language", "�ڹ�");
		System.out.println("���� �߰�: " + map);
		map.put("name", "�ֹ���"); // �� ����
		System.out.println("name �� ����: " + map);
		System.out.println("name ��: " + map.get("name"));
		System.out.println("name1 ��: " + map.get("name1"));
		String removed = map.remove("address");
		System.out.println("������ ��: " + removed);
		System.out.println("address Ű ����: " + map.containsKey("address"));
		System.out.println("�ֹ��� �� ����: " + map.containsValue("�ֹ���"));
		Set<String> keySet = map.keySet();
		System.out.println("Ű ����: " + keySet);
		Collection<String> values = map.values();
		System.out.println("�� ����: " + values);
	}
}
