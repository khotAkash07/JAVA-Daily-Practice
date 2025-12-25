package org.String;

public class RemoveAllSpaces {
    public static void main(String[] args) {
        String str = "   Akash Anil Khot  ";

       // String str2 = str.replace(" ", "");

        String str2 = "";
        int len = str.length();
        System.out.println(len);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                System.out.println(len);
                str2 += str.charAt(i);
            }
        }
        System.out.println(str2);

        String rotate = "";
        String rotate2 = "";
        for(int i = 0; i < str2.length(); i++){
            if(i <= 8){
                rotate = rotate+str2.charAt(i);
            }else{
                rotate2 +=  str2.charAt(i);
            }
        }
        System.out.println(rotate2+rotate);
    }
}
