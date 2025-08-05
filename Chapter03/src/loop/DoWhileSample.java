package loop;

public class DoWhileSample {

	public static void main(String[] args) {
		// do-while문을 이용하여 'a'에서 'z'까지 출력하는 프로그램
		char a = 'a';
		
		do {
			System.out.print(a); // 문자 출력
			a = (char)(a+1); // 알파벳의 경우 1을 더하면 다음 문자의 코드값
		} while(a<='z');

	}

}
