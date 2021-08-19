package test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Comparator<Integer> comparator = Comparator.comparing(Integer::intValue).reversed();

		PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);
		queue.add(10);
		queue.add(2);
		queue.add(14);
		queue.add(1);
		queue.add(3);

		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
