class Sqrt{
	int no;
	
	void setValue(int val1){
		no = val1;
	}
	
	void checkSuare(){
		System.out.println(no*no);
	}
}
public class SquareApp{
	public static void main(String args[]){
		
		
		new Sqrt().setValue(5);
		new Sqrt().checkSuare();
	}
}