package org.multithreading;

class Animal implements Runnable{
    int i;
    @Override
    public void run() {
        while(i < 1000){
            System.out.println(Thread.currentThread().getName());
            i++;
        }
    }
}
public class Runnable_01 {
    public static void main(String[] args) throws InterruptedException {
        Animal a = new Animal();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        t1.setName("First-Worker-01");
        t1.start();
        t1.join(); // Stop main thread until t1 complete his work
        t2.setName("Second-Worker-02");
        t2.start();

    }
}
