import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        long avg = 0;
        int count = 0;
        
        while (true) {
            try {
                String next = scanner.nextLine();
                int num = Integer.parseInt(next);
                sum += num;
                count++;
                avg = Math.round((double) sum/count);
            } catch (NumberFormatException e) {
                break;
            }
        }
        
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}
