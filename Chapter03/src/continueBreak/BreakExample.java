package continueBreak;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// break���� �̿��Ͽ� while�� �����
		Scanner sc = new Scanner(System.in);

		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		while (true) {
			System.out.print(" >> ");
			String text = sc.nextLine();
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

		sc.close();

	}

}
