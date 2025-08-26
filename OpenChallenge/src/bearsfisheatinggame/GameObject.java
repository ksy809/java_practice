package bearsfisheatinggame;

/*
�� ������ Bear�� Fish ��ü�� �����ϸ�, �̵��� 10�� 20���� �����ǿ��� ���� ������ ��Ģ�� ���� �����δ�.
Bear�� ������� Ű�� ���� ����(a), �Ʒ�(s), ��(d), ������(f)���� �� ĭ�� �����̰�, 
Fish�� �ټ� �� �� �� ���� ���ڸ��� �ְ�, ������ �� ���� 4���� ���� �� �����ϰ� �� ĭ�� �����δ�.
������ Bear�� Fish�� ������ (Fish�� ��ġ�� �̵�) �������� ������.
*/

public abstract class GameObject { // �߻� Ŭ����
	protected static final int HEIGHT = 10;
	protected static final int WIDTH = 20;

	protected int distance; // �� �� �̵� �Ÿ�
	protected int x, y; // ���� ��ġ(ȭ�� �� ���� ��ġ)

	public GameObject(int startX, int startY, int distance) { // �ʱ� ��ġ�� �̵� �Ÿ� ����
		super();
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean collide(GameObject p) {// �� ��ü�� ��ü p�� �浹������ true ����
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		} else {
			return false;
		}

	}

	protected abstract void move(char input);

	protected abstract char getShape(); // ��ü�� ����� ��Ÿ���� ���� ����

}




