package opneChallenge;

import java.util.Scanner;
import java.util.Random;

public class UpDownGame {

	public static void main(String[] args) {
		// ���� ��ȣ ���߱� ����(up&down ����)
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(100);
		int arr[] = new int[100];
		
		System.out.println("Up & Down �����Դϴ�. ������ ���� ���纸����!");
		System.out.println("0~99���� ������ �Է��ϼ���");
		
		while(true) {
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + ">> ");
			arr[i] = sc.nextInt();
			if(arr[i] > answer) {
				System.out.println("�� ����");
			} else if(arr[i]<answer) {
				System.out.println("�� ����");
			} else {
				System.out.println("�����Դϴ�.");
				
				sc.nextLine();
				
				System.out.print("�ٽ� �Ͻðڽ��ϱ�? (y/n) >> ");
				String again = sc.nextLine();
				if(again.equals("y")) {
					break;
				} else {
					sc.close();
					System.out.println("������ �����մϴ�.");
					return;
				}
			}
		}
		}
	}

}
