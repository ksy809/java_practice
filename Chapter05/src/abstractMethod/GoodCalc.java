package abstractMethod;

abstract class Calculator {
	public abstract int add(int x, int y);
	public abstract int substract (int x, int y);
	public abstract double average (int[] a);
}
public class GoodCalc extends Calculator {
	
	@Override
	public int add(int x, int y) {
		// 추상메소드 구현
		return x + y;
	}
	
	@Override
	public int substract(int x, int y) {
		// 추상메소드 구현
		return x - y;
	}
	
	@Override
	public double average(int[] x) {
		// 추상메소드 구현
		double sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum/x.length;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int [] {2,3,4}));
	}

}
