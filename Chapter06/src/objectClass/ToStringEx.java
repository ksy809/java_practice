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
		// Point Ŭ������ toString() �ۼ�
		Point1 a = new Point1(2,3);
		System.out.println(a.toString());
		System.out.println(a); // a�� a.toString()���� �ڵ� ��ȯ��

	}

}
