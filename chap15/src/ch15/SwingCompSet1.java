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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
	private DefaultActionListener actionListener = new DefaultActionListener();

	public SwingCompSet1() {
		super("���� ������Ʈ ��Ʈ 1");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// �޴� �ۼ�
		createMenu();
		
		// ���� �κ� ��
		createFormPart();

		// �ϴ� ��ư
		createButtonPart();

		pack();
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = menuBar.add(new JMenu("����"));
		JMenuItem saveMenuItem = fileMenu.add(new JMenuItem("����"));
		saveMenuItem.setActionCommand("save");
		saveMenuItem.addActionListener(actionListener);
		JMenuItem exitMenuItem = fileMenu.add(new JMenuItem("����"));
		exitMenuItem.setActionCommand("exit");
		exitMenuItem.addActionListener(actionListener);
		
		JMenu helpMenu = menuBar.add(new JMenu("����"));
		JMenuItem aboutMenuItem = helpMenu.add(
				new JMenuItem("����������Ʈ��1��"));
		aboutMenuItem.setActionCommand("about");
		aboutMenuItem.addActionListener(actionListener);
		
		setJMenuBar(menuBar);
	}
	
	private void createFormPart() {
		JPanel formPanel = new JPanel();
		formPanel.setLayout(
				new BoxLayout(formPanel, BoxLayout.PAGE_AXIS));
		
		// �̸� ����
		formPanel.add(new JLabel("�̸�:"));
		nameField = new JTextField("�̸��� �Է��ϼ���.");
		formPanel.add(nameField);
		nameField.setAlignmentX(Component.LEFT_ALIGNMENT);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// ���� ����
		formPanel.add(new JLabel("����:"));
		countryBox = new JComboBox();
		countryBox.addItem("�ѱ�");
		countryBox.addItem("�߱�");
		countryBox.addItem("�Ϻ�");
		countryBox.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(countryBox);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// ��� ����
		formPanel.add(new JLabel("���:"));
		JPanel hobbyPanel = new JPanel();

		hobbyMovieCheckBox = new JCheckBox("��ȭ");
		hobbyReadingCheckBox = new JCheckBox("����");
		hobbyRidingCheckBox = new JCheckBox("������");

		hobbyPanel.add(hobbyMovieCheckBox);
		hobbyPanel.add(hobbyReadingCheckBox);
		hobbyPanel.add(hobbyRidingCheckBox);

		hobbyPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(hobbyPanel);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// ���� ����
		formPanel.add(new JLabel("����:"));
		JPanel fmPanel = new JPanel();
		maleBtn = new JRadioButton("��");
		femaleBtn = new JRadioButton("��");
		ButtonGroup group = new ButtonGroup();
		group.add(maleBtn);
		group.add(femaleBtn);

		fmPanel.add(maleBtn);
		fmPanel.add(femaleBtn);
		fmPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		formPanel.add(fmPanel);

		formPanel.add(Box.createRigidArea(new Dimension(0, 10)));

		// �Ұ� ����
		formPanel.add(new JLabel("�Ұ�:"));
		JTextArea content = new JTextArea(5, 20);
		JScrollPane contentPane = new JScrollPane(content);
		formPanel.add(contentPane);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);

		formPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		add(formPanel, BorderLayout.CENTER);
	}

	private void createButtonPart() {
		JPanel btnPanel = new JPanel();
		JButton saveButton = new JButton("����");
		btnPanel.add(saveButton);
		
		saveButton.setActionCommand("save");
		saveButton.addActionListener(actionListener);
		add(btnPanel, BorderLayout.SOUTH);
	}

	private class DefaultActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
				case "save":
					showInfo();
					break;
				case "about":
					JOptionPane.showMessageDialog(null, "SwingSet 1!!!");
					break;
				case "exit":
					exit();
					break;
			}
		}
		
		private void exit() {
			SwingCompSet1.this.dispose();
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
					+ (maleBtn.isSelected() ? "��" : femaleBtn.isSelected() ?
					   "��" : "������");
			
			JOptionPane.showMessageDialog(SwingCompSet1.this, message, 
				"�Է� ����", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void main(String[] args) {
		SwingCompSet1 compset = new SwingCompSet1();
		compset.setVisible(true);
	}
	
}
