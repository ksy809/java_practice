package exception;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		// 0���� ������ �� ���� �߻����� �������α׷��� ���� ����Ǵ� ���
		Scanner sc = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������
		
		System.out.print("���� ���� �Է��Ͻÿ� : ");
		dividend = sc.nextInt();
		System.out.print("�������� �Է��Ͻÿ� : ");
		divisor = sc.nextInt();
		System.out.println(dividend+"�� " + divisor +"�� ������ ���� " + dividend/divisor +"�Դϴ�.");

	}

}
