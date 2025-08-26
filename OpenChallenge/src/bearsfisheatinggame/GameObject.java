package bearsfisheatinggame;

/*
이 게임은 Bear와 Fish 객체가 등장하며, 이들은 10행 20열의 격자판에서 각각 정해진 규칙에 의해 움직인다.
Bear은 사용자의 키에 의해 왼쪽(a), 아래(s), 위(d), 오른쪽(f)으로 한 칸씩 움직이고, 
Fish는 다섯 번 중 세 번은 제자리에 있고, 나머지 두 번은 4가지 방향 중 랜덤하게 한 칸씩 움직인다.
게임은 Bear가 Fish를 먹으면 (Fish의 위치로 이동) 성공으로 끝난다.
*/

public abstract class GameObject { // 추상 클래스
	protected static final int HEIGHT = 10;
	protected static final int WIDTH = 20;

	protected int distance; // 한 번 이동 거리
	protected int x, y; // 현재 위치(화면 맵 상의 위치)

	public GameObject(int startX, int startY, int distance) { // 초기 위치와 이동 거리 설정
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

	public boolean collide(GameObject p) {// 이 객체가 객체 p와 충돌했으면 true 리턴
		if (this.x == p.getX() && this.y == p.getY()) {
			return true;
		} else {
			return false;
		}

	}

	protected abstract void move(char input);

	protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴

}




