import java.util.Scanner;

class Product{
	//Product with field id,name and price and it is POJO class
		int id;
		String name;
		int price;
		int quant;
		void setId(int i){
			id = i;
		}
		int getId(){
			return id;
		}
		void setName(String n){
			name = n;
		}
		String getName(){
			return name;
		}
		void setPrice(int p){
			price = p;
		}
		int getPrice(){
			return price;
		}
		void setQuantity(int q){
			quant = q;
		}
		int getQuantity(){
			return quant;
		}
}
class Customer{
	//Customer with field id, name address,email , contact and it is POJO class
	int id;
	String name;
	String address;
	String email;
	int contact;
	
		void setId(int i){
			id = i;
		}
		int getId(){
			return id;
		}
		void setName(String n){
			name = n;
		}
		String getName(){
			return name;
		}
		void setAdress(String a){
			address = a;
		}
		String getAdress(){
			return name;
		}
		void setMail(String m){
			email = m;
		}
		String getMail(){
			return name;
		}
		void setContact(int c){
			contact = c;
		}
		int getContact(){
			return contact;
		}
}
class Shop{
	//Shop with following methods 
	Customer c;
	Product p[];
	void storeCustomer(Customer cc){
		//: this method can accept infinite product list	
		c = cc;
	}
	void storeProducts(Product ...pp){
		//: this method can accept infinite product list
	
		p = pp;
	}
	
	void calBill(){
		//: this method can calculate bill with grand total and your output should be 
		//id name address mail contact
		int without_GST = 0;		
		double with_GST = 0.0;
		System.out.print("cost ID = "+c.getId()+"\tName = "+c.getName()+"\tAdress = "+c.getAdress()+"\tEmail = "+c.getMail()+"\tContact = "+c.getContact());
		
		System.out.println("\n_________________________________________________________________________________");
		System.out.print("\nProdID\t"+" Prod Name\t"+"Prod Quantity\t"+"Prod Price\t"+"   Total\n\n");
		
		for(int i = 0 ; i < p.length ; i++){
			int total = 0;
			total = (p[i].getQuantity()*p[i].getPrice());
			without_GST += total;
			System.out.printf("%-10d %-15s %-15d %-15d %-15d%n",p[i].getId(),p[i].getName(),p[i].getQuantity(),p[i].getPrice(),total);
		}
		System.out.println("\n_________________________________________________________________________________");
		with_GST = without_GST + ((without_GST*18)/100);
		System.out.println("Total Bill Without GST = "+without_GST);
		System.out.println("Total Bill with 18% GST = "+with_GST);
	}
}
public class BillingApp{
	public static void main(String args[]){
		
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Akash");
		c.setAdress("Shivpuri");
		c.setMail("khotakash1234@gmail.com");
		c.setContact(123456);
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Turmuric");
		p1.setPrice(300);
		p1.setQuantity(2);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Kurkure");
		p2.setPrice(200);
		p2.setQuantity(10);
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Washing Powder");
		p3.setPrice(500);
		p3.setQuantity(12);
		
		Product p4 = new Product();
		p4.setId(4);
		p4.setName("Orio");
		p4.setPrice(200);
		p4.setQuantity(5);
		
		Product p5 = new Product();
		p5.setId(5);
		p5.setName("Shampoo");
		p5.setPrice(400);
		p5.setQuantity(22);
		
		Shop sh = new Shop();
		sh.storeCustomer(c);
		sh.storeProducts(p1, p2, p3, p4, p5);
		sh.calBill();
	}
}