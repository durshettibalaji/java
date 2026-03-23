package src.threads;

public class ThreadAndVariable {
    public static void main(String s[]) throws InterruptedException{
        A obj = new A();
        obj.way3();
    }
}

class Counter {
    int c;
    // public void increment() {   // by this method we may not get crt value 
    // c++;
    // }
    public synchronized void increment() {
        c++;
        }
}


class A {
    Counter count = new Counter();
  void  way3() throws InterruptedException{
        Runnable five = () ->{
            for (int i = 0; i < 15200; i++) {
                count.increment();
            }
        };
    
        Runnable six = () ->{
            for (int i = 0; i < 15200; i++) {
                count.increment();
            }
        };
        Thread t1 = new Thread(five);
        Thread t2 = new Thread(six);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count.c);
       }
}