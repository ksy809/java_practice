package objectClass;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {

	public static void main(String[] args) {
		// Object 클래스로 객체의 속성 알아내기
		Point p = new Point(2,3);
		System.out.println(p.getClass().getName()); // 클래스이름
		System.out.println(p.hashCode()); // 해시 코드 값
		System.out.println(p.toString()); // 객체의 문자열
	}

}
