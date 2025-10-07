package org.SeptRevPlan.El;

public class ConvertUL {
    public static void main(String[] args) {
        String str = "programming";
        String resultUpp = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ch = (char)(ch-32);
            }
            resultUpp += ch;
        }
        System.out.println(resultUpp);

        String upper = "PROGRAMMING";

        String resultLow = "";
        for(int i = 0; i < upper.length(); i++){
            char ch = upper.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch+32);
            }
            resultLow += ch;
        }
        System.out.println(resultLow);
    }
}
