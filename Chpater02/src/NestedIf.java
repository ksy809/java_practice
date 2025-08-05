import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// 점수와 학년을 입력 받아 60점 이상이마녀 합격 아니면 불합격 출력
		// 4학년은 70점 이상이어야 합격
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int year = sc.nextInt();
		
		if(score>=60) { // 60점 이상
			if(year != 4) { // 4학년이 아닐 경우
				System.out.println("합격입니다!");
			} else if (score >= 70) { // 4학년이고 70점 이상이면
				System.out.println("합격입니다!");
			} else { // 4학년이고 70점 미만이면
				System.out.println("불합격입니다.");
			}
		} else { // 60점 미만
			System.out.println("불합격입니다.");
		}
		
		sc.close();

	}

}
