import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// HashMap<String, String>로 (영어, 한글)단어 쌍을 저장하고 검색하기
		HashMap<String, String> dic = new HashMap<String,String>();
		
		// 3개의 (key, value) 쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		// dic 해시맵에 들어있는 모든 (key, value)쌍 출력
		Set<String> keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴
		Iterator<String> it = keys.iterator(); // Set에 접근하는 Iterator 리턴
		while(it.hasNext()) {
			String key = it.next(); // 키
			String value = dic.get(key); // 값
			System.out.println("("+key+","+value+")");
		}
		System.out.println();
		
		// 사용자로부터 영어 단어를 입력받고 한글 단어 검색
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("찾고싶은 단어를 영어로 입력해주세요?");
			String eng = sc.next();
			// 해시맵에서 '키' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng +"는 없는 단어입니다.");
			else
				System.out.println(kor);
		}
	}

}
