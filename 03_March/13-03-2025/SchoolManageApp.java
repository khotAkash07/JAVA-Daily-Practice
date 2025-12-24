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
	//void setStudent(Student …s): this method accept infinite student number 
	//Student [] getStudents(): this method returns an array of student classes.
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
	
	void setSourse(String s){
		source = s;
	}
	String getBusSource(){
		return source;
	}
	
	void setDestination(String d){
		destination = d;
	}
	String getDestination(){
		return destination;
	}
	
	Student stud[];
	void setStudent(Student ...s1){
		stud = s1;
	}
	Student[] getStudents(){
		return stud;
	}
}
class School{
	//Class  School with field name,address, Bus [], This is also POJO class with methods  
	//void setBuses(Bus …b) : this method can accept infinite number of buses 
   //void showBusWiseStudList(): this method can buswise student data.
	String name;
	String address;
	
	
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
   
	Bus b[];
	Bus b1[];
    void setBuses(Bus ...b1){
	   b = b1;
    }
    void showBusWiseStudList(){
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("School name : "+getSchoolName()+"\tAddress : "+getSchoolAddress());
		for(int i = 0 ; i < b.length ; i++){
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("BusID\t"+"BusName\t"+"Source\t"+"Destination\t\n");
			System.out.println(b[i].getBusId()+"\t"+b[i].getBusName()+"\t"+b[i].getBusSource()+"\t"+b[i].getDestination());
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Stud_ID\t\t"+"Stud_Name\t"+"Percentage\t\n");
			for(int j = 0 ; j < b[i].getStudents().length ; j++){
				System.out.printf("%-20d %-15s %-10d%n",b[i].getStudents()[j].getId(),b[i].getStudents()[j].getName(),b[i].getStudents()[j].getPer());
			}
		}
	}
}
public class SchoolManageApp{
	public static void main(String args[]){
		
		
		Bus bs1 = new Bus();
		bs1.setBusId(1);
		bs1.setBusName("ABCD");
		bs1.setSourse("Warje");
		bs1.setDestination("Kothrud");
		
		Bus bs2 = new Bus();
		bs2.setBusId(2);
		bs2.setBusName("XYZ");
		bs2.setSourse("Warje");
		bs2.setDestination("Karve");
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Akash");
		s1.setPer(90);
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Abhi");
		s2.setPer(90);
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Shubham");
		s3.setPer(90);
		
		Student s4 = new Student();
		s4.setId(4);
		s4.setName("Nilesh");
		s4.setPer(90);
		
		Student s5 = new Student();
		s5.setId(5);
		s5.setName("Digvijay");
		s5.setPer(90);
		
		bs1.setStudent(s1, s2);
		bs2.setStudent(s3, s4, s5);
		School sch = new School();
		sch.setBuses(bs1, bs2);
		sch.setSchoolName("Giri`s TechHub");
		sch.setSchoolAddress("Warje");
		sch.showBusWiseStudList();
	}
}

