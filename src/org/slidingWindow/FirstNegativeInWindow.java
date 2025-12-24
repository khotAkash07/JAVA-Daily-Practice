import java.util.*;

public class FirstNegativeInWindow {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        
        List<Integer> result = firstNegativeInWindow(arr, k);
        System.out.println(result); // Output: [-1, -1, -7, -15, -15, 0]
    }

    public static List<Integer> firstNegativeInWindow(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {
            // Add index of negative number to deque
            if (arr[j] < 0) {
                dq.addLast(j);
            }

            // Check if window has reached size k
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // Window is of size k
                if (!dq.isEmpty() && dq.peekFirst() >= i) {
                    ans.add(arr[dq.peekFirst()]);
                } else {
                    ans.add(0);
                }

                // Remove the element going out of the window
                if (!dq.isEmpty() && dq.peekFirst() == i) {
                    dq.pollFirst();
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}
