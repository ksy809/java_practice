package garbage;

public class GarbageEx {

	public static void main(String[] args) {
		// 가비지의 발생
		String a = new String("Good"); // garbage
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}

}
