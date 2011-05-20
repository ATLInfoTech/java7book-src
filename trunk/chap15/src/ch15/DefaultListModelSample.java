package ch15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DefaultListModelSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("DefaultListModel 샘플");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		final DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("1");
		listModel.addElement("2");
		listModel.addElement("3");
		
		final JList list = new JList(listModel);
		list.setVisibleRowCount(6);
		JScrollPane listPane = new JScrollPane(list);
		
		JPanel buttonPanel = new JPanel();
		JButton addBtn = new JButton("임의 숫자 추가");
		JButton deletionBtn = new JButton("삭제");
		buttonPanel.add(addBtn);
		buttonPanel.add(deletionBtn);
		
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> listModel = (DefaultListModel)list.getModel();
				Random random = new Random();
				int randomNum = random.nextInt(10) + 1;
				listModel.addElement(Integer.toString(randomNum));
			}
		});
		
		deletionBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = list.getSelectedIndex();
				if (selectedIndex != -1) {
					listModel.remove(selectedIndex);
				}
			}
		});
		
		contentPane.add(listPane, BorderLayout.CENTER);
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
