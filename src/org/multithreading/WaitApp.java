package org.multithreading;


public class WaitApp {
    static final Object obj = new Object();
    public static void main(String[] args) {
        Thread t = new Thread(() ->{
            synchronized (obj) {
                System.out.println(Thread.currentThread().getName() + " Lock Acquired...");

                try {
                    System.out.println(Thread.currentThread().getName() + " Calling Wait...");
                    obj.wait();
                    obj.wait(4000);
                    System.out.println(Thread.currentThread().getName() + " Acquired Again...");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() ->{

                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + " Lock Acquired...");

                    try {
                        System.out.println(Thread.currentThread().getName() + " Calling Notify...");
                        obj.notify();
                        System.out.println(Thread.currentThread().getName() + " Release...");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        });

        Thread t3 = new Thread();
            t3.start();


        t.setName("First-Worker-01");
        t2.setName("Second-Worker-02");
        t.start();

        t2.start();



    }
}
