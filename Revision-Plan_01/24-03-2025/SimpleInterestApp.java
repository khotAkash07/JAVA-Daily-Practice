//calculate simple interest
import java.util.Scanner;
class SimpleInterest{
	int pa;
	int rate;
	int time;
	public void setData(int pa,int rate,int time){
		this.pa = pa;
		this.rate = rate;
		this.time = time;
	}
	public void calculateSI(){
		int si = (pa/100)*rate*time;
		System.out.println("Simple interest is = "+si);
	}
}
public class SimpleInterestApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		int pa = sc.nextInt();
		System.out.println("Enter Percentage rate");
		int rate = sc.nextInt();
		System.out.println("Enter yearly time");
		int time = sc.nextInt();
		
		SimpleInterest si = new SimpleInterest();
		si.setData(pa,rate,time);
		si.calculateSI();
	}
}