//Q6isplay //it.

import java.util.Scanner;
class PlayerPojo{
		int id;
		String name;
		int run;
		public void setID(int id){
			this.id=id;
		}
		public int getID(){
			return id;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public void setRun(int run){
			this.run = run;
		}
		public int getRun(){
			return run;
		}
	
}
public class PlayerApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of player");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of player");
		String name = sc.nextLine();
		System.out.println("Enter Runs of Player");
		int run = sc.nextInt();
		
		PlayerPojo pp = new PlayerPojo();
		pp.setID(id);
		pp.setName(name);
		pp.setRun(run);
		
		System.out.println("Id = "+pp.getID()+"\nName = "+pp.getName()+"\nRuns = "+pp.getRun());
	}
}
		