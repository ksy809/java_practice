package continueBreak;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// continue문을 이용하여 양수 합 구하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요 : ");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			if(num<0) {
				continue;
			} else {
				sum = sum + num;
			}
		}
		System.out.println("양수의 합은 " + sum + "입니다.");
		
		sc.close();

	}

}
