import java.util.Scanner;

class Student{
	//Class Student  with field id ,name ,per 
	int id;
	String name;
	int per;
	
	void setId(int i){
		id = i;
	}
	int getId(){
		return id;
	}
	void setName(String n){
		name = n;
	}
	String getName(){
		return name;
	}
	void setPer(int p){
		per = p;
	}
	int getPer(){
		return per;
	}
}
class Bus{
	//Class Bus with field busid, busno,source,destination , student [] 
	//Bus is POjo class with methods 
	int busid;
	String source,busname,destination;
	
	void setBusId(int id){
		busid = id;
	}
	int getBusId(){
		return busid;
	}
	
	void setBusName(String n){
		busname = n;
	}
	String getBusName(){
		return busname;
	}
	
	void setSourse(int id){
		source = s;
	}
	String getBusSource(){
		return source;
	}
	
	void setDestination(int d){
		destination = d;
	}
	String getDestination(){
		return destination;
	}
	
	Student s[];
	void setStudent(Student ...s1){
		s = s1;
	}
	String[] getStudents(){
		for(int i = 0 ; i < s.length ; i++){
			System.out.printf("%-10d %-15s %-15d%n",b[i].getId(),b[i].getName(),b[i].getPer());
			System.out.println("\n--------------------------------------------------------------------------------------------------------------");
		}
	}
}
//void setStudent(Student …s): this method accept infinite student number 
//Student [] getStudents(): this method returns an array of student classes.
class School{
	//Class  School with field name,address, Bus [], This is also POJO class with methods  
	String name;
	String address;
	
	Bus b[];
	Bus b = new Bus();
	void setSchoolName(String s){
		name = s;
	}
	String getSchoolName(){
		return name;
	}
	void setSchoolAddress(String a){
		address = a;
	}
	String getSchoolAddress(){
		return address;
	}
   //void setBuses(Bus …b) : this method can accept infinite number of buses 
   //void showBusWiseStudList(): this method can buswise student data.
   
    void setBuses(Bus ...b1){
	   b = b1;
    }
    void showBusWiseStudList(){
		
		System.out.print(getSchoolName()+"\t"+getSchoolAddress())
		system.out.println();
		for(int i = 0 ; i < b.length ; i++){
			
			System.out.printf("%-10d %-15s %-15d %-15d %-15d%n",s[i].getBusId(),s[i].getBusName(),s[i].getBusSource(),s[i].getDestination());	
			System.out.println("\n--------------------------------------------------------------------------------------------------------------");
			b.getStudents();
		}
    }
}
public class SchoolManageApp{
	public static void main(String args[]){
		School sc = new School();
		
		Bus bs1 = new Bus();
		bs1.setBusId(1);
		bs1.setName("ABCD");
		bs1.setSourse("Warje");
		bs1.setDestination("Kothrud");
		
		Bus bs2 = new Bus();
		bs2.setBusId(2);
		bs2.setName("XYZ");
		bs2.setSourse("Warje");
		bs2.setDestination("Karve");
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Akash");
		s1.setPer(90);
		
		Student s2 = new Student();
		s2.setId(1);
		s2.setName("Akash");
		s2.setPer(90);
		
		Student s3 = new Student();
		s3.setId(1);
		s3.setName("Akash");
		s3.setPer(90);
		
		Student s4 = new Student();
		s4.setId(1);
		s4.setName("Akash");
		s4.setPer(90);
		
		Student s5 = new Student();
		s5.setId(1);
		s5.setName("Akash");
		s5.setPer(90);
	}
}

