import java.util.*;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = new int[count];
        for (int i = 0; i<count; i++) {
            try {
                array[i] = scanner.nextInt();
            } catch (Exception e) {
                break;
            }
        }
        return array;
    }
    
    private static int findMin(int[] array) {
        int min = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        
        return min;
    }
}
