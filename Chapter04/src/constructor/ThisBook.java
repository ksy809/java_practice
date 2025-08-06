package constructor;

// this()�� �ٸ� ������ ȣ��
public class ThisBook {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " | " + author);
	}
	
	public ThisBook() {
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public ThisBook(String title) {
		this(title, "���ڹ̻�");
	}
	
	public ThisBook(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		ThisBook littlePrince = new ThisBook("�����","�������丮");
		ThisBook loveStory = new ThisBook("������");
		ThisBook emptyBook = new ThisBook();
		loveStory.show();

	}

}
