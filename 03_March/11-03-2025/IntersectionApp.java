import java.util.Scanner;
class Intersection{
	int myArr01[];
	int myArr02[];
	int myArr03[] = new int[5];
	int count = 0;
	void setArray(int a[], int b[]){
		myArr01 = a;
		myArr02 = b;
	}
	
	
	int[] getIntersectionArray(){
		
		for(int i = 0 ; i < myArr01.length ; i++){
			for(int j = 0 ; j < myArr02.length ; j++){
				if(myArr01[i] == myArr02[j]){
					boolean flag = true;
					for(int k = 0 ; k < myArr03.length ; k++){
						if(myArr01[i] == myArr03[k])
							flag = false;
					}
					if(flag){
						myArr03[count] = myArr01[i];
						count++;
					}
				}
			}
		}
		return myArr03;
	}
	
}
public class IntersectionApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int first[] = new int[5];
		int second[] = new int[5];
		int result[];
		System.out.println("Enter first array elements :");
		for(int i = 0 ; i < first.length ; i++){
			first[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements :");
		for(int i = 0 ; i < first.length ; i++){
			second[i] = sc.nextInt();
		}
		
		Intersection i1 = new Intersection();
		i1.setArray(first, second);
		result = i1.getIntersectionArray();
		System.out.println("Intersection array elements is :");
		for(int i = 0 ; i < i1.count ; i++){
			System.out.println(result[i]);
		}
	}
}