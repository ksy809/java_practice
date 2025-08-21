import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList 컬랙션 생성
		ArrayList<String> a = new ArrayList<String>();

		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine().trim();
			a.add(name);
		}

		// ArrayList에 들어있는 모든 이름 출력
		for (int j = 0; j < a.size(); j++) {
			String s = a.get(j);
			System.out.print(s + ". ");
		}

		// 가장 긴 이름 출력
		int longestName = 0;
		for (int l = 1; l < a.size(); l++) {
			if (a.get(longestName).length() < a.get(l).length()) {
				longestName = l;
			}
		}
		System.out.print("가장 긴 이름은 : " + a.get(longestName));
		sc.close();
	}
}
