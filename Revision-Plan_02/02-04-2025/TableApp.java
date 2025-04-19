import java.util.Scanner;
class Table{
	int num;
	public void setValue(int num){
		this.num = num;
	}
	public void showTable(){
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}
public class TableApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to show table");
		int num = sc.nextInt();
		
		Table t = new Table();
		t.setValue(num);
		t.showTable();
	}
}
