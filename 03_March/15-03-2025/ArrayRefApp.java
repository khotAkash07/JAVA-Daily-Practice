import java.util.Scanner;

class ArrayRef{
	private int id;
	private String name;
	private int run;
	
	public void setId(int i){
		id = i;
	}
	public int getId(){
		return id;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setRun(int r){
		run = r;
	}
	public int getRun(){
		return run;
	}
}
public class ArrayRefApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayRef ar[] = new ArrayRef[3];
		for(int i = 0 ; i < ar.length ; i++){
			ar[i] = new ArrayRef();
			System.out.println("Enter id, name, runs");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int runs =  sc.nextInt();
			
			ar[i].setId(id);
			ar[i].setName(name);
			ar[i].setRun(runs);
		}
		System.out.println("Given data is = ");
		for(int i = 0 ; i < ar.length ; i++){
			System.out.println(ar[i].getId()+"\t"+ar[i].getName()+"\t"+ar[i].getRun());
			
		}
	}
}
	