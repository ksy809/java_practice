package javaArray;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// �迭�� length �ʵ� Ȱ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ������ �Է��ϼ��� : ");
		int arr[] = new int[5]; // �迭�� ����� ����
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); // Ű���忡�� �Է¹��� ���� ����
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; // �迭�� ����� ���� ���� ���ϱ�
		}
		
		System.out.println("����� "+ sum/arr.length + "�Դϴ�.");
		
		sc.close();

	}

}
