import java.util.*;
public class TableRecursionApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value for printing table :");
		int num = sc.nextInt();
		final int incrementalValue = 1;
		getTable(num,incrementalValue);
	}
	public static void getTable(int a,int i){
		if(i > 10) return;
		
		if(i == 1) System.out.println("0"+a+" * 0"+i+" = 0"+a*i);
		else if (i == 10) System.out.println("0"+a+" * "+i+" = "+a*i);
		else System.out.println("0"+a+" * 0"+i+" = "+a*i);
		getTable(a,i+1);
	}
}