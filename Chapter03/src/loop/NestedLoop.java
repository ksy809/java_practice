package loop;

public class NestedLoop {

	public static void main(String[] args) {
		// 2�� ��ø�� for���� �̿��Ͽ� ������ ���
		for(int i=1; i<10; i++) { // �ܿ� ���� �ݺ� 1�ܿ��� 9��
			for(int j=1; j<10; j++) { //�� ���� ����
				System.out.print(i +"x"+j +"=" +(i*j));
				System.out.print("\t");
			}
			System.out.println(); // �� �� ��� ������ ���� �ٷ� �̵�
		}

	}

}
