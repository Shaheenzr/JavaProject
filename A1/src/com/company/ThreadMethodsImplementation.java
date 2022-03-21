package com.company;

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 2; ++i) {
            System.out.println("Thread going to yield:" + Thread.currentThread().getName());
            Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a main thread
            System.out.println("Thread working right now: " + Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 4; i++){
            System.out.println(i);
            try{
                sleep(1000);            //this thread sleeps for 1 second
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMethodsImplementation {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.setName("Thread 1");
        t1.start();
        for (int i = 0; i < 5; ++i) {
            System.out.println("Thread started:" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());

        Thread2 t2 = new Thread2();
        Thread2 t3 = new Thread2();
        Thread2 t4 = new Thread2();
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        t4.setName("Thread 4");

        t2.start();
        try{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
        }
        catch(Exception ex){
            System.out.println("Exception has been caught" + ex);
        }

        t3.start();
        try{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t3.join();
        }
        catch(Exception ex){
            System.out.println("Exception has been caught" + ex);
        }

        t4.start();

    }
}
