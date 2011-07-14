package ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DateExample {

	public static void main(String[] args) {
		Class<?> klass = null;
		try {
			klass = Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}
		try {
			Object newInstance = klass.newInstance();
			System.out.println(newInstance);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return;
		}

		Constructor<?> constructor = null;
		try {
			constructor = klass.getConstructor(long.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return;
		}
		Object nowObject = null;
		try {
			long now = System.currentTimeMillis();
			nowObject = constructor.newInstance(now);
			System.out.println(nowObject);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			return;
		} catch (InvocationTargetException e) {
			e.getCause().printStackTrace();
			return;
		}
		Method method = null;
		try {
			method = klass.getMethod("setTime", long.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return;
		}
		try {
			method.invoke(nowObject, System.currentTimeMillis());
			System.out.println(nowObject);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			return;
		}
		
		Field field = null;
		try {
			field = klass.getDeclaredField("fastTime");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
			return;
		}
		try {
			field.setAccessible(true);
			Object fastTimeField = field.get(nowObject);
			System.out.println(fastTimeField);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
