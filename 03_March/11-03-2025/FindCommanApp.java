//You have to create class names s FindCommonElements with following methods 
//void setArray(int a[],int b[]); this function can accept two array as parameter 
//Int [] getCommonElements(): you have to create a new third array and find the common element and return it.

import java.util.*;
class FindCommon{
	char myArr01[];
	char myArr02[];
	char myArr03[] = new char[100];
	 int count = 0;
	void setArray(char a[], char b[]){
		myArr01 = a;
		myArr02 = b;
	}
	
	char[] getCommonElements(){
		
		for(int i = 0 ; i < myArr01.length ; i++){
			for(int j = 0 ; j < myArr02.length ; j++){
				if(myArr01[i] == myArr02[j]){
					myArr03[count] = myArr01[i];
					count++;
				}
			}
		}
		return myArr03;
	}
}
public class FindCommanApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char finalArray[];
		char first[] = new char[6];
		char second[] = new char[6];
		System.out.println("Enter first array elements");
		for(int i = 0 ; i < first.length ; i++){
			first[i] = sc.next().charAt(0);
		}
		System.out.println("Enter second array elements");
		for(int i = 0 ; i < second.length ; i++){
			second[i] = sc.next().charAt(0);
		}
		FindCommon fc = new FindCommon();
		fc.setArray(first,second);
		finalArray = fc.getCommonElements();
			System.out.println("-----------------------------------------");
		for(int i = 0 ; i < fc.count ; i++){
			System.out.print(finalArray[i]+"\t");
		}
	}
}
	