package org.Practice;
class AppDemo{
    public static int getNum(){
        try{
            return 10;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Akash");;
        }
    }
}

public class ExceptionHandlingReturn {
    public static void main(String[] args) {
        System.out.println(AppDemo.getNum());
    }
}
