package ch08;

public class ExtRepository<T, K> 
		implements Repository<T, K>, RandomAccessible<T> {

	@Override
	public void add(T e) {
	}

	@Override
	public T find(K id) {
		return null;
	}

	@Override
	public T random() {
		return null;
	}
}
