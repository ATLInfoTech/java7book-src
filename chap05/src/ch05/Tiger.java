package ch05;

public class Tiger extends Animal implements EatingMeat {

	@Override
	public void talk() {
		System.out.println("¾îÈï");
	}
	
	@Override
	public void eat(Meat meat) {
		System.out.println("°í±â ¸Ô±â");
	}

}
