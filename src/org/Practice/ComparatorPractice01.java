package org.Practice;

import java.util.*;

public class ComparatorPractice01 {
    public static void main(String[] args) {

        List<Student> sl = new ArrayList<>();
        sl.add(new Student(1,30,"Abc"));
        sl.add(new Student(3,150,"bca"));
        sl.add(new Student(2,100,"zpq"));
        sl.add(new Student(6,340,"mbg"));
        sl.add(new Student(8,900,"jik"));
        sl.add(new Student(5,500,"lid"));

        SortById sid = new SortById();

        System.out.println("Before Sorting");

        for(Student st : sl){
            System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks());
        }
        Collections.sort(sl,sid);

        System.out.println("After Sorting...");
        for(Student st : sl){
            System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks());
        }
    }
}
