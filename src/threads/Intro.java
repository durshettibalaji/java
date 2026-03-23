package src.threads;

import java.io.IOException;
import java.nio.CharBuffer;

public class Intro {
    public static void main(String[] args) {
        // way1();
        // way2();
        way3();
    }

   static void way2(){
        Runnable obj3 = new Three();
        Runnable obj4 = new Four();
        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();
    }


    static void way1(){
        One obj1 = new One();
        Two obj2 = new Two();
        obj1.setPriority(2);
        obj2.setPriority(Thread.MAX_PRIORITY-1);
        obj1.start();
        obj2.start();
    }

   static void  way3(){
    Runnable five = () ->{
        for (int i = 0; i < 5; i++) {
            System.out.println("five    5");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable six = () ->{
        for (int i = 0; i < 5; i++) {
            System.out.println("six   6");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    Thread t1 = new Thread(five);
    Thread t2 = new Thread(six);
    t1.start();
    t2.start();
   }
}

class One extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("one   1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Two extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("two   2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Three implements Runnable {
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("three 3");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Four implements Runnable{
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Four  4");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}