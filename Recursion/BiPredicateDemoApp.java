//BiPredicate
import java.util.function.*;
public class BiPredicateDemoApp{
	public static void main(String args[]){
		
		//boolean result = ((BiPredicate<Integer, Integer>)((a,b)->a==b)).test(10,10);
		//System.out.println(result?"Both are equal":"both are different");
		
		((BiConsumer<Integer, Integer>)((a,b)->System.out.println(a+b))).accept(10,30);
		
		int result = ((BiFunction<Integer,Integer,Integer>)((a,b)-> a+b)).apply(1,3);
		System.out.println("By using Function Interface : \n"+result);
		
		System.out.println("Factorial of given number is : \n"+getFact(result));
	}
	
	public static int getFact(int a){
		if(a == 0) return 1;
		return a * getFact(a-1);
	}
}
