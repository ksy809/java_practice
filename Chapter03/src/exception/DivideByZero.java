package exception;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// 0으로 나누기 시 예외 발생으로 응용프로그램이 강제 종료되는 경우
		Scanner sc = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눌수
		
		System.out.print("나뉨 수를 입력하시오 : ");
		dividend = sc.nextInt();
		System.out.print("나눌수를 입력하시오 : ");
		divisor = sc.nextInt();
		System.out.println(dividend+"를 " + divisor +"로 나누면 몫은 " + dividend/divisor +"입니다.");

	}

}
