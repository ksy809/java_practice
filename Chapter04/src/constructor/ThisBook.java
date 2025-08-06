package constructor;

// this()로 다른 생성자 호출
public class ThisBook {
	String title;
	String author;
	
	void show() {
		System.out.println(title + " | " + author);
	}
	
	public ThisBook() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public ThisBook(String title) {
		this(title, "작자미상");
	}
	
	public ThisBook(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		ThisBook littlePrince = new ThisBook("어린왕자","생택쥐페리");
		ThisBook loveStory = new ThisBook("춘향전");
		ThisBook emptyBook = new ThisBook();
		loveStory.show();

	}

}
