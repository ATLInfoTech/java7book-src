package ch15;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutSample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("BoxLayout ����");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		
		container.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));
		
		container.add(new JButton("Button"));
		container.add(new JButton("��ư�� Ŭ��"));
		container.add(new JButton("Here"));
		container.add(new JButton("����� ����"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
