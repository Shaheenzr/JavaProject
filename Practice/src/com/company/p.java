package com.company;

public class p {
    static int pressureGauge = 0;
    static final int safetyLimit = 20;

    public static void main(String[] args) {
        pressure[] p1 = new pressure[10];
        for (int i = 0; i < 10; i++) {
            p1[i] = new pressure();
            p1[i].start();
            try {
                p1[i].join();
            } catch (Exception e) {
            }
        }

        System.out.println("gauge reads " + pressureGauge + ", safe limit is 20");
    }
}
class pressure extends Thread {
    // void RaisePressure() {  // Thread problem
    static synchronized void RaisePressure() {
        if (p.pressureGauge < p.safetyLimit-15) {
// wait briefly to simulate some calculations
            try{sleep(100);
            } catch (Exception e){}
            p.pressureGauge += 15;
        }  else ; // pressure too high -- don't add to it.
    }
    public void run() {
        RaisePressure();
    }
}

