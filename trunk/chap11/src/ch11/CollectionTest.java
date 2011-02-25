package ch11;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<>();
		System.out.println("coll 크기: " + coll.size());
		System.out.println("coll 비었는지의 여부: " + coll.isEmpty());
		
		// 콜렉션에 데이터 추가
		for (int i = 1 ; i <= 10 ; i++) {
			coll.add(i); // 오토 박싱 int -> Integer
		}
		System.out.println("수정전 : " + coll);

		// 콜렉션의 모든 데이터를 콜렉션에 추가
		Integer i11 = new Integer(11);
		Collection<Integer> added = new ArrayList<>();
		added.add(i11); added.add(12);
		coll.addAll(added);
		System.out.println("addAll 이후 : " + coll);
		
		// 콜렉션에서 데이터 제거
		System.out.println("삭제여부 = " + coll.remove(i11)); // 동일 객체 삭제
		coll.remove(new Integer(9)); // equals() 같은 객체 삭제
		System.out.println("삭제여부 = " + coll.remove(100));
		
		System.out.println("remove 이후 : " + coll);
		
		// 콜렉션 데이터 모두 제거
		coll.clear();
		System.out.println("clear 이후 : " + coll);
	}

}
