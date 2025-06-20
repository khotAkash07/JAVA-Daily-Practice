import java.util.Scanner;

class Product{
	//Product with field id,name and price and it is POJO class
		int id;
		String name;
		int price;
}
class Customer{
	//Customer with field id, name address,email , contact and it is POJO class
	int id;
	String name;
	String address;
	String email;
	int contact;
}
class Shop{
	//Shop with following methods 
	void storeProducts(Customer c,Product …p){
		//: this method can accept infinite product list
	}
	void calBill(){
		//: this method can calculate bill with grand total and your output should be 
	}
}