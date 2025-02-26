package src.OOPs;

public class EncapsulationInJava {
   public static void main(String[] args) {
    Employe e1 = new Employe();
    e1.setName("employee 1");
    e1.setId(185);
    System.out.println(e1.getName()+"        "+e1.getId());
   } 
}

class Employe {
    private int id;
    private String name ;
    private int salary= 75000;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

   

}
