public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || second < 10 || first > 99 || second > 99) {
            return false;
        }
        
        return (first%10 == second%10 || first%10 == second/10 || first/10 == second%10 || first/10 == second/10);
    }
}
