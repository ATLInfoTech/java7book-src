package ch07;

public class MessageLoader {

	public String load(String messageId) throws MessageNotFoundException {
		switch (messageId) {
			case "M001":
				return "�߸��� ���Դϴ�..";
			case "M002":
				return "ID�� ��ȣ�� ��ġ���� �ʽ��ϴ�.";
		}
		// �޽����� �������� ������ ���� �߻�
		throw new MessageNotFoundException("�߸��� �޽���ID:" + messageId);
	}
}
