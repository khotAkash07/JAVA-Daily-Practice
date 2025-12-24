@FunctionalInterface
interface FindMax<A,B,C,R>{
	R findMax(A a, B b, C c);
}
public class FindMaxApp{
	public static void main(String args[]){
		int result = ((FindMax<Integer, Integer, Integer, Integer>)((a,b,c)->{ 
		return (a > b && a > c)? a:(b > c)? b: c;
		})).findMax(17,19,9);
		
		System.out.println("The max value is = "+result);
	}
}