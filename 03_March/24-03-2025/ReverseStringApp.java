import java.util.Scanner;

class Reverse{
	
	String st;
	
	void setArr(String ch){
		st = ch;
		
	}
	char[] getString(){
		char strArr[] = new char[st.length()];
		for(int i = 0 ; i < strArr.length ; i++){
			strArr[i] = st.charAt(i);
		}
		int i = 0;
		int j = (st.length()-1);
		while(i < j){
			char temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
			i++;
			j--;
		}
		return strArr;
	}
}

public class ReverseStringApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int c = 0;
		int i = 0;
		
		
		
		System.out.println();
		Reverse r = new Reverse();
		r.setArr(str);
		char [] result = r.getString();
		
		for(int k = 0 ; k < result.length ; k++){
			System.out.print(result[k]);
		}
	}
}