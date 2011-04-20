package ch13;

import java.io.File;

public class FileInfoSample {

	public static void main(String[] args) {
		File file = new File(args[0]);
		System.out.println("경로: " + file.getPath());
		System.out.println("이름: " + file.getName());
		System.out.println("부모: " + file.getParent());
		System.out.println("폴더: " + file.isDirectory());
		System.out.println("파일: " + file.isFile());
	}
}
