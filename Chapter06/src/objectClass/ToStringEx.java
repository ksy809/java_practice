package objectClass;

class Point1{
	private int x, y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point1(" + x + "," + y + ")";
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		// Point 클래스에 toString() 작성
		Point1 a = new Point1(2,3);
		System.out.println(a.toString());
		System.out.println(a); // a는 a.toString()으로 자동 변환됨

	}

}
