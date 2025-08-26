package bearsfisheatinggame;

public class Bear extends GameObject {
	public Bear(int x, int y, int d) {
		super(x, y, d);
	}

	@Override
	protected void move(char input) {
		int dx = 0, dy = 0;
		if (input == 'a') { // ����
			dx -= distance;
		} else if (input == 'f') { // ������
			dx += distance;
		} else if (input == 's') { // �Ʒ�
			dy += distance;
		} else if (input == 'd') { // ��
			dy -= distance;
		}

		x = Math.max(0, Math.min(Game.WIDTH - 1, x + dx));
		y = Math.max(0, Math.min(Game.HEIGHT - 1, y + dy));
	}

	@Override
	protected char getShape() {
		return 'B';
	}
}