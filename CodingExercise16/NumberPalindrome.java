public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int remain = number;
        
        while (remain != 0) {
            int lastDigit = remain % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            remain = remain / 10;
        }
        
        return (reverse == number);
    }
}
