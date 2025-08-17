package math;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스 활용
		System.out.println(Math.abs(-3.14)); // 절대값 구하기
		System.out.println(Math.sqrt(9.0)); // 제곱근
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		System.out.println("이번주 행운 번호는 ");
		for(int i=0; i<5; i++) {
			System.out.print((int)(Math.random()*45 +1) + " ");
		}
	}

}
