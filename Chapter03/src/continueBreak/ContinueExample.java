package continueBreak;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// continue���� �̿��Ͽ� ��� �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 5���� �Է��ϼ��� : ");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			if(num<0) {
				continue;
			} else {
				sum = sum + num;
			}
		}
		System.out.println("����� ���� " + sum + "�Դϴ�.");
		
		sc.close();

	}

}
