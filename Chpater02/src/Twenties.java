import java.util.Scanner;

public class Twenties {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt(); // ���� �Է�
		if((age>=20) && (age<30)) { // age�� 20~29 �������� 
			System.out.println("20���Դϴ�.");
		} else {
			System.out.println("20�밡 �ƴմϴ�.");
		}
		
		sc.close();
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}
