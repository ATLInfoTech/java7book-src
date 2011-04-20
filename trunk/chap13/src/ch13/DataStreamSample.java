package ch13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamSample {

	public static void main(String[] args) {
		writeConf();
		readConf();
	}

	private static void writeConf() {
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/myconf.cfg"))) {
			out.writeInt(8080);
			out.writeUTF("�ý��� ���");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private static void readConf() {
		try (DataInputStream in = new DataInputStream(new FileInputStream("c:/myconf.cfg"))) {
			System.out.println("��Ʈ = " + in.readInt());
			System.out.println("��� = " + in.readUTF());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
