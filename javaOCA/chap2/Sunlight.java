package chap2;

public class Sunlight {
    public static void main(String[] args) {
        // Distance from sun (150 million kilometers)
        long kmFromSun = 150_000_000l;

        long lightSpeed = 299_792_458l; // meters per second

        // Convert distance to meters.
        long mFromSun = kmFromSun * 1000l;

        long seconds = mFromSun / lightSpeed;

        System.out.print("Light will use ");
        printTime(seconds);
        System.out.println(" to travel from the sun to the earth.");
    }

    public static void printTime(long sec) {
        long min = sec / 60;
        sec = sec - (min*60);
        System.out.print(min + " minute(s) and " + sec + " second(s)");
    }
}
