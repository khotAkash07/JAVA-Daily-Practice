package org.java_08;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemoApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int myNum = sc.nextInt();
        
//
//        System.out.println(((Predicate<Integer>)((val) -> val % 2 == 0)).test(myNum)?"Even":"Odd");


//        List.of(1,2,3,4,5,6,7,8).forEach((val)->{
//            System.out.print(((((Predicate<Integer>)((num) -> num%2==0)).test(val))?val:","));
//        });
//        System.out.println(((Predicate<Integer>)((((Predicate<Integer>)(val)-> val>10).
//                test(myNum)).and((Predicate<Integer>)((val)-> val<20)).test(myNum)).
//                test(myNum))?"Between 10 and 20":"Not between 10 and 20");


       // System.out.println((((Predicate<Integer>)(val) -> val>10).and((Predicate<Integer>)(val) -> val<20)).test(myNum) ? "btn 10 and 20" : "Not btn 10 and 20");

        System.out.println(
                ((Predicate<Integer>)((val)-> (val > 10) && (val < 20))).test(myNum) ? "btn 10 and 20" : "Not btn 10 and 20"
        );
    }
}



















