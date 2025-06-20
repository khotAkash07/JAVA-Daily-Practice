class A{
	void show(){
		System.out.println("Hiii i am from A class");
	}
}
class B extends A{
	void show(){
		super.show();
		System.out.println("Hiii i am from B class");
	}
}
public class Main{
	public static void main(String args[]){
		
		B b = new B();
		b.show();
	}
}