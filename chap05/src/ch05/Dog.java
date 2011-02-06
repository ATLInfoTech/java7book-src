package ch05;

public class Dog extends Animal implements EatingMeat, Trained {

	@Override
	public void talk() {
		System.out.println("�۸�");
	}

	@Override
	public void eat(Meat meat) {
		System.out.println("���");
	}
	
	public void meet(Dog dog) {
		System.out.println("���� ���");
	}

	@Override
	public void receive(String command) {
		switch(command) {
		case "¢��":
			System.out.println("�п�");
			break;
		case "��":
			System.out.println("����");
			break;
		}
	}

}
