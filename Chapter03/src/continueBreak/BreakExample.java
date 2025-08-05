package continueBreak;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// break문을 이용하여 while문 벗어나기
		Scanner sc = new Scanner(System.in);

		System.out.println("exit를 입력하면 종료합니다.");
		while (true) {
			System.out.print(" >> ");
			String text = sc.nextLine();
			if (text.equals("exit")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

		sc.close();

	}

}
