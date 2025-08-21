import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		// ���ڿ��� ���� ������ ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();

		// Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine().trim();
			a.add(name);
		}

		// ArrayList�� ����ִ� ��� �̸� ���
		for (int j = 0; j < a.size(); j++) {
			String s = a.get(j);
			System.out.print(s + ". ");
		}

		// ���� �� �̸� ���
		int longestName = 0;
		for (int l = 1; l < a.size(); l++) {
			if (a.get(longestName).length() < a.get(l).length()) {
				longestName = l;
			}
		}
		System.out.print("���� �� �̸��� : " + a.get(longestName));
		sc.close();
	}
}
