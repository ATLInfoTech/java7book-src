package ch13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterSample {

	public static void main(String[] args) {
		writeConf();
		readConf();
	}

	private static void writeConf() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("server.cfg"))) {
			bw.write("[server]");
			bw.newLine();
			bw.write("ip=172.20.4.111");
			bw.newLine();
			bw.append("[client]");
		} catch (IOException ex) {
			System.out.println("예외 발생: " + ex.getMessage());
		}
	}

	private static void readConf() {
		try (BufferedReader br = new BufferedReader(new FileReader("server.cfg"))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("예외 발생: " + ex.getMessage());
		}
	}
}
