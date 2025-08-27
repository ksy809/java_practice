package englishcharacterhistogram;

import java.util.Scanner;

/* 텍스트를 입력 받아 알파벳이 아닌 문자를 제외하고 영문자 알파벳 히스토그램을 만듦
 * 대소문자는 같은것으로 하며, ';'만 있는 라인을 만나면 입력의 끝으로 해석*/
public class Run {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("텍스트를 입력하세요. ';'만 있는 줄이 나오면 종료합니다.");
			
			StringBuffer sb = new StringBuffer(); // 키 입력받을 스트링 버퍼 생성
			while (true) {
				String line = sc.nextLine(); // 텍스트 한 라인 읽기
				if (line.equals(";")) {
					break; // 입력 끝
				}
				sb.append(line).append('\n'); // 읽은 라인 문자열을 스트링 버퍼에 추가
			}
			
			Histogram histogram = new Histogram();
			histogram.addText(sb.toString());
			histogram.print(); // 히스토그램 출력
		}
		
	}
}
