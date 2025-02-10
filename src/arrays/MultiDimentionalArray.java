package src.arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        NormalTwoDimensionalArray normal = new NormalTwoDimensionalArray();
        normal.PrintArray();
        JaggedArray obj = new JaggedArray();
        obj.printArray();
    }
}


class NormalTwoDimensionalArray {
    void PrintArray(){
    int[][] array = new  int[5][6];
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[0].length;j++){
            int random = (int)(Math.random()*100);  // to get random number
            array[i][j] = random;
        }
    }
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[0].length;j++){
            System.out.print("  "+array[i][j]);
        }
        System.out.println();
    }


    System.out.println();
    System.out.println();
    for(int n[] :array){
        for( int i : n){
            System.out.print("  "+i);
        }
        System.out.println();
    }
}
}
class JaggedArray {
   void printArray(){
    int[][] array = new int[3][];
    array[0] = new int[3];
    array[1] = new int[4];
    array[2] = new int[2];

    for(int i =0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            int random = (int)(Math.random()*100);
            array[i][j]= random;
    }
   }

   System.out.println("\n    *****jagged Array*****    \n");
   for(int n[] :array){
    for( int i : n){
        System.out.print("  "+i);
    }
    System.out.println();
}
}
}
  