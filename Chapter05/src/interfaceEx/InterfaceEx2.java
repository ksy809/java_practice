package interfaceEx;

// Ŭ���� ��Ӱ� �Բ� �������̽� ����

class Calc { // Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x+y;
	}
}

// SmartPhone Ŭ������ Calc�� ��� �ް�, PhoneInterface �������̽��� �߻� �޼ҵ� ��� ����
class SmartPhone extends Calc implements PhoneInterface{
	// PhoneInterface�� �߻�޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("�츮��~");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��~");
	}
	
	// �߰� �ۼ� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 5));
		phone.schedule();

	}

}
