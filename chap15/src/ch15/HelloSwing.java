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
		// 윈도우 프레임 생성
		final JFrame frame = new JFrame("스윙, 안녕!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 컴포넌트 위치 관리 위한 레이아웃 설정
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		// 라벨 컴포넌트를 추가
		JLabel label = new JLabel("정보를 보려면 아래 버튼을 클릭하세요.");
		frame.getContentPane().add(label);

		// 버튼 컴포넌트를 추가
		JButton button = new JButton("정보 보기");
		frame.getContentPane().add(button);

		// 버튼 클릭 이벤트에 대한 리스너 등록
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,
						"안녕하세요, 스윙 데모입니다.", "안내",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// 윈도우 프레임 크기를 알맞게 조정
		frame.pack();

		// 화면 중앙에 위치하도록 설정
		frame.setLocationRelativeTo(null);

		// 프레임을 보이도록 설정
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new HelloSwing();
	}
}
