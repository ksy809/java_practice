package loop;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� ������ ���� �� �Է¹ް� ��� �߷�
		// 0 �ԷµǸ� �Է� ����
		Scanner sc = new Scanner(System.in);
		double sum =0;
		int count = 0;
		int num = 0;
		
		System.out.print("������ �Է��ϼ���(0 �Է� �� ���α׷� ����) : ");
		while((num = sc.nextInt()) != 0) { // 0�� �ԷµǸ� while�� ���
			sum = sum + num;
			count++;
		}
		
		System.out.println("���� ������ " + count + "���̸�");
		System.out.println("����� " + (sum/count) + "�Դϴ�.");
		sc.close();

	}

}
