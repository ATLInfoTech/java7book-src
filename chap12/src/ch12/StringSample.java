package ch12;

public class StringSample {

	public static void main(String[] args) {
		compareToUsage();
		searchUsage();
		replaceUsage();
	}

	private static void compareToUsage() {
		System.out.println("-- compare");

		String str1 = "��A����";
		String str2 = "��a����";
		int comp1 = str1.compareTo(str2); // comp1�� ����
		int comp2 = str1.compareToIgnoreCase(str2); // comp2�� 0
		boolean comp3 = str1.equalsIgnoreCase(str2); // comp3�� true
		System.out.printf("comp1 = %d, comp2 = %d, comp3 = %b\n", comp1, comp2,
				comp3);
	}

	private static void searchUsage() {
		System.out.println("-- search");

		StringSample sample = new StringSample();
		System.out.println(sample.getLocation("pds:new:/path"));
		System.out.println(sample.getLocation("pds:/path"));
		System.out.println(sample.getLocation("/my/farm/path"));

		String text = "abcdabcdabcd";
		System.out.println(text.charAt(1)); // b ���
		System.out.println(text.indexOf('d')); // 3 ���
		System.out.println(text.indexOf('a', 2)); // 4 ���
		System.out.println(text.lastIndexOf("da")); // 7 ���
		System.out.println(text.lastIndexOf("da", 7)); // 7 ���
		System.out.println(text.lastIndexOf("da", 6)); // 3 ���
	}

	public FileLocation getLocation(String fileLocationPath) {
		if (fileLocationPath.startsWith("pds:")) {
			if (fileLocationPath.startsWith("new:", 4)) {
				return FileLocation.PDS_NEW;
			}
			return FileLocation.PDS_OLD;
		}
		if (fileLocationPath.contains("/farm")) {
			return FileLocation.FILE_FARM;
		}
		return FileLocation.UNKNOWN;
	}

	private enum FileLocation {
		PDS_NEW, PDS_OLD, FILE_FARM, UNKNOWN
	}

	private static void replaceUsage() {
		System.out.println("-- replace");

		String origin = "5�� ������ <b>c4</b> �ô� <a>c5 �ô�</a>";
		String e5to9 = origin.replace('5', '9');
		String c4toc4 = origin.replace("c4", "����");
		String tagRemoved = origin.replaceAll(
				"<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "[]");
		System.out.println(e5to9); // 9�� ������ <b>c4</b> �ô� <a>c9 �ô�</a>
		System.out.println(c4toc4); // 5�� ������ <b>����</b> �ô� <a>c5 �ô�</a>
		System.out.println(tagRemoved); // 5�� ������ c4 �ô� c5 �ô�
	}

}
