package com.company;

public class TestSleepMethod1 extends Thread{
    public void run() {
        for (int i = 1; i < 4; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+ " going in sleep mode");
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println(i + ":" + Thread.currentThread().getName() +" coming out of sleep mode ");
            //System.out.println(Thread.currentThread().getName()+ " coming out of sleep mode");
        }
    }
    public static void main(String args[]){
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        t1.start();//Thread-0
        t2.start();//Thread-1
    }
}

