package ch15;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutSample2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BoxLayout 샘플");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = frame.getContentPane();

		container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));

		//setAlignment(container);

		setSize(container);

		frame.pack();
		frame.setVisible(true);
	}

	private static void setAlignment(Container container) {
		JButton button1 = new JButton("Button");
		button1.setAlignmentX(Component.CENTER_ALIGNMENT);
		container.add(button1);

		JButton button2 = new JButton("버튼을 클릭");
		button2.setAlignmentX(Component.LEFT_ALIGNMENT);
		container.add(button2);

		JButton button3 = new JButton("Here");
		button3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		container.add(button3);
	}

	private static void setSize(Container container) {
		JButton button1 = new JButton("Button");
		button1.setMaximumSize(new Dimension(100, button1.getPreferredSize().height));
		container.add(button1);

		JButton button2 = new JButton("버튼을 클릭하시기 바랍니다.");
		container.add(button2);

		JButton button3 = new JButton("Here");
		button3.setMaximumSize(new Dimension(500, 100));
		container.add(button3);
	}
}
