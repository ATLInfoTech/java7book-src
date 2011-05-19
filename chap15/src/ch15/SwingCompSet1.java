package ch15;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingCompSet1 extends JFrame {

	private JTextField nameField;
	private JComboBox countryBox;
	private JCheckBox hobbyMovieCheckBox;
	private JCheckBox hobbyReadingCheckBox;
	private JCheckBox hobbyRidingCheckBox;
	private JRadioButton maleBtn;
	private JRadioButton femaleBtn;
	private MyActionListener listener = new MyActionListener();

	public SwingCompSet1() {
		super("스윙 컴포넌트 세트 1");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// 내용 부분 폼
		createFormPart();

		// 하단 버튼
		createButtonPart();

		pack();
	}

	private void createFormPart() {
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.PAGE_AXIS));

		// 이름 영역
		formPanel.add(new JLabel("이름:"));
		nameField = new JTextField("이름을 입력하세요.");
		formPanel.add(nameField);
		nameField.setAlignmentX(Component.LEFT_ALIGNMENT);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// 국가 영역
		formPanel.add(new JLabel("국가:"));
		countryBox = new JComboBox();
		countryBox.addItem("한국");
		countryBox.addItem("중국");
		countryBox.addItem("일본");
		countryBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(countryBox);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// 취미 영역
		formPanel.add(new JLabel("취미:"));
		JPanel hobbyPanel = new JPanel();

		hobbyMovieCheckBox = new JCheckBox("영화");
		hobbyReadingCheckBox = new JCheckBox("독서");
		hobbyRidingCheckBox = new JCheckBox("자전거");

		hobbyPanel.add(hobbyMovieCheckBox);
		hobbyPanel.add(hobbyReadingCheckBox);
		hobbyPanel.add(hobbyRidingCheckBox);

		hobbyPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(hobbyPanel);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// 성별 영역
		formPanel.add(new JLabel("성별:"));
		JPanel fmPanel = new JPanel();
		maleBtn = new JRadioButton("남");
		femaleBtn = new JRadioButton("여");
		ButtonGroup group = new ButtonGroup();
		group.add(maleBtn);
		group.add(femaleBtn);

		fmPanel.add(maleBtn);
		fmPanel.add(femaleBtn);
		fmPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(fmPanel);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// 소개 영역
		formPanel.add(new JLabel("소개:"));
		JTextArea content = new JTextArea(5, 20);
		JScrollPane contentPane = new JScrollPane(content);
		formPanel.add(contentPane);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);

		formPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		add(formPanel, BorderLayout.CENTER);
	}

	private void createButtonPart() {
		JPanel btnPanel = new JPanel();
		JButton saveButton = new JButton("저장");
		btnPanel.add(saveButton);
		
		saveButton.setActionCommand("save");
		saveButton.addActionListener(listener);
		add(btnPanel, BorderLayout.SOUTH);
	}

	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
				case "save":
					showInfo();
					break;
			}
		}

		private void showInfo() {
			List<String> hobbies = new ArrayList<>();
			if (hobbyMovieCheckBox.isSelected()) {
				hobbies.add(hobbyMovieCheckBox.getText());
			}
			if (hobbyReadingCheckBox.isSelected()) {
				hobbies.add(hobbyReadingCheckBox.getText());
			}
			if (hobbyRidingCheckBox.isSelected()) {
				hobbies.add(hobbyRidingCheckBox.getText());
			}
			String message = nameField.getText() + " / "
					+ countryBox.getSelectedItem() + " / "
					+ hobbies + " / " 
					+ (maleBtn.isSelected() ? "남" : femaleBtn.isSelected() ? "여" : "미지정");
			
			JOptionPane.showMessageDialog(SwingCompSet1.this, message, "입력 정보", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String[] args) {
		SwingCompSet1 compset = new SwingCompSet1();
		compset.setVisible(true);
	}
	
}
