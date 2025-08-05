package exception;

import java.util.Scanner;

public class DevideByZeroHandling {

	public static void main(String[] args) {
		// 0으로 나누는 예외에 대처하는 try-catch 블록 만들기
		Scanner sc = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눌수
		
		System.out.print("나뉨 수를 입력하시오 : ");
		dividend = sc.nextInt();
		System.out.print("나눌수를 입력하시오 : ");
		divisor = sc.nextInt();
		
		try {
			System.out.println(dividend+"를 " + divisor +"로 나누면 몫은 " + dividend/divisor +"입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			sc.close(); // 정상적이든 예외가 발생하든 최종적으로 scanner를 닫는다.
			System.out.print("프로그램 종료");
		}

	}

}
