package programs;

class Producer extends Thread {
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("I am " + Thread.currentThread().getName() +
                    " : Produced Item " + i);
            //this thread will yield its execution to other threads of same or higher priority.
            Thread.yield();
        }
    }
}

class Consumer extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 3; i++)
        {
            System.out.println("I am " + Thread.currentThread().getName() +
                    " : Consumed Item " + i);
            //this thread will yield its execution to other threads of same or higher priority.
            Thread.yield();
        }
    }
}

class SleepThread extends Thread{
    public void run(){
        for (int i=11;i <=13 ;i++ ) {
            System.out.print("I am " + Thread.currentThread().getName());
            System.out.println(", after printing " + i +
                    " , will sleep for 1.5 seconds.");
            try{
                //the current thread will sleep for 1.5 seconds and after that will resume automatically.
                Thread.sleep(1500);
            }catch(InterruptedException e){}
        }
        System.out.println(" ");
    }
}


public class ThreadJoinSleepYieldgetName {
    public static void main(String args[]) throws Exception {

        SleepThread t = new SleepThread();
        t.setName("Sleep-Thread"); //sets the thread name to Sleep-Thread.
        t.start();
        t.join();//main thread will wait for Sleep-Thread to execute completely.

        Producer prod = new Producer();
        Consumer cons = new Consumer();
        prod.setName("producer-Thread");//sets the thread name to producer-Thread
        cons.setName("consumer-Thread");//sets the thread name to consumer-Thread

        prod.start();
        cons.start();

        for (int i = 21; i <= 23; i++) {
            System.out.println("I am in " + Thread.currentThread().getName() +
                    ", after printing " + i + ", sleeping for 1 second. ");
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
