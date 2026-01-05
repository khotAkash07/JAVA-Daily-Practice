package org.example;

public class StaticInstanceBlock {
    public static void main(String[] args) throws Exception {
        Class.forName("org.example.Abc").newInstance();
    }
}
class Abc{
    {
        System.out.println("This is instance block");
    }
    static {
        System.out.println("This is static block....");
    }

}
