package objectArray;

import java.util.Scanner;

// ��ü �迭 ����� ����

class Book{
	String title, author;
	public Book(String t, String a) {
		this.author = a;
		this.title = t;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<book.length; i++) { // book.length = 2
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			book[i] = new Book(title, author); // �迭 ���� ��ü ����
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		}
		
		sc.close();

	}

}
