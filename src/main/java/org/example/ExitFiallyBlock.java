package org.example;

public class ExitFiallyBlock {
    public static int ExitDemo(){
        try{
            return 10/0;
        } catch (Exception e) {
            System.exit(0);
            return 30;
        }finally {
            return 40;
        }
    }
    public static void main(String[] args) {
        System.out.println(ExitDemo());
    }
}
