import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time/60)%60;
		int hour = (time / 60) /60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		sc.close();

	}

}
