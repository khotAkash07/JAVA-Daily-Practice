package org.SeptRevPlan.El;

public class FirstNonReapeating {
    public static void main(String[] args) {
        String str ="swiss";
        boolean flag = false;
        for(int i = 0; i < str.length(); i++){
          flag = false;
            for(int j = i+1 ; j< str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
