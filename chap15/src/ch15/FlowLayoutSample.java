package ch15;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout 샘플");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		
		container.setLayout(new FlowLayout());
		
		container.add(new JButton("JButton 1"));
		container.add(new JButton("여기를 클릭하세요."));
		container.add(new JButton("정보 보기"));
		container.add(new JButton("JButton 4"));
		
		frame.pack();
		frame.setVisible(true);
	}
}
