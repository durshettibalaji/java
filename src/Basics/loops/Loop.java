package src.Basics.loops;
public class Loop{
    public static void main(String[] args) {
       WhileLoop w = new WhileLoop();
       WhileLoop.whileloop();
       ForLoop f = new ForLoop();
       f.forloop();
    }

}

 class WhileLoop {
    public static void whileloop() {
        int i=0;
        // While loop will check the condition first if the condition is true then it will enter into the body
        while (i<10) {
            // System.out.println("i am runing for the "+i+" time ");
            i++;
        }

        // need to be carefull code may go to infinte time 
        // while (i<10) {
        //     System.out.println("i am runing for the "+i+" time ");
        // }
        // in the above example the i is not getting changing so condition will not become false so it excute infinte times 

        // if we want skip for particular value we can use continue 
        i=0;
        while (i<10) {
            i++;
            if(i%2 == 0)
            continue;
            System.out.println("i am runing for the "+i+" time ");
        }

        // if we want to come out of the loop we can use break
        i=0;
        while (i<10) {
            i++;
            if(i==7)
            break;;
            System.out.println("i am runing for the "+i+" time ");
        }

    }
}


class ForLoop{
    public  void forloop() {
        // for loop is used when we know the number of times we want to execute the loop
        for (int i = 0; i < 10; i++) {
            System.out.println("i am runing for the "+i+" time ");
        }
    }
}