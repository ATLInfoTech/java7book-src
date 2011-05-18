package ch15;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowEventSample extends JFrame {

	private static class WindowEventListener implements WindowListener {
		public void windowOpened(WindowEvent e) {
			System.out.println("Window Opened");
		}
		public void windowClosing(WindowEvent e) {
			System.out.println("Window Closing");
			int res = JOptionPane.showConfirmDialog(e.getWindow(), "종료하시겠습니까?");
			if (res == JOptionPane.YES_OPTION) {
				Window frame = e.getWindow();
				frame.dispose();
			}
		}
		public void windowClosed(WindowEvent e) {
			System.out.println("Window Closed");
		}
		public void windowIconified(WindowEvent e) {
			System.out.println("Window Iconified");
		}
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Window Deiconified");
		}
		public void windowActivated(WindowEvent e) {
			System.out.println("Window Activated");
		}
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Window Deactivated");
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("윈도우 이벤트 샘플");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().add(new JLabel("닫기 버튼을 클릭하면 확인"));
		frame.pack();

		frame.addWindowListener(new WindowEventListener());
		frame.setVisible(true);
	}
}