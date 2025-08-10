package openChallenge;

import java.util.Scanner;

class Player {
	String name;
	
	Player(String name){
		this.name = name;
	}
	
	// 한 턴에 단어 입력
	String sayWord(Scanner sc) {
		System.out.print(name + " >> ");
		return sc.nextLine().trim();
	}
}

class WordGameApp {
	private final Player[] players;
	private final Scanner sc;
	private final String startWord = "아버지";
	
	WordGameApp(Player[] players, Scanner sc){
		this.players = players;
		this.sc = sc;
	}
	
	void run() {
		System.out.println("---끝말잇기 시작---");
		System.out.println("시작 단어는 " + startWord+"입니다");
		String prev = startWord;
		
		int turn = 0;
		while(true) {
			Player p = players[turn % players.length];
			String word = p.sayWord(sc);
			
			// 빈 입력 처리(규칙 위반 패배)
			if(word.isEmpty()) {
				System.out.println("빈 단어를 입력했습니다. 패배자 : " + p.name);
				break;
			}
			
			char last = prev.charAt(prev.length() -1);
			char first = word.charAt(0);
			
			if(last != first) {
				System.out.println("규칙 위반! 이전 단어의 끝은 " + last +"입니다! " + last +"로 입력하셨어야 합니다.");
				System.out.println("패배자 : " +p.name);
				break;
			}
			
			// 통과 -> 다음 라운드
			prev = word;
			turn++;
		}
		
		System.out.println("게임 종료!");
	}
}

public class WordChainGame {

	public static void main(String[] args) {
		// 끝말잇기 게임
		Scanner sc = new Scanner(System.in);
		
		// 참가자 수 입력
		System.out.print("참가자 수를 입력하세요 >> ");
		int n = Integer.parseInt(sc.nextLine().trim());
		Player[] players = new Player[n];
		
		// 참가자 이름 입력
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + "번 참가자 이름 >> ");
			String name = sc.nextLine().trim();
			players[i] = new Player(name);
		}
		
		// 게임 실행
		WordGameApp app = new WordGameApp(players, sc);
		app.run();
		
		sc.close();
	}

}
