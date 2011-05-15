package ch15;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HelloSwing {

	public HelloSwing() {
		// ������ ������ ����
		final JFrame frame = new JFrame("����, �ȳ�!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ������Ʈ ��ġ ���� ���� ���̾ƿ� ����
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		// �� ������Ʈ�� �߰�
		JLabel label = new JLabel("������ ������ �Ʒ� ��ư�� Ŭ���ϼ���.");
		frame.getContentPane().add(label);

		// ��ư ������Ʈ�� �߰�
		JButton button = new JButton("���� ����");
		frame.getContentPane().add(button);

		// ��ư Ŭ�� �̺�Ʈ�� ���� ������ ���
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,
						"�ȳ��ϼ���, ���� �����Դϴ�.", "�ȳ�",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// ������ ������ ũ�⸦ �˸°� ����
		frame.pack();

		// ȭ�� �߾ӿ� ��ġ�ϵ��� ����
		frame.setLocationRelativeTo(null);

		// �������� ���̵��� ����
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new HelloSwing();
	}
}
