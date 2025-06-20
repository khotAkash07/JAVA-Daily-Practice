import java.util.Scanner;
class Product{
	//Product class: id,name,price,qty,rate 
	int id,price,qty,rate;
	String name;
	
	public void setID(int id){
		this.id = id;
	}
	public int getID(){
		return id;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public int getQty(){
		return qty;
	}
	public void setRate(int rate){
		this.rate = rate;
	}
	public int getRate(){
		return rate;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class Customer{
	String name;
	int id,mob;
	public void setID(int id){
		this.id = id;
	}
	public int getID(){
		return id;
	}
	public void setMob(int mob){
		this.mob = mob;
	}
	public int getMob(){
		return mob;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}	
	
	Product p[];
	public void setProduct(Product ...p){
		this.p = p;
	}
	public Product [] getProduct(){
		return p;
	}
}
public class BillingApp{
	public static void main(String args[]){
		
		
		int total = 0;
		Product p1 = new Product();
		p1.setID(1);
		p1.setName("Book");
		p1.setQty(10);
		p1.setRate(200);
		
		Product p2 = new Product();
		p2.setID(2);
		p2.setName("Pen");
		p2.setQty(15);
		p2.setRate(20);
		
		Product p3 = new Product();
		p3.setID(3);
		p3.setName("Scale");
		p3.setQty(5);
		p3.setRate(5);
		
		Product p4 = new Product();
		p4.setID(4);
		p4.setName("Calci");
		p4.setQty(10);
		p4.setRate(1220);
		
		Product p5 = new Product();
		p5.setID(5);
		p5.setName("dairy");
		p5.setQty(17);
		p5.setRate(320);
		
		Customer c = new Customer();
		
		c.setID(1);
		c.setName("Abhishek");
		c.setMob(9025737);
		c.setProduct(p1,p2,p3,p4,p5);
		
		Product pp[] = c.getProduct();
		System.out.println("\n----------------------------------------------------------");
		System.out.println("Customer Name = "+c.getName());
		System.out.println("Customer Mobile ="+c.getMob());
		System.out.println("----------------------------------------------------------");
		System.out.println("P-ID\tP-NAME\tP-RATE\t   P-QUANTITY\tToatal");
		System.out.println("----------------------------------------------------------");
		for(int i = 0 ; i < pp.length ; i++){
			System.out.println(pp[i].getID()+"\t"+pp[i].getName()+"\t"+pp[i].getRate()+"\t\t"+pp[i].getQty()+"\t"+((pp[i].getRate())*(pp[i].getQty())));
			total += ((pp[i].getRate())*(pp[i].getQty()));
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("\t\t\tComplate Total = "+total);
		
		
	}
}