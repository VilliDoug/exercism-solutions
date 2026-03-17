import java.util.Collections;
import java.util.stream.Collectors;

public class LogLevels {


    public static String message(String logLine) {
        int messageIndex = logLine.indexOf(":") + 2;
        String logMessage = logLine.substring(messageIndex);
        return logMessage.trim();
    }

    public static String logLevel(String logLine) {
      int endLevelIndex = logLine.indexOf("]");
      String cleanLevel = logLine.substring(1, endLevelIndex);
      return cleanLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
      String logMessage = message(logLine);
      String cleanLevel = logLevel(logLine);
      return (logMessage.trim() + " (" + cleanLevel.trim() + ")");
    }


}
