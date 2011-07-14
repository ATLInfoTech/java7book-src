package ch18;

import java.lang.reflect.Method;

public class TestRunner {

	public void run(Class<?> klass) throws Exception {
		Object testTarget = klass.newInstance();
		int successCount = 0;
		int failureCount = 0;
		Method[] methods = klass.getDeclaredMethods();
		for (Method method : methods) {
			if (!method.isAnnotationPresent(Test.class)) {
				continue;
			}
			Test testAnnotation = method.getAnnotation(Test.class);
			if (testAnnotation.skip()) {
				continue;
			}
			try {
				method.invoke(testTarget);
				successCount++;
			} catch (Exception e) {
				failureCount++;
				e.printStackTrace();
			}
		}
		System.out.printf("성공 개수: %d개, 실패 개수: %d개\n", successCount,
				failureCount);
	}

	public static void main(String[] args) throws Exception {
		Class<?> testClass = Class.forName(args[0]);
		new TestRunner().run(testClass);
	}

}
