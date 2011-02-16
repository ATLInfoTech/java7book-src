package ch08;

public class Zookeeper {

	public void giveMeatFood(Cage<? extends Carnivores> cage) {
		cage.giveFood(new Chicken()); // Chicken�� Food�� ���� Ÿ��
	}
	
	public void clean(Cage<?> cage) {
		if (!cage.isEmpty()) {
			// û�� ����
			return;
		}
		// û����
	}

	public <T extends Animal> void push(Cage<T> cage, T animal) {
		cage.add(animal);
	}
	
	public <T extends Tiger> T pullTiger(Cage<T> cage) {
		return cage.remove();
	}
}
