import java.util.Scanner;

public class AnagramArray{
	public static void main(String args[]){
		
		char a[] = {'a','b','d','e','c'};
		char b[] = {'a', 'c', 'f', 'b', 'e'};
		
		System.out.println("Given arrays = ");
		for(int i = 0 ; i < a.length ; i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		for(int i = 0 ; i < b.length ; i++){
			System.out.print(b[i]+"\t");
		}
		
		for(int i = 0 ; i < a.length-1 ; i++){
			for(int j = i + 1 ; j < a.length ; j++){
				if(a[i] > a[j]){
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < b.length-1 ; i++){
			for(int j = i + 1 ; j < b.length ; j++){
				if(b[i] > b[j]){
					char temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println("\n----------------------------------------");
		boolean flag = false;
		if(a.length == b.length){
			for(int i = 0 ; i < a.length ; i++){
				if(a[i] != b[i]){
					flag = true;
				}
			}
			if(flag){
				System.out.println("Given array is not an anagram array");
			}else{
				System.out.println("Given array is an anagram array");
			}
		}else{
			System.out.println("Given arrays are not anagram");
		}
		System.out.println("----------------------------------------");
	}
}