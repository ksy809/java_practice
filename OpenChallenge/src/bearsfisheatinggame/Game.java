package bearsfisheatinggame;

import java.util.Random;
import java.util.Scanner;

public class Game {
	protected static final int HEIGHT = 10;
	protected static final int WIDTH = 20;

	// ���� ����
	private static char[][] board = new char[HEIGHT][WIDTH];

	// ���� �ʱ�ȭ(��� '-')
	private static void clearBoard() {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				board[i][j] = '-';
			}
		}
	}

	// ���忡 ��ü ��� (y : ��, x : ��)
	private static void place(GameObject obj) {
		int x = obj.getX();
		int y = obj.getY();
		board[y][x] = obj.getShape();
	}

	// ���� ���
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

		// Bear/Fish ����(�Ÿ� 1ĭ��)
		Bear bear = new Bear(0, 0, 1);
		Fish fish = new Fish(startX, startY, 1);

		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�. ** \n");
		
		// ���� ����
		while(true) {
			// ȭ�� ����
			clearBoard();
			place(fish);
			place(bear);
			draw();
			
			// �� ���ڸ� �Է¹ޱ�
			System.out.print("����(a), �Ʒ�(s), ��(d), ������(f) >> ");
			String line = sc.nextLine().trim();
			char input = line.isEmpty() ? '\0' : line.charAt(0); // ���ڸ� �Է� ����
			
			// bear �̵�
			bear.move(input);
			
			// fish �̵�
			fish.move(input);
			
			// �浹 üũ -> ����
			if(bear.collide(fish)) {
				clearBoard();
				place(fish);
				place(bear);
				draw();
				System.out.println("Bear�� Fish�� �Ծ����ϴ�! ���� ����!");
				break;
			}
			
			System.out.println();
		}
		sc.close();
	}

}
