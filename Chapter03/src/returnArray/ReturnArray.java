package returnArray;

public class ReturnArray {
	static int[] makeArray() { // ������ ���� �迭 ����
		int tmp[] = new int[4]; // �迭 ����
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = i; // �迭 �ʱ�ȭ, 0,1,2,3
		}
		return tmp; // �迭 ����
	}
	
	public static void main(String[] args) {
		int arr[]; // �迭 ���۷��� ���� ����
		arr = makeArray(); // �޼ҵ尡 ������ �迭 ����
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
