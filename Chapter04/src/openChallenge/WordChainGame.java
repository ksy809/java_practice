package openChallenge;

import java.util.Scanner;

class Player {
	String name;
	
	Player(String name){
		this.name = name;
	}
	
	// �� �Ͽ� �ܾ� �Է�
	String sayWord(Scanner sc) {
		System.out.print(name + " >> ");
		return sc.nextLine().trim();
	}
}

class WordGameApp {
	private final Player[] players;
	private final Scanner sc;
	private final String startWord = "�ƹ���";
	
	WordGameApp(Player[] players, Scanner sc){
		this.players = players;
		this.sc = sc;
	}
	
	void run() {
		System.out.println("---�����ձ� ����---");
		System.out.println("���� �ܾ�� " + startWord+"�Դϴ�");
		String prev = startWord;
		
		int turn = 0;
		while(true) {
			Player p = players[turn % players.length];
			String word = p.sayWord(sc);
			
			// �� �Է� ó��(��Ģ ���� �й�)
			if(word.isEmpty()) {
				System.out.println("�� �ܾ �Է��߽��ϴ�. �й��� : " + p.name);
				break;
			}
			
			char last = prev.charAt(prev.length() -1);
			char first = word.charAt(0);
			
			if(last != first) {
				System.out.println("��Ģ ����! ���� �ܾ��� ���� " + last +"�Դϴ�! " + last +"�� �Է��ϼ̾�� �մϴ�.");
				System.out.println("�й��� : " +p.name);
				break;
			}
			
			// ��� -> ���� ����
			prev = word;
			turn++;
		}
		
		System.out.println("���� ����!");
	}
}

public class WordChainGame {

	public static void main(String[] args) {
		// �����ձ� ����
		Scanner sc = new Scanner(System.in);
		
		// ������ �� �Է�
		System.out.print("������ ���� �Է��ϼ��� >> ");
		int n = Integer.parseInt(sc.nextLine().trim());
		Player[] players = new Player[n];
		
		// ������ �̸� �Է�
		for(int i=0; i<n; i++) {
			System.out.print((i+1) + "�� ������ �̸� >> ");
			String name = sc.nextLine().trim();
			players[i] = new Player(name);
		}
		
		// ���� ����
		WordGameApp app = new WordGameApp(players, sc);
		app.run();
		
		sc.close();
	}

}
