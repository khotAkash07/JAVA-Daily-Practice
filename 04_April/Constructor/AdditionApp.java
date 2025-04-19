//This is first constructor program

class Add{
	
	static int a;
	char b;
	Add(int a, float b){
		this.a = a;
		this.b = (char) b;
	}
	public void getAddition(){
		System.out.println(a+b);
	}
}
public class AdditionApp{
	public static void main(String args[]){
		
		Add a = new Add(10,1.5f);
		a.getAddition();
	}
}