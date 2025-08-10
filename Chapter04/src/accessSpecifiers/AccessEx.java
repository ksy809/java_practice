package accessSpecifiers;

class Sample{
	public int a;
	private int b;
	int c; // 디폴트 접근 지정
}
public class AccessEx {

	public static void main(String[] args) {
		// 멤버의 접근 지정자
		Sample sample = new Sample();
		sample.a = 10;
		sample.b = 10;
		sample.c = 10;
		
		/* 실행 결과 : 오류 발생
		 * Sample 클래스 필드 b는 private 멤버로서 Sample 클래스 외 다른 어떤 클래스에서도 읽고 쓸 수 없기 때문
		 * 14라인에서 오류
		 * */

	}

}
