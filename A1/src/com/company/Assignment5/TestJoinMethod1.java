package com.company.Assignment5;

    public class TestJoinMethod1 extends Thread{
        int a,b,c;
        String str;
        char m;
        TestJoinMethod1(int a, int b){
            this.a=a;
            this.b=b;
        }
        TestJoinMethod1(int x, int y,int z ){
            a=x;
            b=y;
            c=z;
        }
        TestJoinMethod1(String str, int y,char z ){
            this.str=str;
            a=y;
            m=z;
        }
        public void run() {
            for (int i = 1; i <= 3; i++) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                //System.out.println(Thread.currentThread().getName());
                System.out.println(i);
            }
        }
        public static void main(String args[]){
            TestJoinMethod1 t1 = new TestJoinMethod1(1,2);
            TestJoinMethod1 t2 = new TestJoinMethod1(2,4,5);
            TestJoinMethod1 t3 = new TestJoinMethod1("sys",1,'a');
            t1.run();
            try {
                t1.join();
            } catch(Exception e){
                System.out.println(e);
            }
            t2.start();
            t3.start();
        }
    }


