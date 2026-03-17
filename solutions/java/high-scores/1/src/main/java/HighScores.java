import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class HighScores {

  private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
      this.highScores = highScores;
    }

    List<Integer> scores() {
      return highScores;
    }

    Integer latest() {
      return scores().getLast();
    }

    Integer personalBest() {
      return Collections.max(scores());
    }

    List<Integer> personalTopThree() {
      return scores().stream()
          .sorted(Comparator.reverseOrder())
          .limit(3)
          .toList();
    }

}
