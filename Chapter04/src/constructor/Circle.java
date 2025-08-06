package constructor;

public class Circle {

	int radius;
	String name;
	
	public Circle() { // �Ű� ���� ���� ������
		radius = 1; // radius �ʱⰪ�� 1
		name = ""; 
	}
	
	public Circle(int r, String n) { // �Ű� ������ ���� ������
		// �����ڴ� radius�� name �ʵ� �ʱ�ȭ
		radius = r; 
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10,"�ڹ�����"); // Circle ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle(); // Circle ��ü ����, ������ 1(�⺻��)
		donut.name = "���� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ "+ area);

	}

}
