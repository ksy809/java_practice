import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// ������ �г��� �Է� �޾� 60�� �̻��̸��� �հ� �ƴϸ� ���հ� ���
		// 4�г��� 70�� �̻��̾�� �հ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = sc.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4) : ");
		int year = sc.nextInt();
		
		if(score>=60) { // 60�� �̻�
			if(year != 4) { // 4�г��� �ƴ� ���
				System.out.println("�հ��Դϴ�!");
			} else if (score >= 70) { // 4�г��̰� 70�� �̻��̸�
				System.out.println("�հ��Դϴ�!");
			} else { // 4�г��̰� 70�� �̸��̸�
				System.out.println("���հ��Դϴ�.");
			}
		} else { // 60�� �̸�
			System.out.println("���հ��Դϴ�.");
		}
		
		sc.close();

	}

}
