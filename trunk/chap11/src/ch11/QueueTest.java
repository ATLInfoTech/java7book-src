package ch11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		QueueTest test = new QueueTest();
		test.testDeque();
		test.testPriorityQueue();
	}

	private void testDeque() {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.push(5); // [5]
		deque.push(4); // [5, 4]
		System.out.println(deque.pop()); // 4 출력, [5]
		deque.offerFirst(3); // [3, 5];
		deque.offerLast(6); // [3, 5, 6]
		System.out.println(deque.pollFirst()); // 3 출력, [5, 6]
	}

	private void testPriorityQueue() {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.offer(1); queue.offer(3); queue.offer(6);
		queue.offer(2); queue.offer(5); queue.offer(4);

		System.out.println("poll: " + queue.poll()); // 1 출력
		System.out.println("poll: " + queue.poll()); // 2 출력
		for (Integer val: queue) {
			System.out.println("값: " + val);
		}
	}
}
