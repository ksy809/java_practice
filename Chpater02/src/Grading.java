import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		char grade;
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt(); // 점수 읽기

		if (score >= 90) { // score가 90 이상
			grade = 'A';
		} else if (score >= 80) { // score가 90미만 80이상
			grade = 'B';
		} else if (score >= 70) { // score가 80미만 70이상
			grade = 'C';
		} else if (score >= 60) { // score가 70미만 60이상
			grade = 'D';
		} else { // score가 60미만
			grade = 'F';
		}

		System.out.println("당신의 학점은 " + grade + "입니다.");
		sc.close();
	}

}
