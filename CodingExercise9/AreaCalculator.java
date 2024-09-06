public class AreaCalculator {
    public static double area (double radius) {
        if (radius < 0) {
            return -1.0d;
        } 
        return Math.PI * Math.pow(radius, 2.0d);
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
