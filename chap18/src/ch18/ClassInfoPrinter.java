package ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfoPrinter {

	public static void main(String[] args) {
		Class<?> klass = null;
		try {
			klass = Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			System.out.printf("%s 클래스가 존재하지 않습니다", args[0]);
			System.exit(1);
		}
		System.out.printf("%s 클래스 정보 출력\n", klass.getName());
		printConstructorInfo(klass);
		printMethodInfo(klass);
		printFieldInfo(klass);
	}

	private static void printConstructorInfo(Class<?> klass) {
		System.out.println("--- 생성자 정보 출력");
		Constructor<?>[] constructors = klass.getConstructors();
		for (Constructor<?> cons : constructors) {
			System.out.println(cons);
		}
	}

	private static void printMethodInfo(Class<?> klass) {
		System.out.println("--- 메서드 정보 출력");
		Method[] methods = klass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}

	private static void printFieldInfo(Class<?> klass) {
		System.out.println("--- 필드 정보 출력");
		Field[] fields = klass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	}

}
