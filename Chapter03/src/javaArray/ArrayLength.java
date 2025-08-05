package javaArray;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// 배열의 length 필드 활용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요 : ");
		int arr[] = new int[5]; // 배열의 선언과 생성
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); // 키보드에서 입력받은 정수 저장
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; // 배열에 저장된 정수 값을 더하기
		}
		
		System.out.println("평균은 "+ sum/arr.length + "입니다.");
		
		sc.close();

	}

}
