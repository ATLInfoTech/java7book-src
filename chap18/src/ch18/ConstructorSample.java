package ch18;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ConstructorSample {

	public static void main(String[] args) {
		Class<? extends PrintWriter> klass = PrintWriter.class;
		try {
			Constructor<? extends PrintWriter> cons = klass.getConstructor(
					File.class, String.class);
			printConstructorInfo(cons);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	private static void printConstructorInfo(
			Constructor<? extends PrintWriter> cons) {
		int modifiers = cons.getModifiers();
		StringBuilder sig = new StringBuilder();
		if (Modifier.isPublic(modifiers)) {
			sig.append("public ");
		} else if (Modifier.isProtected(modifiers)) {
			sig.append("protected ");
		} else if (Modifier.isPrivate(modifiers)) {
			sig.append("private ");
		}
		sig.append(cons.getName()).append("(");
		if (cons.getParameterTypes().length > 0) {
			Class<?>[] paramType = cons.getParameterTypes();
			for (int i = 0; i < paramType.length; i++) {
				if (i > 0)
					sig.append(", ");
				sig.append(paramType[i].getSimpleName());
				if (i == paramType.length - 1 && cons.isVarArgs()) {
					sig.append("...");
				}
			}
		}
		sig.deleteCharAt(sig.length() - 1);
		sig.append(")");
		if (cons.getExceptionTypes().length > 0) {
			sig.append(" throws ");
			for (Class<?> exceptionType : cons.getExceptionTypes()) {
				sig.append(exceptionType.getSimpleName()).append(",");
			}
			sig.deleteCharAt(sig.length() - 1);
		}
		System.out.println(sig.toString());
	}
}
