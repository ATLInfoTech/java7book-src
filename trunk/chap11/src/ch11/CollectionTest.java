package ch11;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
		System.out.println("coll ũ��: " + coll.size());
		System.out.println("coll ��������� ����: " + coll.isEmpty());
		
		// �ݷ��ǿ� ������ �߰�
		for (int i = 1 ; i <= 10 ; i++) {
			coll.add(i); // ���� �ڽ� int -> Integer
		}
		System.out.println("������ : " + coll);

		// �ݷ����� ��� �����͸� �ݷ��ǿ� �߰�
		Integer i11 = new Integer(11);
		Collection<Integer> added = new ArrayList<>();
		added.add(i11); added.add(12);
		coll.addAll(added);
		System.out.println("addAll ���� : " + coll);
		
		// �ݷ��ǿ��� ������ ����
		System.out.println("�������� = " + coll.remove(i11)); // ���� ��ü ����
		coll.remove(new Integer(9)); // equals() ���� ��ü ����
		System.out.println("�������� = " + coll.remove(100));
		
		System.out.println("remove ���� : " + coll);
		
		// �ݷ��� ������ ��� ����
		coll.clear();
		System.out.println("clear ���� : " + coll);
	}

}
