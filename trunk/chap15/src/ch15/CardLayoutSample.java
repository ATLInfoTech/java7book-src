package ch15;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutSample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("CardLayout 샘플");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Container container = frame.getContentPane();
		
		container.setLayout(new CardLayout());
		
		// 1번 카드 구성
		JButton card1Button = new JButton("2번 카드 보기");
		container.add(card1Button, "card1");
		card1Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout)container.getLayout();
				cardLayout.show(container, "card2");
			}
		});
		
		// 2번 카드 구성
		JPanel card2Panel = new JPanel();
		card2Panel.add(new JLabel("Card No: "));
		card2Panel.add(new JTextField(20));
		container.add(card2Panel, "card2");

		frame.pack();
		frame.setVisible(true);
	}
}
