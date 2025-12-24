import java.util.*;

public class FindNegative{
	public static void main(String args[]){
		
		int	k = 3;
		boolean flag;
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(-1);
		al.add(-7);
		al.add(8);
		al.add(-15);
		al.add(30);
		al.add(16);
		al.add(28);
		
		List<Integer> result = getNegative(al,k);
		System.out.println(result);
		

		/******************************************************
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		for(int i=0; i<=al.size()-k; i++){
			flag = false;
			int count = i;
			while(count < k+i){
				//System.out.println(al.get(count));
				if(al.get(count) < 0){
					ad.push(al.get(count));
					flag = true;
					break;
				}
				count++;
			}
			System.out.println(flag);
			if(!flag) ad.push(0);
		}
		System.out.println(ad);
		***************************************************************/
	
	}
	public static List<Integer> getNegative(ArrayList<Integer> al, int k){
		
		List<Integer> li = new ArrayList<>();
		Deque<Integer> dq = new LinkedList<>();
		
		int i=0, j=0;
		
		while( j < al.size() ){
			if(al.get(j) < 0){
				dq.addLast(j);
			}
			
			if(j - i + 1 < k){j++;}
			else if(j - i + 1 == k){
				
				if(!dq.isEmpty() && dq.peekFirst() >= i){
					li.add(al.get(dq.peekFirst()));
				}else{
					li.add(0);
				}
			}
			
			if(!dq.isEmpty() && dq.peekFirst() == i){
				dq.pollFirst();
			}	
			i++;
			j++;
		}
		
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
		return li;
	}
}