package src.arrays;

class ArrayIntro {
public static void main(String[] args) {
    // array instalation 
    int arr[] = new int[5];
    // array declaration
    for(int i=0;i<arr.length;i++){
        arr[i]=i;
    }
    for(int i=0;i<arr.length;i++){
       System.out.print("  "+arr[i]);
    }
    System.out.println();
    // array declaration and instalaion 
    int arr1[]={1,2,3,4,5};
    for(int i=0;i<arr.length;i++){
        System.out.print("  "+arr1[i]);
     }
     System.out.println();
System.out.println("         different for looop  ");
    for(int n : arr1){
        System.out.print("  "+n);
    }
}
    
}