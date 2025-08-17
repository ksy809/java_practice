package interfaceEx;

// �������̽� �ۼ� �� ����

class SamsungPhone implements PhoneInterface { // �������̽� ����
	// PhoneInterface�� ��� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("�츮��~");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	// �޼ҵ� �߰� �ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
