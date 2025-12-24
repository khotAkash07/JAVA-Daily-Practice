package org.slidingWindow;

import java.util.*;

public class FindNegative {

	public static void main(String[] args) {

		int k = 3;

		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(-1);
		al.add(-7);
		al.add(8);
		al.add(-15);
		al.add(30);
		al.add(16);
		al.add(28);

		List<Integer> result = getNegative(al, k);
		System.out.println(result);
	}

	public static List<Integer> getNegative(ArrayList<Integer> al, int k) {

		List<Integer> result = new ArrayList<>();
		Deque<Integer> dq = new LinkedList<>();

		int i = 0, j = 0;

		while (j < al.size()) {

			// Step 1: add negative index
			if (al.get(j) < 0) {
				dq.addLast(j);
			}

			// Step 2: window size not reached
			if (j - i + 1 < k) {
				j++;
			}

			// Step 3: window size reached
			else if (j - i + 1 == k) {

				if (!dq.isEmpty()) {
					result.add(al.get(dq.peekFirst()));
				} else {
					result.add(0);
				}

				// Step 4: remove outgoing element
				if (!dq.isEmpty() && dq.peekFirst() == i) {
					dq.pollFirst();
				}

				i++;
				j++;
			}
		}
		return result;
	}
}
