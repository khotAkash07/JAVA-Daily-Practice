/****************************************************************************************
WAP to create class name as Sort with two functions 
void setValue(int …x): this function can accept infinite value 
void sort(): this function can perform sorting on variable argument array
void display(): this function can display the data of array before sorting and after sorting 
*****************************************************************************************/
import java.util.Scanner;
class Sort{
	int arr[] = new int[10];
	
	void setValue(int ...x){
		for(int i = 0; i < x.length ; i++){
			arr[i] = x[i];
		}
	}
	void sort(){
		for(int i = 0 ; i < arr.length - 1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	void display(){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
	void secLar(){
		for(int i = arr.length - 1 ; i >= 0; i--){
			if(arr[i] == arr[i-1]){
			}
			else{
				System.out.println("2nd largest number from array is = "+arr[i-1]);
				break;
			}
		}
	}
}
public class SortingApp{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		Sort s = new Sort();
		s.setValue(534,56,34,23,657,34,23,657,23,1);
		s.sort();
		s.display();
		s.secLar();
	}
}