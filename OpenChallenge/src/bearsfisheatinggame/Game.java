package bearsfisheatinggame;

import java.util.Random;
import java.util.Scanner;

public class Game {
	protected static final int HEIGHT = 10;
	protected static final int WIDTH = 20;

	// 보드 버퍼
	private static char[][] board = new char[HEIGHT][WIDTH];

	// 보드 초기화(모두 '-')
	private static void clearBoard() {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				board[i][j] = '-';
			}
		}
	}

	// 보드에 객체 찍기 (y : 행, x : 열)
	private static void place(GameObject obj) {
		int x = obj.getX();
		int y = obj.getY();
		board[y][x] = obj.getShape();
	}

	// 보드 출력
	private static void draw() {
		for (int i = 0; i < HEIGHT; i++) {
			System.out.println(board[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int startX = random.nextInt(WIDTH);
		int startY = random.nextInt(HEIGHT);

		// Bear/Fish 생성(거리 1칸씩)
		Bear bear = new Bear(0, 0, 1);
		Fish fish = new Fish(startX, startY, 1);

		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. ** \n");
		
		// 게임 루프
		while(true) {
			// 화면 갱신
			clearBoard();
			place(fish);
			place(bear);
			draw();
			
			// 한 글자만 입력받기
			System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
			String line = sc.nextLine().trim();
			char input = line.isEmpty() ? '\0' : line.charAt(0); // 빈자리 입력 방지
			
			// bear 이동
			bear.move(input);
			
			// fish 이동
			fish.move(input);
			
			// 충돌 체크 -> 종료
			if(bear.collide(fish)) {
				clearBoard();
				place(fish);
				place(bear);
				draw();
				System.out.println("Bear가 Fish를 먹었습니다! 게임 종료!");
				break;
			}
			
			System.out.println();
		}
		sc.close();
	}

}
