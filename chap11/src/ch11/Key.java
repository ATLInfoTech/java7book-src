package ch11;

public class Key {
	private int value;

	public Key(int value) {
		this.value = value;
	}
	public int value() {
		return value;
	}
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (!(o instanceof Key)) return false;
		Key other = (Key) o;
		return this.value == other.value;
	}
	@Override
	public int hashCode() {
		return value;
	}
	
}
