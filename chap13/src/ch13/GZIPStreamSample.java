package ch13;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPStreamSample {
	
	public static void main(String[] args) throws IOException {
		byte[] source = readSource("src/ch13/GZIPStreamSample.java");
		System.out.println("소스 크기: " + source.length);
		byte[] compressed = compress(source);
		System.out.println("압축된 크기: " + compressed.length);
		byte[] decompressed = decompress(compressed);
		System.out.println("원본=압축해제 동일 여부: " + equals(source, decompressed));
	}
	
	private static byte[] readSource(String file) throws IOException {
		try (FileInputStream fis = new FileInputStream(file)) {
			int len = -1;
			ByteArrayOutputStream baos = new ByteArrayOutputStream(8096);
			byte[] data = new byte[512];
			while ((len = fis.read(data)) != -1) {
				baos.write(data, 0, len);
			}
			return baos.toByteArray();
		}
	}
	
	private static byte[] compress(byte[] source) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(8096);
		try (GZIPOutputStream os = new GZIPOutputStream(baos)) {
			os.write(source);
		}
		return baos.toByteArray();
	}
	
	private static byte[] decompress(byte[] compressed) throws IOException {
		ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
		try (GZIPInputStream is = new GZIPInputStream(bais)) {
			int len = -1;
			ByteArrayOutputStream baos = new ByteArrayOutputStream(8096);
			byte[] data = new byte[512];
			while ((len = is.read(data)) != -1) {
				baos.write(data, 0, len);
			}
			return baos.toByteArray();
		}
		
	}
	
	private static boolean equals(byte[] source, byte[] decompressed) {
		if (source.length != decompressed.length) {
			return false;
		}
		for (int i = 0; i < source.length; i++) {
			if (source[i] != decompressed[i]) {
				return false;
			}
		}
		return true;
	}
}
