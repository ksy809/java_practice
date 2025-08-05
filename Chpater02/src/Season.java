import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// 1~12 사이를 입력받아 봄, 여름, 가을, 겨울을 판단하여 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("월(1~12)을 입력하세요 : ");
		int month = sc.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

		sc.close();
	}

}
