package lovebabbar;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class KthMaxAndMinElement {

	static int findKthMin(int ar[], int k) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < ar.length; i++) {
			if (stack.size() < k) {
				stack.push(ar[i]);

			} else {
				if (stack.peek() > ar[i]) {
					stack.pop();
					stack.push(ar[i]);
				}
			}
		}

		return stack.peek();
	}

	static int findKthMinElement(int ar[], int k) {

		Comparator<Integer> comparator = Comparator.comparingInt(Integer::intValue).reversed();
		PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);

		for (int i = 0; i < ar.length; i++) {

			queue.add(ar[i]);
			if (queue.size() > k) {
				queue.poll();
			}
		}

		return queue.peek();
	}

	static int findKthMaxElement(int ar[], int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < ar.length; i++) {

			queue.add(ar[i]);
			if (queue.size() > k)
				queue.poll();
		}

		return queue.peek();
	}

	public static void main(String[] args) {
		int ar[] = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		int kthSmallestElement = findKthMinElement(ar, k);
		System.out.println(k + " smallest element is " + kthSmallestElement);

		int kthMaximumElement = findKthMaxElement(ar, k);
		System.out.println(k + " maximum element is " + kthMaximumElement);
	}
}
