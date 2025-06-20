import java.util.Scanner;

class Player{
	private int id,runs;
	private String name;
	
	public void setId(int i){
		id = i;
	}
	public int getId(){
		return id;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setRuns(int r){
		runs = r;
	}
	public int getRuns(){
		return runs;
	}
}
public class SameRunApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Player p[] = new Player[6];
		
		for(int i = 0 ; i < p.length ; i++){
			
			p[i] = new Player();
			System.out.println("\nEnter player`s Id, NAME, RUNS :");
			
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int runs = sc.nextInt();
			System.out.println("-----------------------------------------------------------------------------------------");
			p[i].setId(id);
			p[i].setName(name);
			p[i].setRuns(runs);
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Player Data = ");
		
		for(int i = 0 ; i < p.length ; i++){
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRuns());
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		
		for(int i = 0 ; i < p.length-1; i++){
			for(int j = i+1 ; j < p.length ; j++){
				if(p[i].getRuns() < p[j].getRuns()){
					Player temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}	
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Same Player Data = ");
		System.out.println("-----------------------------------------------------------------------------------------");
		int count = 0;
		for(int i = 0 ; i < p.length-1; i++){
			for(int j = i+1 ; j < p.length ; j++){
				if(p[i].getRuns() == p[j].getRuns()){
					if(j == (i+1)){
						System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRuns());
					}
					System.out.println(p[j].getId()+"\t"+p[j].getName()+"\t"+p[j].getRuns());
					count++;
				}
				i +=count;
			}
		}
	}
}