package loop;

public class DoWhileSample {

	public static void main(String[] args) {
		// do-while���� �̿��Ͽ� 'a'���� 'z'���� ����ϴ� ���α׷�
		char a = 'a';
		
		do {
			System.out.print(a); // ���� ���
			a = (char)(a+1); // ���ĺ��� ��� 1�� ���ϸ� ���� ������ �ڵ尪
		} while(a<='z');

	}

}
