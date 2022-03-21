package com.company;


class Manager extends Thread{

    public synchronized static void addition(int a, int b){
        for (int i=0;i<=2;i++){
            System.out.println("I am " + Thread.currentThread().getName()+ " printing "+ i);
        }
        System.out.println("The addition of the numbers is "+(a + b)) ;

    }

    public synchronized static void subtraction(int a, int b){
        System.out.println("I am " + Thread.currentThread().getName());
        System.out.println("The subtraction of the numbers is "+ (a - b));
    }

    public static void multiplication(int a, int b){
        System.out.println("I am " + Thread.currentThread().getName());
        System.out.println("The multiplication of the numbers is "+ (a * b ));
    }

    public synchronized void division( int a, int b){
        System.out.println("I am " + Thread.currentThread().getName());
        System.out.println("The division of the numbers is "+ (a / b ));
    }

    public void showName( String abc){
        System.out.println("I am " + Thread.currentThread().getName());
        System.out.println("I am a beautiful string");
    }

    public void run(){
        addition(6,3);
        subtraction(6,3);
        //multiplication(6,3);
    }

}

class Add1 extends Thread{
    public void run(){
       Manager.addition(6,3);
    }

}

class sub2 extends Thread{
    public void run(){
       Manager.subtraction(6,3);
    }
}

class mul3 extends Thread{
    public void run(){
        Manager.multiplication(6,3);
    }
}

class div4 extends Thread{

    public void run(){

    }
}

class str5 extends Thread{

    public void run(){

    }
}

public class NazarShaheenA6 {
    public static void main(String args[]) throws Exception{
        //int result;
        Manager t1 = new Manager();
        for (int i =1;i<4;i++){
            new Manager().start();
        }
        //t1.setName("Thread-1");
       // t1.start();
        //t1.join();

        //Manager t7 = new Manager();
        //t7.setName("Thread-7");
        //t7.start();

        //Manager t8 = new Manager();
        //t8.setName("Thread-8");
        //t8.start();

        /*Manager t2 = new Manager();
        t2.setName("Thread-2");
        t2.start();

        Manager t3 = new Manager();
        t3.setName("Thread-3");
        t3.start();

        Manager t4 = new Manager();
        t4.setName("Thread-4");
        t4.start();

        Manager t5 = new Manager();
        t5.setName("Thread-5");
        t5.start();

        Manager t6 = new Manager();
        t6.setName("thread-6");
        t6.start();*/



        /*t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();*/
    }
}
