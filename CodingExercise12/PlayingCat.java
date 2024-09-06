public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }
}
