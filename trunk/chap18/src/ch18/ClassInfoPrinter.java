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
			System.out.printf("%s Ŭ������ �������� �ʽ��ϴ�", args[0]);
			System.exit(1);
		}
		System.out.printf("%s Ŭ���� ���� ���\n", klass.getName());
		printConstructorInfo(klass);
		printMethodInfo(klass);
		printFieldInfo(klass);
	}

	private static void printConstructorInfo(Class<?> klass) {
		System.out.println("--- ������ ���� ���");
		Constructor<?>[] constructors = klass.getConstructors();
		for (Constructor<?> cons : constructors) {
			System.out.println(cons);
		}
	}

	private static void printMethodInfo(Class<?> klass) {
		System.out.println("--- �޼��� ���� ���");
		Method[] methods = klass.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}

	private static void printFieldInfo(Class<?> klass) {
		System.out.println("--- �ʵ� ���� ���");
		Field[] fields = klass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
	}

}
