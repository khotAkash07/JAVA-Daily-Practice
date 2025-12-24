import java.util.Scanner;
class Table{
	int a;
	void setValue(int ab){
		a = ab;
	}
	void showTable(){
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(a + "*" + i + "=" +a*i);
		}
	}
}
public class TableApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		int myNum = sc.nextInt();
		
		Table tb = new Table();
		tb.setValue(myNum);
		tb.showTable();
	}
}
	