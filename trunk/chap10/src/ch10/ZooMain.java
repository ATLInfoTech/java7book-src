package ch10;

public class ZooMain {

	public static void main(String[] args) {
		Zookeeper keeper = new Zookeeper();
		
		Cage<Tiger> tigerCage = new Cage<>();
		Tiger tiger = new Tiger();
		
		keeper.push(tigerCage, tiger);
		keeper.giveMeatFood(tigerCage);
	}
}
