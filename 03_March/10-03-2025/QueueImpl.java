import java.util.Scanner;
class Queue{
	int queue[] = new int[5];
	int front = 0,rare = -1;
	boolean isEmpty(){
		if((front == 0 && rare == -1)||(front == rare+1)){
			return true;
		}else{
			return false;
		}
	}
	
	void push(int value){
		
		if(rare == queue.length-1){
			System.out.println("Queue is overflow");
		}else{
			rare++;
			queue[rare] = value;			
		}
	}
	
	int pop(){
		int result = 0;
		if(isEmpty()){
			System.out.println("Queue is underflow");
		}else{
			result = queue[front];
			for(int i = 0 ; i < rare ; i++){
				for(int j = i+1 ; j <= rare; j++){
					queue[i] = queue[j];
					break;
				}
			}
			rare--;
		}
		return result;
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is underflow");
		}else{
			System.out.println("Queue elements are\n-------------------------------------------------------");
			
			for(int i = 0 ; i <= rare ; i++){
				System.out.print("  "+queue[i]+" |");
			}
		}
	}
	
	void search(int value){
		if(isEmpty()){
			System.out.println("Queue is underflow");
		}else{
			for(int i = 0 ; i < queue.length ; i++){
				if(queue[i] == value){
					System.out.println(queue[i]+" is present in queue at "+i+" Position");
				}else{
					System.out.println("Given element is not present in queue");
				}
			}
		}
	}
}
public class QueueImpl{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		do{
			System.out.println("\n-------------------------------------------------------");			
			System.out.println("1. Push");
			System.out.println("2. POP");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("5. Search");
			System.out.println("Enter your choice :");
			
			
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter value for push");
					int val = sc.nextInt();
					q.push(val);
					break;
				case 2:
					if(q.isEmpty()){
						System.out.println("--------- Queue is underflow ----------");
					}else{
						System.out.println("------- Removed element is ------- "+q.pop());
					}
					break;
				case 3:
					//s.isEmpty();
					q.display();
					break;
				case 4:
					System.exit(0);
					break;
				case 5:
					if(q.isEmpty()){
						System.out.println("---------- Queue is underflow ---------");
					}else{
						System.out.println("Enter Element for searching : ");
						int mySearch = sc.nextInt();
						q.search(mySearch);
					}
					break;						
				default:
					System.out.println("You enter wrong choice");
			}					
		}while(true);
	}
}
