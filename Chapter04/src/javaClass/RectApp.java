package javaClass;

import java.util.Scanner;

// Rectangle Ŭ���� ����� ����

class Rectangle{
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}
public class RectApp {
	public static void main(String[] args) {
		// ��ü ����
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("���ο� ���� ���̸� �Է��ϼ��� : ");
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		sc.close();
	}
}
