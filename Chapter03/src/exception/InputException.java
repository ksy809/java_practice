package exception;

import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException {

	public static void main(String[] args) {
		// 입력 오류 시 발생하는 예외(InputMismatchException)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 : ");
		int sum =0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+" >> ");
			try {
				n = sc.nextInt(); // 정수 입력
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요");
				sc.next(); // 입력 스트림에 있는 정수가 아닌 토큰은 버림
				i--; // 인덱스가 증가하지 않도록 미리 감소함
				continue; // 다음 루프
			}
			sum += n; // 합하기
		}
		System.out.println("합은 " + sum + "입니다.");
		sc.close();

	}

}
