import java.util.Scanner;
class CommonElement{
	int arr01[];
	int arr02[];
	
	public void setArray(int arr01[], int arr02[]){
		this.arr01 = arr01;
		this.arr02 = arr02;
	}
	public void getCommon(){
		for(int i = 0 ; i < arr01.length ; i++){
			boolean flag = false;
			for(int j = 0 ; j < arr02.length ; j++){
				if(arr01[i] == arr02[j]){
					flag = true;
				}
			}
			if(flag){
				System.out.print(arr01[i]+"  ");
			}
		}
	}
}
public class CommonElementApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr01[] = new int[5];
		int arr02[] = new int[7];
		
		System.out.println("Enter First array elements");
		for(int i = 0 ; i < arr01.length ; i++){
			arr01[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements");
		for(int i = 0 ; i < arr02.length ; i++){
			arr02[i] = sc.nextInt();
		}
		CommonElement cm = new CommonElement();
		cm.setArray(arr01, arr02);
		System.out.println("---------------------- Comman elements are --------------------");
		cm.getCommon();
	}
}