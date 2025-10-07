package org.Practice;

import java.util.Comparator;

public class Student {
    int id,marks;
    String name;
    public Student(int id, int marks, String name){
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    public int getId(){return id;}
    public int getMarks(){return marks;}
    public String getName(){return name;}
}
class SortById implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.id > s2.id){
            return 1;
        }else if(s1.id < s2.id){
            return -1;
        }else{
            return 0;
        }
    }
}
