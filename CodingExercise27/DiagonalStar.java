public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int r = 0; r < number; r++) {
                for (int c = 0; c < number; c++) {
                    if (r == 0 || c == 0 || r == number-1 || c == number-1 || r == c || c == number-(r+1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
