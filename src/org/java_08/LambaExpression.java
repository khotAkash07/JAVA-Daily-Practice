package org.java_08;

interface XYZ {
    void show();
}
public class LambaExpression {
    public static void main(String[] args) {

        XYZ xyz = ()->{
            System.out.println("i am from XYZ interface and using lambda expression");
        };
        xyz.show();
    }
}
