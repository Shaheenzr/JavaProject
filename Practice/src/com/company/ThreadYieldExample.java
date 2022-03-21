package com.company;

class yieldEx extends Thread{
    public void run(){
        System.out.println("The name of the current thread is: "+ Thread.currentThread().getName());
        for (int i= 10 ; i<=14 ; i++){
            System.out.println(i+ " child");
            yield();
        }
    }
}

public class ThreadYieldExample {
    public static void main(String args[]){
        yieldEx th1 = new yieldEx();
        th1.start();

        for (int i= 0 ; i<=4 ; i++){
            System.out.println(i+ " inside main");
        }
    }

}
