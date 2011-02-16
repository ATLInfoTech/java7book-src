package ch08;

public class Zookeeper {

	public void giveMeatFood(Cage<? extends Carnivores> cage) {
		cage.giveFood(new Chicken()); // Chicken은 Food의 하위 타입
	}
	
	public void clean(Cage<?> cage) {
		if (!cage.isEmpty()) {
			// 청소 안함
			return;
		}
		// 청소함
	}

	public <T extends Animal> void push(Cage<T> cage, T animal) {
		cage.add(animal);
	}
	
	public <T extends Tiger> T pullTiger(Cage<T> cage) {
		return cage.remove();
	}
}
