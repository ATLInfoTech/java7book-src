package ch08;

public class Server {

	private State state;
	
	public void open() {
		// ���� �۾�
		setState(State.OPENED);
	}
	
	private void setState(State state) {
		this.state = state;
	}
}
