package ch15;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowEventSample extends JFrame {
	private static Logger logger = Logger.getLogger("sample");
	
	private static class WindowEventListener implements WindowListener {
		public void windowOpened(WindowEvent e) {
			logger.info("Window Opened");
		}
		public void windowClosing(WindowEvent e) {
			logger.info("Window Closing");
			int res = JOptionPane.showConfirmDialog(e.getWindow(), 
					"�����Ͻðڽ��ϱ�?");
			if (res == JOptionPane.YES_OPTION) {
				Window frame = e.getWindow();
				frame.dispose();
			}
		}
		public void windowClosed(WindowEvent e) {
			logger.info("Window Closed");
		}
		public void windowIconified(WindowEvent e) {
			logger.info("Window Iconified");
		}
		public void windowDeiconified(WindowEvent e) {
			logger.info("Window Deiconified");
		}
		public void windowActivated(WindowEvent e) {
			logger.info("Window Activated");
		}
		public void windowDeactivated(WindowEvent e) {
			logger.info("Window Deactivated");
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("������ �̺�Ʈ ����");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().add(new JLabel("�ݱ� ��ư�� Ŭ���ϸ� Ȯ��"));
		frame.pack();

		frame.addWindowListener(new WindowEventListener());
		frame.setVisible(true);
	}
}