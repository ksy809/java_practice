package loop;

public class ForSample {

	public static void main(String[] args) {
		// for 문을 이용하여 1부터 10까지 덧셈으로 표시하고 합 출력
		int i, sum = 0;
		for(i=1;i<=10;i++) { // 1~10까지 반복
			sum += i;
			System.out.print(i); // 더하는 수 출력
			if(i<=9) { // 1~9 까지는 + 출력
				System.out.print(" + "); 
			} else { // i가 10인 경우
				System.out.print(" = ");
				System.out.print(sum);
			}
		}

	}

}
