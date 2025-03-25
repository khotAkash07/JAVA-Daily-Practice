import java.util.Scanner;

class Product{
	
	private int id;
	private String name;
	private int price;
	
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
	public void setPrice(int p){
		price = p;
	}
	public int getPrice(){
		return price;
	}
}
public class ProductApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Product pd[] = new Product[5];
		
		for(int i = 0 ; i < pd.length ; i++){
			pd[i] = new Product();
			System.out.println("\n--------------------------------------------------------------------------------");
			System.out.println("Enter Product Id, Name And Price : ");
			System.out.println("--------------------------------------------------------------------------------");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int price = sc.nextInt();
			pd[i].setId(id);
			pd[i].setName(name);
			pd[i].setPrice(price);
		}
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("Added Product list :");
		System.out.println("\n--------------------------------------------------------------------------------");
		for(int i = 0 ; i < pd.length ; i++){
			System.out.println(pd[i].getId()+"\t"+pd[i].getName()+"\t\t"+pd[i].getPrice());
		}
	}
}