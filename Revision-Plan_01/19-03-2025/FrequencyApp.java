/**********
12323145
1 --->2
2 --->2
3 --->2
4 --->1
5 --->1
**********/
import java.util.Scanner;
public class FrequencyApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5+ digit number to find frequency of each digit");
		int myNum = sc.nextInt();
		int copy = myNum;
		int rem = 0;
		int max = 0;
		
		while(myNum > 0){
			rem = myNum%10;
			if(rem > max){
				max = rem;
			}
			myNum /= 10;
		}
		
		System.out.println(max);
		
		for(int i = 0 ; i <= max ; i++)
		{
			myNum = copy;
			int count = 0;
			while(myNum > 0){
				rem = myNum % 10;
				if(rem == i){
					count++;
				}
				myNum /= 10;
			}
			if(count > 0){
				System.out.println(i+" Present in given number for "+count+" times.");
			}
		}
		
	}
}

				
			