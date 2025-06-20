import java.util.Scanner;
class Perfect{
	int num;
	public void setValue(int num){
		this.num = num;
	}
	public void showPerfect(){
		int sum = 0;
		for(int i = 1 ; i < num/2 ; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		if(sum == num){
			System.out.println("Given number is perfect");
		}else{
			System.out.println("Given number is not perfect");
		}
	}
}
public class PerfectApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to check perfect or not");
		int num = sc.nextInt();
		
		Perfect t = new Perfect();
		t.setValue(num);
		t.showPerfect();
	}
}
