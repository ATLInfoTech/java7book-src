package ch08;

public interface Repository<T, K> {

	public void add(T e);
	public T find(K id);
}
