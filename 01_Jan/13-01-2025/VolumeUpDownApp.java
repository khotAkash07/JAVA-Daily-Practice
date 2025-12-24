import java.util.*;

public class VolumeUpDownApp{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter volume which you want to set :");
		int volumeUpdate = sc.nextInt();
		
		
		int volume = 50;
		
		String result = volume > volumeUpdate ? "volume Down by "+(volume - volumeUpdate):"volume up by "+(volumeUpdate-volume);
		
		System.out.println(result);
		
	}
}