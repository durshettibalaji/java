
package src.designPatterns.creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        SigletonImp sig = SigletonImp.objcreation();
        sig.print("str 1");
        SigletonImp sig1 = SigletonImp.objcreation();
        sig1.print("str 2");

    }
}

class SigletonImp {
    private static SigletonImp obj;

    // Private constructor prevents external instantiation
    private SigletonImp() {}

    public static synchronized SigletonImp objcreation() {
        if (obj == null) {
            obj = new SigletonImp();
        }
        return obj;
    }


    public void print(String str){
        System.out.println(this+"           "+str);
    }
}
