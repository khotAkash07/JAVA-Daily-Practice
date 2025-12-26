package org.multithreading;

class MyThread extends Thread{
    public void run(){
        try {
            while (true) {
                System.out.println("Demon Thread");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
public class DemonThreadApp {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("End Main Thread");
    }
}
