package englishcharacterhistogram;

public class Histogram {

	private final int[] freq = new int[26];

	// �ؽ�Ʈ�� ������ �� ����
	public void addText(String text) {
		if (text == null)
			return;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isLetter(ch)) { // �������� �Ǻ�
				char lower = Character.toLowerCase(ch);// ��� ���� �ҹ��ڷ� ����
				int idx = lower - 'a'; // ���ڸ� �迭 �ε����� �ٲٱ� ����
				if (0 <= idx && idx < 26) {
					freq[idx]++;
				}
			}
		}
	}

	// A(count) : ---- ���·� ���
	public void print() {
		System.out.println("\n������ ���ĺ� ������׷�");
		int max = 0;
		for (int v : freq) {
			max = Math.max(max, v);
		}

		for (int i = 0; i < 26; i++) {
			int count = freq[i];

			StringBuilder bars = new StringBuilder();
			for (int j = 0; j < count; j++) {
				bars.append('-');
			}

			char letter = (char) ('A' + i);
			System.out.printf("%c (%d) :  %s\n", letter, count, bars.toString());
		}
	}

}
