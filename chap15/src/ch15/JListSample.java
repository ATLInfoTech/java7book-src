package ch15;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JList 샘플");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
		
		String[] socialService = {"Facebook", "twitter", "LinkedIn", 
			"싸이월드", "요즘", "미투데이", "foursquare", "Instagram",
			"그루폰", "티켓몬스터", "쿠팡", "위메이크프라이스"};
		
		JList<String> list1 = new JList<>(socialService);
		list1.setLayoutOrientation(JList.VERTICAL);
		list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane list1Pane = new JScrollPane(list1);
		list1Pane.setPreferredSize(new Dimension(240, 80));
		
		JList list2 = new JList(socialService);
		list2.setLayoutOrientation(JList.VERTICAL_WRAP);
		list2.setVisibleRowCount(0);
		list2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		JScrollPane list2Pane = new JScrollPane(list2);
		list2Pane.setPreferredSize(new Dimension(240, 80));
		
		JList list3 = new JList(socialService);
		list3.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane list3Pane = new JScrollPane(list3);
		list3Pane.setPreferredSize(new Dimension(240, 80));
		
		contentPanel.add(list1Pane);
		contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		contentPanel.add(list2Pane);
		contentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		contentPanel.add(list3Pane);
		
		list1.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting()) {
					System.out.println(e.getFirstIndex());
				}
			}
		});
		
		frame.getContentPane().add(contentPanel);
		frame.pack();
		frame.setVisible(true);
	}
}
