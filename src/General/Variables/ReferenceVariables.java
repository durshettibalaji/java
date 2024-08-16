package General.Variables;

import java.awt.Point;
import java.util.Date;

public class ReferenceVariables {
    public static void main(String[] args) {
       Date date = new Date(); 
       Point point1 = new Point(1, 1);
       Point point2 =point1;            // here both point1 and point2 both are refered to the single memory address
       System.out.println("before :"+point2);
       point1.x = 3;
       System.out.println("after  :"+point2);
       System.out.println(date);
    }
}
