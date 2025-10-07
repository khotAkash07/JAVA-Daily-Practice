package org.java_08;

import java.util.*;
import java.util.function.Consumer;

class Employee{
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class ForEachDemo {
    public static void main(String[] args) {
        List.of(new Employee(12,"Akash"),new Employee(13,"Abhi"),new Employee(14,"Shubham"))
        .forEach(employee -> System.out.println(employee.getId()+"  "+employee.getName()));
    }
}