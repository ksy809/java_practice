import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>();
		// ����
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		// Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			int n= it.next();
			System.out.println(n);
		}
		
		// Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.print("���Ϳ� �ִ� ���� �� : " + sum);
	}

}
