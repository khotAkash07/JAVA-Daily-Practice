package org.SeptRevPlan.El;

public class SubString {
    public static void main(String[] args) {
        String str = "Hello World..., From Akash khot";
        boolean flag = false;
        int count = 1;
        for(int i=0; i<str.length();i++){
            if(i != 0 && i != str.length()-1){
                if(str.charAt(i) == ' '){
                    flag = true;
                    count++;
                }
            }
        }
        if(flag){
            System.out.println("Given string have a substring");
        }else{
            System.out.println("Given string doesn't contain substring");
        }

        System.out.println("Given String having "+count+" Words in it.");
    }
}
