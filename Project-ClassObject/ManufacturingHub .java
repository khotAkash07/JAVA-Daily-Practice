import java.util.Scanner;
class Product{
	// id,name,rate,qty,count 

	private int id;
	private String name;
	private int rate;
	private int quant;
	private int count = 0;
	
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
	public void setRate(int r){
		rate = r;
	}
	public int getRate(){
		return rate;
	}
	public void setQuant(int q){
		quant = q;
	}
	public int getQuant(){
		return quant;
	}
}
class Machinery{
	//id,name,comp,capacity
	private int id,count=0;
	private String name;
	private String comp;
	private int capacity;
	
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
	public void setComp(String c){
		comp = c;
	}
	public String getComp(){
		return comp;
	}
	public void setCapacity(int c){
		capacity = c;
	}
	public int getCapacity(){
		return capacity;
	}
	
	Product p[];
	
	public void setProduct(Product p1[]){
		p = p1;
	}
	public Product [] getProduct(){
		return p;
	}
	
	public void setProductCount(int ct){
		count = ct;
	}
	public int getProductCount(){
		return count;
	}
	
	public Product getProductById(int i1){
		for(int i = 0 ; i < p.length ; i++){
			if(p[i].getId() == i1){
				return p[i];
			}
		}
		return null;
	}
}
class ProductionHouse{
	
	Machinery m[] = new Machinery[4];
	
	public void allocateMachinry(Machinery m1[]){
		m = m1;
	}
	public Machinery [] getMachinery(){
		return m;
	}
	Product [] getProductsByMachineryId(int id){
		for(int i = 0 ; i < m.length ; i++){
			if(m[i].getId() == id){
				return m[i].getProduct();
			}
		}
		return null;
	}
	
	Machinery [] getAllProductionByAllMachine(){
		return m;
	}
	
	public int MachineryCount(){
		return m.length;
	}

}
public class ManufacturingHub{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String compName = "Akash Manifacturing PVT limited";
		Machinery m[] = new Machinery[4];
		
		for(int i = 0 ; i < m.length ; i++){
			m[i] = new Machinery();
			System.out.println("-------------------------------------");
			System.out.println("\nFor Machinery "+(i+1));
			System.out.println("\nEnter machine Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter machine Name");
			String name = sc.nextLine();
			System.out.println("Enter capacity of machine");
			int capa = sc.nextInt();
			
			m[i].setId(id);
			m[i].setName(name);
			m[i].setCapacity(capa);
			m[i].setComp(compName);
		}
		//E:\Giri`s Tech Hub\Practicals\Project-ClassObject\ManufacturingHub .java
		
		Product p[] = new Product[5];
		
		for(int i = 0 ; i < m.length ; i++){
			for(int j = 0 ; j < p.length ; j++){
				p[j] = new Product();
				System.out.println("-------------------------------------");
			System.out.println("\nFor Product "+(i+1));
				System.out.println("\nEnter Product Id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter product name");
				String name = sc.nextLine();
				System.out.println("Enter product rate");
				int rate = sc.nextInt();
				System.out.println("Enter Product Quantity");
				int quant = sc.nextInt();
				
				if(quant <= m[i].getCapacity()){
					p[j].setId(id);
					p[j].setName(name);
					p[j].setRate(rate);
					p[j].setQuant(quant);
				}else{
					System.out.println("Your Quantity of product is greter than Capacity of machine");
				}
			}		
		}
		
		
	}
}