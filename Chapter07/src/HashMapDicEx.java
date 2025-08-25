import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// HashMap<String, String>�� (����, �ѱ�)�ܾ� ���� �����ϰ� �˻��ϱ�
		HashMap<String, String> dic = new HashMap<String,String>();
		
		// 3���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		// dic �ؽøʿ� ����ִ� ��� (key, value)�� ���
		Set<String> keys = dic.keySet(); // ��� Ű�� Set �÷��ǿ� �޾ƿ�
		Iterator<String> it = keys.iterator(); // Set�� �����ϴ� Iterator ����
		while(it.hasNext()) {
			String key = it.next(); // Ű
			String value = dic.get(key); // ��
			System.out.println("("+key+","+value+")");
		}
		System.out.println();
		
		// ����ڷκ��� ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("ã����� �ܾ ����� �Է����ּ���?");
			String eng = sc.next();
			// �ؽøʿ��� 'Ű' eng�� '��' kor �˻�
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng +"�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
	}

}
