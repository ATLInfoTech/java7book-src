package ch10;

import java.io.Serializable;

public class Cage<T extends Animal & Serializable> {

    private T animal;

    public void add(T animal) {
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
