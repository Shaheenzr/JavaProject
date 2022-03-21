package com.company;

class staticExClass
{
    synchronized static void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.print(n*i);
            System.out.println(" I am " + Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }

    synchronized static void printSquare(int n){
            System.out.print(n*n);
        System.out.println(" I am " + Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }

class MyThread1 extends Thread{
    public void run(){
        staticExClass.printTable(5);
    }
}
class MyThread2 extends Thread{
    public void run(){
        staticExClass.printSquare(10);
    }
}


public class StaticSynchronization {
    public static void main(String t[]){
        MyThread1 t1=new MyThread1();//thread0
        MyThread2 t2=new MyThread2();//thread 1

        MyThread1 t3=new MyThread1();//thread 2
        MyThread2 t4=new MyThread2();//thread 3

        t1.start();
        t2.start();

        t3.start();
        t4.start();
    }
}
