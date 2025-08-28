package englishvocabularytestprogram;

import java.util.Vector;
/* 영어 단어의 뜻 맞추기 게임
 * 영어 단어와 한글 단어로 구성되는 Word 클래스 작성
 * 프로그램 내에서 미리 여러개의 Word 객체를 Vector<Word> 컬랙션에 삽입
 * 랜덤하게 사용자가 문제를 던짐
 * 보기는 백터내에 정답이 아닌 단어를 랜덤하게 3개 선택하고 정답과 함께 4개의 보기 출력
 * */
public class WordQuiz {
	public static void main(String[] args) {
		Vector<Word> v = new Vector<Word>();
		
		v.add(new Word("love","사랑"));
		v.add(new Word("animal","동물"));
		v.add(new Word("apple", "사과"));
        v.add(new Word("book", "책"));
        v.add(new Word("computer", "컴퓨터"));
        v.add(new Word("music", "음악"));
        v.add(new Word("river", "강"));
        v.add(new Word("mountain", "산"));
        v.add(new Word("friend", "친구"));
        v.add(new Word("family", "가족"));
        v.add(new Word("coffee", "커피"));
	}
}
