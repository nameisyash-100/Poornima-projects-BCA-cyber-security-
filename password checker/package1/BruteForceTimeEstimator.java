package package1;

public class BruteForceTimeEstimator {

    public long estimateBruteForceTime(int length) {
        int attemptsPerSecond = 1000000000; 

        long possibilities = 1;
        for (int i = 0; i < length; i++) {
            possibilities *= 94;
        }

        return possibilities / attemptsPerSecond;
    }

    public String formatTime(long seconds) {
        int hours = (int) (seconds / 3600);
        int minutes = (int) ((seconds % 3600) / 60);
        seconds = seconds % 60;
        
        if (hours > 720 && hours< 8760){
            float months = hours / 730.0f;
            return String.format("%.2f months", months);
        }

        else if (hours >= 8760){
            float years = hours / 8760.0f;
            return String.format("%.2f years", years);
        }

        else {
        return String.format("%d hours, %d minutes, and %d seconds", hours, minutes, seconds);
        }


    }
}
