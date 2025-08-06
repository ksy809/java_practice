package javaClass;

import java.util.Scanner;

// Rectangle 클래스 만들기 연습

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}
public class RectApp {
	public static void main(String[] args) {
		// 객체 생성
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("가로와 세로 길이를 입력하세요 : ");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		sc.close();
	}
}
