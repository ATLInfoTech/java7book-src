package ch13;

import java.io.File;

public class FileInfoSample {

	public static void main(String[] args) {
		File file = new File(args[0]);
		System.out.println("���: " + file.getPath());
		System.out.println("�̸�: " + file.getName());
		System.out.println("�θ�: " + file.getParent());
		System.out.println("����: " + file.isDirectory());
		System.out.println("����: " + file.isFile());
	}
}
