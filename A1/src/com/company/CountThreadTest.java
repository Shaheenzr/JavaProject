package com.company;

public class CountThreadTest extends Thread{
    int from, to;

    public CountThreadTest(int from, int to){
        this.from = from;
        this.to = to;
    }

    public void run(){
        //for( int j =1;j<4;j++) {
            System.out.println("A new thread has Started\n");

            for (int i = from; i < to; i++) {
                System.out.println("i == " + i);

            }

        //}
    }

    public static void main(String args[]){
        for(int i =0;i<3;i++){
            CountThreadTest  t  =  new  CountThreadTest(i*10,  (i+1)*10);
            t.start();

        }
    }
}
