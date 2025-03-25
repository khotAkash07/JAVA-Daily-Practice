import java.util.Scanner;
class Stack{
	int top = -1;
	boolean isEmtyStatus = false;
	int stack[] = new int[5];
	
	
	void push(int value){
		if(top == (stack.length-1)){
			System.out.println("--------------Stack is overflow--------------");
		}
		else{
			top++;
			stack[top] = value;
		}
	}
	int pop(){
		int value = 0;
		if(top == -1){
			System.out.println("--------------Stack is underflow--------------");
		}	
		else{
			value = stack[top];
			top--;
		}
		return value;
	}
	
	void display(){
		
		if(top == -1){
			System.out.println("--------------Stack is underflow--------------");
		}
		else{
			System.out.println("-------");
			for(int i = top ; i >= 0 ; i--){
				System.out.println(stack[i]);
			}
			System.out.println("-------");
		}
	}
	
	void search(int val1){
		if(!isEmpty()){
			boolean flag = false;
			for(int i = 0 ; i < stack.length ; i++){
				if(stack[i] == val1){
					flag = true;
					break;
				}
			}
			if(flag){
					System.out.println(val1+" is present in stack");
			}else{
				System.out.println(val1+" is not present in stack");					
			}
		}
	}
	boolean isEmpty(){
		
		if(top == -1){
			isEmtyStatus = true;
		}else{
			isEmtyStatus = false;
		}
		
		return isEmtyStatus;
	}
}
public class StackImpl{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		do{
			System.out.println("-------------------------------------------------------");			
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
					s.push(val);
					break;
				case 2:
					if(s.isEmpty()){
						System.out.println("--------- Stack is underflow ----------");
					}else{
						System.out.println("------- Removed element is ------- "+s.pop());
					}
					break;
				case 3:
					//s.isEmpty();
					s.display();
					break;
				case 4:
					System.exit(0);
					break;
				case 5:
					if(s.isEmpty()){
						System.out.println("---------- Stack is underflow ---------");
					}else{
						System.out.println("Enter Element for searching : ");
						int mySearch = sc.nextInt();
						s.search(mySearch);
					}
					break;
						
				default:
					System.out.println("You enter wrong choice");
				
			}
		}while(true);
	}
}
		