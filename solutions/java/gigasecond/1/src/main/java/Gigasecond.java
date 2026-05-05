import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

  private LocalDateTime time;

    public Gigasecond(LocalDate moment) {
      this.time = moment.atStartOfDay().plusSeconds(1_000_000_000);
    }

    public Gigasecond(LocalDateTime moment) {
      this.time = moment.plusSeconds(1_000_000_000);
    }

    public LocalDateTime getDateTime() {
      return time;
    }
}
