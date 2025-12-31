package org.Practice;

class SingletonA {
    private static SingletonA singleton;
    private SingletonA() {}

    public static SingletonA getInstance() {
        if(singleton == null){
            singleton = new SingletonA();
        }
        return singleton;
    }

    int value = 10;
}
public class SingltoneApp {
    public static void main(String[] args) {
        SingletonA a = SingletonA.getInstance();
        System.out.println(a.value);
    }
}