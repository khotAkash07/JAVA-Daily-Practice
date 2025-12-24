package org.Practice;


class Abc{
    static int a = 10;
    int b = 20;

    public void show(){
        int c = 90; // can not declare local variable as static
    }
}
public class StaticVariable {

    public static void main(String[] args) {
        Abc abc = new Abc();
        System.out.println(abc.b+" "+abc.a);
        System.out.println(Abc.a);
    }
}
