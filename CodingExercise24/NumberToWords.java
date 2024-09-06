public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int count = getDigitCount(number);
            int used = 0;
            int reverse = reverse(number);
            
            while (reverse > 0) {
                switch(reverse%10) {
                    case 0 -> System.out.println("Zero");
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                }
                used++;
                reverse /= 10;
            }
            
            int remain = count - used;
            while (remain > 0) {
                System.out.println("Zero");
                remain--;
            }
        }
    }
    
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse*10 + number%10;
            number /= 10;
        }
        return reverse;
    }
    
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }
}
