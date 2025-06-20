class ArrayOfObject{
	
	int id;
	String name;
	int age;
	
	void setStudent(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void getStudent(){
		System.out.println(id+"\t"+name+"\t"+age);
	}
}
public class Main{
	public static void main(String args[]){
		
		ArrayOfObject arr[] = new ArrayOfObject[3];
		
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = new ArrayOfObject();
			if(i == 0)
				arr[i].setStudent(1, "Akash", 23);
			else if(i == 1)
				arr[i].setStudent(2, "Abhishek", 24);
			else
				arr[i].setStudent(3, "Shubham", 26);
		}
		for(int i = 0 ; i < arr.length ; i++){
			arr[i].getStudent();
		}
	}
}