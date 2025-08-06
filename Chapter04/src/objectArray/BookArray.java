package objectArray;

import java.util.Scanner;

// 객체 배열 만들기 연습

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
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			book[i] = new Book(title, author); // 배열 원소 객체 생성
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		}
		
		sc.close();

	}

}
