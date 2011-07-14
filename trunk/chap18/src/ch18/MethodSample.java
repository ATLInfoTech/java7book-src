package ch18;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodSample {

	public static void main(String[] args) {
		Class<? extends PrintWriter> klass = PrintWriter.class;
		try {
			Method method = klass.getMethod("printf", String.class,
					Object[].class);
			printMethodInfo(method);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	private static void printMethodInfo(Method method) {
		int modifiers = method.getModifiers();
		StringBuilder sig = new StringBuilder();
		if (Modifier.isPublic(modifiers)) {
			sig.append("public ");
		} else if (Modifier.isProtected(modifiers)) {
			sig.append("protected ");
		} else if (Modifier.isPrivate(modifiers)) {
			sig.append("private ");
		}
		if (Modifier.isStatic(modifiers)) {
			sig.append("static ");
		}
		if (Modifier.isFinal(modifiers)) {
			sig.append("final ");
		}
		sig.append(method.getReturnType().getSimpleName()).append(" ");
		sig.append(method.getName()).append("(");
		if (method.getParameterTypes().length > 0) {
			Class<?>[] paramTypes = method.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if (i > 0)
					sig.append(", ");
				if (i == paramTypes.length - 1 && method.isVarArgs()) {
			        // 마지막 파라미터가 가변인자이지만, paramTypes[i].isArray()는 true
			        // 따라서 getComponentType() 메서드로 가변인자 타입 구함
					Class<?> varArgType = paramTypes[i].getComponentType();
					sig.append(varArgType.getSimpleName()).append("...");
				} else {
					sig.append(paramTypes[i].getSimpleName());
				}
			}
		}
		sig.append(")");
		if (method.getExceptionTypes().length > 0) {
			sig.append(" throws ");
			for (Class<?> exceptionType : method.getExceptionTypes()) {
				sig.append(exceptionType.getSimpleName()).append(",");
			}
			sig.deleteCharAt(sig.length() - 1);
		}
		System.out.println(sig.toString());

	}
}
