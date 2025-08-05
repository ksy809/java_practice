package loop;

public class NestedLoop {

	public static void main(String[] args) {
		// 2중 중첩된 for문을 이용하여 구구단 출력
		for(int i=1; i<10; i++) { // 단에 대한 반복 1단에서 9단
			for(int j=1; j<10; j++) { //각 단의 곱셈
				System.out.print(i +"x"+j +"=" +(i*j));
				System.out.print("\t");
			}
			System.out.println(); // 한 단 출력 끝나면 다음 줄로 이동
		}

	}

}
