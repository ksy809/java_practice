package bearsfisheatinggame;

public class Fish extends GameObject {
	private java.util.Random random = new java.util.Random();

	public Fish(int x, int y, int d) {
		super(x, y, d);
	}

	@Override
	protected void move(char cmd) {
		int pick = random.nextInt(5);
		if(pick<3) // 5번중에 3번은 정지
			return;
		
		int dir = random.nextInt(4);
		int dx =0, dy=0;
		switch(dir) {
			case 0:
				dx -= distance;
				break;
			case 1 :
				dx += distance;
				break;
			case 2 :
				dy -= distance;
				break;
			case 3 : 
				dy += distance;
				break;
		}
		
		x = Math.max(0, Math.min(Game.WIDTH-1, x+dx));
		y = Math.max(0, Math.min(Game.HEIGHT-1, y+dy));
	}
	
	@Override
	protected char getShape() {
		return '@';
	}
}