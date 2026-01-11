package org.java_08;

interface ABC{
    void one();
    void two();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {

        ABC abc = new ABC() {
            @Override
            public void one() {
                System.out.println("This is one method");
            }
            @Override
            public void two() {

                System.out.println("This is two method");
                extraMethod();
            }
            public void extraMethod(){
                System.out.println("This is extra method");
            }
        };
        abc.one();
        abc.two();

    }
}
