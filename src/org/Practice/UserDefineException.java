package org.Practice;

class AgeNotValidException extends Exception{
    public AgeNotValidException(){
        super("You are not eligible for voting");
    }
}

public class UserDefineException {
    public static void main(String[] args) {

        int age = 12;
        try{
            if(age < 18){
                throw new AgeNotValidException();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
