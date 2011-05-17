package ch15;

import java.awt.Container;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrame À©µµ¿ì »ùÇÃ");
		System.out.println(frame.getDefaultCloseOperation());
		addMenuToFrame(frame);
		addComponentToContent(frame);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private static void addMenuToFrame(JFrame frame) {
		MenuBar menuBar = new MenuBar();
		frame.setMenuBar(menuBar);
		Menu fileMenu = menuBar.add(new Menu("File"));
		fileMenu.add(new MenuItem("Open"));
		fileMenu.add(new MenuItem("Save"));
		MenuItem exitMenuItem = fileMenu.add(new MenuItem("Exit"));
		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Menu helpMenu = menuBar.add(new Menu("Help"));
		helpMenu.add(new MenuItem("Info"));
	}

	private static void addComponentToContent(JFrame frame) {
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.add(new JLabel("Name:"));
		contentPane.add(new JTextField(30));
		contentPane.add(new JLabel("Address:"));
		contentPane.add(new JTextField(30));
	}
}
