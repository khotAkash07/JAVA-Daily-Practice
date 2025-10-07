package org.Practice;
interface abc{
    static void show(int i){
        System.out.println("This is static block...  "+i*i);
    }
}
public class StaticBlockInInterface{
    public static void main(String[] args) {
        abc.show(9);
    }
}
