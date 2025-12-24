import java.util.Scanner;

class Value{
	int a,l,w;
	
	public void setRadius(int a){
		this.a = a;
	}
	public void setLW(int l, int w){
		this.l = l;
		this.w = w;
	}
}
class Circle extends Value{
	public float getCircleArea(){
		return 3.14f*a*a;
	}
}
class Reactangle extends Value{
	public int getRectArea(){
		return l*w;
	}
}
public class AreaCalculatorApp{
	public static void main(String args[]){
		
		Circle c = new Circle();
		c.setRadius(6);
		System.out.println(c.getCircleArea());
		
		Reactangle rcta = new Reactangle();
		rcta.setLW(4,5);
		System.out.println(rcta.getRectArea());
	}
}