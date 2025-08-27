package englishcharacterhistogram;

public class Histogram {

	private final int[] freq = new int[26];

	// 텍스트를 넣으면 빈도 누적
	public void addText(String text) {
		if (text == null)
			return;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isLetter(ch)) { // 문자인지 판별
				char lower = Character.toLowerCase(ch);// 모든 문자 소문자로 변경
				int idx = lower - 'a'; // 문자를 배열 인덱스로 바꾸기 위함
				if (0 <= idx && idx < 26) {
					freq[idx]++;
				}
			}
		}
	}

	// A(count) : ---- 형태로 출력
	public void print() {
		System.out.println("\n영문자 알파벳 히스토그램");
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
