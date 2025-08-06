package constructor;

public class Circle {

	int radius;
	String name;
	
	public Circle() { // 매개 변수 없는 생성자
		radius = 1; // radius 초기값은 1
		name = ""; 
	}
	
	public Circle(int r, String n) { // 매개 변수를 가진 생성자
		// 생성자는 radius와 name 필드 초기화
		radius = r; 
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10,"자바피자"); // Circle 객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); // Circle 객체 생성, 반지름 1(기본값)
		donut.name = "도넛 피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+ area);

	}

}
