package englishcharacterhistogram;

import java.util.Scanner;

/* �ؽ�Ʈ�� �Է� �޾� ���ĺ��� �ƴ� ���ڸ� �����ϰ� ������ ���ĺ� ������׷��� ����
 * ��ҹ��ڴ� ���������� �ϸ�, ';'�� �ִ� ������ ������ �Է��� ������ �ؼ�*/
public class Run {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("�ؽ�Ʈ�� �Է��ϼ���. ';'�� �ִ� ���� ������ �����մϴ�.");
			
			StringBuffer sb = new StringBuffer(); // Ű �Է¹��� ��Ʈ�� ���� ����
			while (true) {
				String line = sc.nextLine(); // �ؽ�Ʈ �� ���� �б�
				if (line.equals(";")) {
					break; // �Է� ��
				}
				sb.append(line).append('\n'); // ���� ���� ���ڿ��� ��Ʈ�� ���ۿ� �߰�
			}
			
			Histogram histogram = new Histogram();
			histogram.addText(sb.toString());
			histogram.print(); // ������׷� ���
		}
		
	}
}
