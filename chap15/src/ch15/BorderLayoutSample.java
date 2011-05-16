package ch15;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class BorderLayoutSample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayout ป๙วร");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		
		container.setLayout(new BorderLayout());
		
		container.add(new JButton("Top Button"), BorderLayout.NORTH);
		container.add(new JButton("Left Button"), BorderLayout.WEST);
		container.add(new JButton("Right Button"), BorderLayout.EAST);
		container.add(new JButton("Bottom Button"), BorderLayout.SOUTH);
		
		container.add(new JTextArea(15, 30), BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}
