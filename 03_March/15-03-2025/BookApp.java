import java.util.Scanner;

class Book{
	private int id;
	private String name;
	private String author;
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
	public void setAuthor(String a){
		author = a;
	}
	public String getAuthor(){
		return author;
	}
	public void setPrice(int p){
		price = p;
	}
	public int getPrice(){
		return price;
	}
}
public class BookApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Book b[] = new Book[5];
		
		for(int i = 0 ; i < b.length ; i++){
			b[i] = new Book();
			
			System.out.println("\n----------------------------------------------------------------------------------------");
			System.out.println("Enter book`s id, name, author, price :");
			System.out.println("----------------------------------------------------------------------------------------");
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String author = sc.nextLine();
			int price = sc.nextInt();
			
			b[i].setId(id);
			b[i].setName(name);
			b[i].setAuthor(author);
			b[i].setPrice(price);
		}
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Given data is = ");
		System.out.println("----------------------------------------------------------------------------------------");
		for(int i = 0 ; i < b.length ; i++){
			System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\t"+b[i].getPrice());
			System.out.println("\n----------------------------------------------------------------------------------------");	
		}
		for(int i = 0 ; i < b.length - 1 ; i++){
			boolean flag = false;
			for(int j = i+1 ; j < b.length ; j++){
				if(b[i].getPrice() > b[j].getPrice()){
					Book temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Price wise data is = ");
		System.out.println("----------------------------------------------------------------------------------------");
		for(int i = 0 ; i < b.length ; i++){
			System.out.println(b[i].getId()+"\t"+b[i].getName()+"\t"+b[i].getAuthor()+"\t"+b[i].getPrice());
			System.out.println("\n----------------------------------------------------------------------------------------");	
		}
	}
}
			