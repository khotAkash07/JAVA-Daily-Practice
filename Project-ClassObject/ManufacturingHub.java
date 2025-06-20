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
	
	public void getProductById(int i1){
		for(int i = 0 ; i < p.length ; i++){
			if(p[i].getId() == i1){
				System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRate()+"\t"+p[i].getQuant());
			}
		}
	}
}
class ProductionHouse{
	
	Machinery m[];
	
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
		
		String compName = "Akash Manufacturing PVT Limited";
		Machinery m[] = new Machinery[2];
		
		for(int i = 0 ; i < m.length ; i++){
			m[i] = new Machinery();
			System.out.println("\n-------------------------------------");
			System.out.println("For Machinery "+(i+1));
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
		
		
		
		for(int i = 0 ; i < m.length ; i++){
			System.out.println("\n-------------------------------------");
			System.out.println("Enter Product for machine "+(i+1));
			Product p[] = new Product[2];
			for(int j = 0 ; j < p.length ; j++){
				p[j] = new Product();
				System.out.println("-------------------------------------");
				System.out.println("For Product "+(j+1));
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
					System.out.println("Your Quantity of product is greter than Capacity of machine\nPlease re-Enter product details");
					j--;
				}
				
			}
			m[i].setProduct(p);	
		}
		
		ProductionHouse ph = new ProductionHouse();
		ph.allocateMachinry(m);
		//Machinery ph02[] = ph.getMachinery();
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("Machine ID \t Machine Name \t\t Company Name \t\t\t Machine Capacity");
		System.out.println("----------------------------------------------------------------------------------------------------");
		for(int i = 0 ; i < m.length ; i++){
			System.out.println("\n"+m[i].getId()+"\t\t"+m[i].getName()+"\t\t"+m[i].getComp()+"\t\t"+m[i].getCapacity());
			System.out.println("\n\t\t----------------------------------------------------------------------------------------------------");
			System.out.println("\t\tProduct ID \t Product Name \t Product Rate \t Product Quantity");
			System.out.println("\t\t----------------------------------------------------------------------------------------------------");
				for(int j = 0 ; j < m[i].getProduct().length ; j++){
					System.out.println("\t\t"+m[i].getProduct()[j].getId()+"\t\t"+m[i].getProduct()[j].getName()+"\t\t"+m[i].getProduct()[j].getRate()+"\t\t"+m[i].getProduct()[j].getQuant());
				}
		}
		
		System.out.println("Enter product id for show detail of that product");
		int myId = sc.nextInt();
		for (int i = 0; i < m.length; i++) {
			m[i].getProductById(myId);
		}

	}
}