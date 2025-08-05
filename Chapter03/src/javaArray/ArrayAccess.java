package javaArray;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// 배열 선언 및 생성
		Scanner sc = new Scanner(System.in);
		
		int intArray[]; // 배열에 대한 레퍼런스 선언
		intArray = new int[5]; // 배열 생성
		int max = 0; // 현재 가장 큰 수
		
		System.out.println("양수 5개를 입력하세요 : ");
		
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt(); // 입력받은 정수를 배열에 저장
			if(intArray[i] > max) { // 입력받은 수가 현재 제일 크면
				max = intArray[i]; // max 변경
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		sc.close();

	}

}
