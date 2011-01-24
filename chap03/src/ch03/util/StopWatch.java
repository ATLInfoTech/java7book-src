package ch03.util;

public class StopWatch {

	private long startTime;
	private long stopTime;

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		stopTime = System.nanoTime();
	}

	public Time getPassedTime() {
		return new Time(stopTime - startTime);
	}
}
