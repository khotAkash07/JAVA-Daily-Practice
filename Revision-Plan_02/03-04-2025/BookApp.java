//Q7. WAP to create POJO class name as Book  with field id,name and price and author and input the book details and display it.
import java.util.Scanner;
class BookPojo{
		int id;
		String name;
		String author;
		int price;
		public void setID(int id){
			this.id=id;
		}
		public int getID(){
			return id;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public void setAuthor(String author){
			this.author = author;
		}
		public String getAuthor(){
			return author;
		}
		public void setPrice(int price){
			this.price = price;
		}
		public int getPrice(){
			return price;
		}
	
}
public class BookApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of Book");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Book");
		String name = sc.nextLine();
		System.out.println("Enter author of Book");
		String author = sc.nextLine();
		System.out.println("Enter Price for book");
		int price = sc.nextInt();
		
		BookPojo pp = new BookPojo();
		pp.setID(id);
		pp.setName(name);
		pp.setPrice(price);
		pp.setAuthor(author);
		
		System.out.println("Id = "+pp.getID()+"\nName = "+pp.getName()+"\nAuthor = "+pp.getAuthor()+"\nPrice = "+pp.getPrice());
	}
}
	