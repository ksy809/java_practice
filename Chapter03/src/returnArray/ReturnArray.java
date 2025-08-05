package returnArray;

public class ReturnArray {
	static int[] makeArray() { // 일차원 정수 배열 리턴
		int tmp[] = new int[4]; // 배열 생성
		for(int i=0; i<tmp.length; i++) {
			tmp[i] = i; // 배열 초기화, 0,1,2,3
		}
		return tmp; // 배열 리턴
	}
	
	public static void main(String[] args) {
		int arr[]; // 배열 레퍼런스 변수 선언
		arr = makeArray(); // 메소드가 리턴한 배열 참조
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
