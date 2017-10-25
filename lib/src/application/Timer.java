package application;

public class Timer implements Printable{
    private static Timer timer;
    private static long currentTime;

    static {
        timer = new Timer();
        currentTime = System.currentTimeMillis();
    }

    public static Timer getInstance() {
        return timer;
    }

    private Timer() {
    }

    public long getCurrentTime() {
        print("Is getting current time.");
        return getCurrentTime();
    }


}
