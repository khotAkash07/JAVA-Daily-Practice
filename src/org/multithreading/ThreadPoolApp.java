package org.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try{
            System.out.println(name+" is running");
            Thread.sleep(3000);
            System.out.println(name+" is complete");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadPoolApp {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for(int i=0;i<5;i++){
            Runnable task = new Task("Task "+i);
            pool.execute(task);
        }

        pool.shutdown();

        while(!pool.isTerminated()){}

        System.out.println("Everything is finish running");
    }
}



add















