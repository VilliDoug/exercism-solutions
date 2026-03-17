import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
      this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
      return birdsPerDay;
    }

    public int getToday() {
        int todayCount = birdsPerDay[birdsPerDay.length - 1];
        return todayCount;
    }

    public void incrementTodaysCount() {
      int increment = birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
      for (int i : birdsPerDay) {
        return (i == 0);
      }
      return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
      int[] firstDays = Arrays.stream(birdsPerDay)
          .limit(numberOfDays)
          .toArray();
//      cool stuff this
      return IntStream.of(firstDays).sum();
    }

    public int getBusyDays() {
//      the cheeky converter here...hahaha
      return (int) Arrays.stream(birdsPerDay).filter(i -> i >= 5).count();
    }
}
