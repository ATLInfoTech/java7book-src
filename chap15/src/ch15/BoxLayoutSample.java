package ch15;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutSample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("BoxLayout 샘플");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		
		container.setLayout(new BoxLayout(container, BoxLayout.LINE_AXIS));
		
		container.add(new JButton("Button"));
		container.add(new JButton("버튼을 클릭"));
		container.add(new JButton("Here"));
		container.add(new JButton("여기요 여기"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
