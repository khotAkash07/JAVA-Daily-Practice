package org.java_08;

import java.util.Date;
import java.util.function.Supplier;

class A{
    public void show(){
        System.out.println("Heyyy Bhai ks kay br hy nhav");
    }
}
public class SupplierDemo {
    public static void main(String[] args) {

        Date d = ((Supplier<Date>)(Date::new)).get();
        System.out.println(d);

        A a = ((Supplier<A>)(A::new)).get();
        a.show();
    }
}
