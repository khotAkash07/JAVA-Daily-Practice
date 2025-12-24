import java.util.Scanner;

class StudentPercent{
	int marks[],total = 0;
	int size;
	float percentage;
	void getMarks(int arr[],int s){
		marks = arr;
		size = s;
	}

	void studPercentage(){
		
		for(int i = 0 ; i < marks.length ; i++){
			total += marks[i];
		}
		 percentage = total/size;
		System.out.println("-------------------------------------------------------------");
		System.out.println("The percentage of all subject = "+percentage);
	}
	
	void studGrade(){
		System.out.println("-------------------------------------------------------------");
		if(percentage >= 90)
			System.out.println("Grade A");
		else if(percentage >= 80)
			System.out.println("Grade B");
		else if(percentage >= 70)
			System.out.println("Grade C");
		else if(percentage >= 60)
			System.out.println("Grade D");
		else if(percentage >= 50)
			System.out.println("Grade E");
		else if(percentage >= 40)
			System.out.println("Grade F");
		else
			System.out.println("Student is Fail.");
	}
}
public class StudentPerApp{
	public static void main(String args[]){ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how much subject ");
		int size = sc.nextInt();
		
		System.out.println("Enter "+size+" Subject marks");
		int arr[] = new int[size];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		StudentPercent sp = new StudentPercent();
		sp.getMarks(arr,size);
		sp.studPercentage();
		sp.studGrade();
	}
}