package org.java_08;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionInterDemo {
    public static void main(String[] args) {


    //int result = ((Function<Integer, Integer>)((val)->val*val)).apply(10);
        System.out.println(((Function<Integer, Integer>)((val)->val*val)).apply(10));

        //Supplier Demo
//        Supplier<Date> s = new Supplier<Date>() {
//            @Override
//            public Date get() {
//                return new Date();
//            }
//        };
//
//        Date d = s.get();
//        System.out.println(d);
//
        System.out.println(
                ((Supplier<Date>)(Date::new)).get()
        );

    }
}
