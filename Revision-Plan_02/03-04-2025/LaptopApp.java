//Q8. WAP to create POJO class name as Laptop with field id, name ,price and ram space,hard disk space etc and input the details of laptop and display it

import java.util.Scanner;
class Laptop{	
	int id;
	String name;
	int price;
	int rom;
	int ram;
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
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}	
	public void setRam(int ram){
		this.ram = ram;
	}
	public int getRam(){
		return ram;
	}
	public void setRom(int rom){
		this.rom = rom;
	}
	public int getRom(){
		return rom;
	}
}
public class LaptopApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of Laptop");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of LaptopCompany");
		String name = sc.nextLine();
		System.out.println("Enter Price of Laptop");
		int price = sc.nextInt();
		System.out.println("Enter RAM of Laptop");
		int ram = sc.nextInt();
		System.out.println("Enter ROM of Laptop");
		int rom = sc.nextInt();
		
		Laptop pp = new Laptop();
		pp.setID(id);
		pp.setName(name);
		pp.setPrice(price);
		pp.setRam(ram);
		pp.setRom(rom);
		
		System.out.println("Id = "+pp.getID()+"\nName = "+pp.getName()+"\nRuns = "+pp.getPrice()+"\nRuns = "+pp.getRam()+"\nRuns = "+pp.getRom());
	}
}
		