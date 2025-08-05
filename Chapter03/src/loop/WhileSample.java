package loop;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// while문을 이용하여 정수를 여러 개 입력받고 평균 추력
		// 0 입력되면 입력 종료
		Scanner sc = new Scanner(System.in);
		double sum =0;
		int count = 0;
		int num = 0;
		
		System.out.print("정수를 입력하세요(0 입력 시 프로그램 종료) : ");
		while((num = sc.nextInt()) != 0) { // 0이 입력되면 while문 벗어남
			sum = sum + num;
			count++;
		}
		
		System.out.println("수의 개수는 " + count + "개이며");
		System.out.println("평균은 " + (sum/count) + "입니다.");
		sc.close();

	}

}
