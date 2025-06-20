import java.util.Scanner;
class Person{
	int id,age;
	String name,add;
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setAddress(String add){
		this.add = add;
	}
	public String getAddress(){
		return add;
	}
}
public class PersonApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of person");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of person");
		String name = sc.nextLine();
		System.out.println("Enter age of person");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address of person");
		String add = sc.nextLine();
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		p.setAddress(add);
		System.out.println("id = "+p.getId()+"\nName = "+p.getName()+"\nAge = "+p.getAge()+"\nAddress = "+p.getAddress());
	}
}