public class Swap{
	public static void main(String ar[]){
		
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);;
		System.out.println("Before swapping a and b is = "+ a +" "+ b);
		/************
		int c = a;
			a = b;
			b = c;
			**************/
		int c = a+b;
			a = c - a;
			b = c - b;
			
			System.out.println("After swapping a and b is = "+ a +" " +b);
	}
}
			