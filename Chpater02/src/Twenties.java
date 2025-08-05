import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt(); // 정수 입력
		if((age>=20) && (age<30)) { // age가 20~29 사이인지 
			System.out.println("20대입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}
		
		sc.close();
		
		System.out.println("프로그램을 종료합니다.");
	}

}
