public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        
        int last = number % 10;
        int first = number;
        while (first >= 10) {
            first /= 10;
        }
        
        return (first + last);
    }
}
