public class TimeCal {
    public static void main(String[] args) {
        System.out.println("Time in seconds: " + calculateTime(1, 0, 0));
    }

    public static int calculateTime(int hours, int minutes, int seconds) {
        return hours * 3600 + minutes * 60 + seconds;
    }
}
