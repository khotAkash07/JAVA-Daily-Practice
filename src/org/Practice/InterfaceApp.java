package org.Practice;

interface Abcd{
    String getName();
}
class NameShow implements Abcd{

    public int getAge(){
        return 24;
    }

    @Override
    public String getName() {
        return "";
    }


    //public abstract String getName();
}
class NameShow2 extends NameShow{

}
public class InterfaceApp {
    public static void main(String[] args) {

        NameShow show = new NameShow();

    }
}
