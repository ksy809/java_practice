package interfaceEx;

// 클래스 상속과 함께 인터페이스 구현

class Calc { // 클래스 작성
	public int calculate(int x, int y) {
		return x+y;
	}
}

// SmartPhone 클래스는 Calc를 상속 받고, PhoneInterface 인터페이스의 추상 메소드 모두 구현
class SmartPhone extends Calc implements PhoneInterface{
	// PhoneInterface의 추상메소드 구현
	@Override
	public void sendCall() {
		System.out.println("띠리링~");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요~");
	}
	
	// 추가 작성 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();

	}

}
