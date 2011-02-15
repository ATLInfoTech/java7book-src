package ch08;

public class Cage<T extends Animal> {

    private T animal;

    public void add(T animals) {
        this.animal = animal;
    }

	public T remove() {
        T temp = animal;
        animal = null;
        return temp;
	}
	
	public void giveFood(Food food) {
		if (animal == null) {
			return;
		}
		animal.eat(food);
	}

	public boolean isEmpty() {
		return animal == null;
	}
}
