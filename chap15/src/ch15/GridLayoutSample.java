package ch15;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayout ป๙วร");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = frame.getContentPane();
		
		container.setLayout(new GridLayout(4, 3));
		
		container.add(new JButton("9"));
		container.add(new JButton("8"));
		container.add(new JButton("7"));
		
		container.add(new JButton("6"));
		container.add(new JButton("5"));
		container.add(new JButton("4"));
		
		container.add(new JButton("3"));
		container.add(new JButton("2"));
		container.add(new JButton("1"));
		
		container.add(new JButton("0"));
		container.add(new JButton("+"));
		container.add(new JButton("-"));

		frame.pack();
		frame.setVisible(true);
	}
}
