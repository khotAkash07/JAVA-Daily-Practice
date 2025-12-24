public class RevStringApp{
	public static void main(String ars[]){
		System.out.println(getString("ABCDEFGHI"));
		
	}
	public static String getString(String str){
		char [] ch = str.toCharArray();
		char [] result = getStringHelper(ch, 0, ch.length-1);
		String rString = new String(result);
		return rString;
	} 
	public static char [] getStringHelper(char[] ch,int left,int right){
		if(left >= right) return ch;
		
		char temp = ch[left];
		ch[left] = ch[right];
		ch[right] = temp;
		
		return getStringHelper(ch, left+1, right-1);
	}
}
