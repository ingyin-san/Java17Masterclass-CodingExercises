import java.util.*;

public class SortedArray {
    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    
    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        int index = array.length;
        int[] sorted = new int[index];
        for (int i: array) {
            sorted[index-1] = i;
            index--;
        }
        return sorted;
    }
}
    
 
