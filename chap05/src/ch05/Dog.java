package ch05;

public class Dog extends Animal implements EatingMeat, Trained {

	@Override
	public void talk() {
		System.out.println("¸Û¸Û");
	}

	@Override
	public void eat(Meat meat) {
		System.out.println("¾ä¾ä");
	}
	
	public void meet(Dog dog) {
		System.out.println("²¿¸® »ì¶û");
	}

	@Override
	public void receive(String command) {
		switch(command) {
		case "Â¢¾î":
			System.out.println("¿Ð¿Ð");
			break;
		case "»§":
			System.out.println("±ú°»");
			break;
		}
	}

}
