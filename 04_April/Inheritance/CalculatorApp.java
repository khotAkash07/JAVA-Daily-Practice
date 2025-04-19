import java.util.Scanner;
class Value{
	int a,b;
	public void setValue(int a,int b){
		this.a = a;
		this.b = b;
	}
}
class Add extends Value{
	
	public void getAdd(){
		System.out.println(a+b);
	}
}
class Sub extends Value{
	public void getSub(){
		System.out.println(a-b);
	}
}
class Div extends Value{
	
	public void getDiv(){
		System.out.println(b/a);
	}
}
class Mult extends Value{
	public void getMult(){
		System.out.println(a*b);
	}
}
public class CalculatorApp{
	public static void main(String args[]){
		
		Add a = new Add();
		a.setValue(10,20);
		a.getAdd();
		
		Sub s = new Sub();
		s.setValue(30,20);
		s.getSub();
		
		Div d = new Div();
		d.setValue(10,20);
		d.getDiv();
		
		Mult m = new Mult();
		m.setValue(30,20);
		m.getMult();
	}
}