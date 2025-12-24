package org.Practice;

interface A{
   public void a();
}
interface B extends A{
    void b();
}
interface C extends A{
    void c();
}
class D implements B, C{

    @Override
    public void b() {
        System.out.println("i am from B");
    }

    @Override
    public void c() {
        System.out.println("i am from C");
    }

    @Override
    public void a() {
        System.out.println("i am from A");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        D d = new D();
        d.a();
        d.b();
        d.c();
    }
}
