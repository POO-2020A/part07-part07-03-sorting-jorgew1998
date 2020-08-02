import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
        
    }
    
   public static int smallest(int[] array) {
     int menor = array [0];
     for(int i = 0; i < array.length; i++) {
       if(array[i] < menor) {
         menor = array[i];
       }
     }
  return menor;
  }

  public static int indexOfSmallest(int[] array) {
    int menor = array [0];
    int index = 0;
    for(int i = 0; i < array.length; i++) {
       if(array[i] < menor) {
         menor = array[i];
         index = i;       }
     }
     return index;
  }

  public static int indexOfSmallestFrom(int[] table, int startIndex) {
    int menor = table[startIndex];
    int index = startIndex;
    for(int i = startIndex; i < table.length; i++) {
       if(table[i] < menor) {
         menor = table[i];
         index = i;       }
     }
     return index;
  }

  public static void swap(int[] array, int index1, int index2){
  
       int aux = array[index1];
       array[index1] = array[index2];
       array[index2] = aux;
      System.out.println(Arrays.toString(array));
     
  }

  public static void sort(int[] array) {
     
       int menor;
       System.out.println(Arrays.toString(array));
       for(int i = 0; i < array.length - 1; i++) {
         menor = indexOfSmallestFrom(array, i);
         swap(array, i, menor);
       }
  }

}
