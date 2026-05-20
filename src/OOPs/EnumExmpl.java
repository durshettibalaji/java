package src.OOPs;

enum Activity {
    Running, Swimming, Cycling
}

enum KeyValue {
    Running("15 min"), Swimming("30 min"), Cycling("45 min");
    private String time;
    KeyValue(String time ){
        this.time = time;
    }
    void displayTime() {
        System.out.println("Time for " + this.name() + " is " + this.time);
    }
    int getTimeInMinutes() {
        return Integer.parseInt(this.time.split(" ")[0]);
}
}

public class EnumExmpl {
    public static void main(String[] args) {
        ExamplePrint obj = new ExamplePrint();
        obj.SimpleEnum();
        obj.EnumWithKeyValue();
    }
}


class ExamplePrint {
    void SimpleEnum(){
        Activity  activity = Activity.Swimming;
        // System.out.println(activity+ "  :  "+activity.ordinal());
        // System.out.println(activity.ordinal());     // ordinal() method returns the position of the enum constant in the enum declaration, starting from 0
        // System.out.println(activity.name());
        for(Activity ac : Activity.values()){
            System.out.println(ac + " : " + ac.ordinal());
        }        // name() method returns the name of the enum constant
    }

    void EnumWithKeyValue(){
        KeyValue keyValue = KeyValue.Cycling;
        keyValue.displayTime();                    // we can access the time variable of the enum constant using the method defined in the enum class
        // System.out.println(keyValue + " time is " + keyValue.time);     // we can access the time variable of the enum constant
        // System.out.println(keyValue.time);          // we can access the time variable of the enum constant
        for(KeyValue kv : KeyValue.values()) {          // values() method returns an array of all the enum constants in the enum declaration
            System.out.println(kv + " time is " + kv.getTimeInMinutes() + " minutes");     // we can access the time variable of the enum constant using the method defined in the enum class
        }
    }

}