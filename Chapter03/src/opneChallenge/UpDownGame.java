package opneChallenge;

import java.util.Scanner;
import java.util.Random;

public class UpDownGame {

	public static void main(String[] args) {
		// 숨은 번호 맞추기 게임(up&down 게임)
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(100);
		int arr[] = new int[100];
		
		System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞춰보세요!");
		System.out.println("0~99사이 정수를 입력하세요");
		
		while(true) {
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + ">> ");
			arr[i] = sc.nextInt();
			if(arr[i] > answer) {
				System.out.println("더 낮게");
			} else if(arr[i]<answer) {
				System.out.println("더 높게");
			} else {
				System.out.println("정답입니다.");
				
				sc.nextLine();
				
				System.out.print("다시 하시겠습니까? (y/n) >> ");
				String again = sc.nextLine();
				if(again.equals("y")) {
					break;
				} else {
					sc.close();
					System.out.println("게임을 종료합니다.");
					return;
				}
			}
		}
		}
	}

}
