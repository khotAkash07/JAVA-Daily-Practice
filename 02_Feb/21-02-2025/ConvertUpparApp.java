public class ConvertUpparApp{
	public static void main(String args[]){
		
		char ch[] = {'a','b','c','d','e'};
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Given Array is ");
		for(int i = 0 ; i < ch.length ; i++){
			System.out.printf(ch[i]+"\t");
		}
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("Upparcase Array is ");
		for(int i = 0 ; i < ch.length ; i++){
			System.out.printf("%c\t",(ch[i]-32));
		}
	}
}