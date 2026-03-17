public class LogLine {

  private String logLine;

    public LogLine(String logLine) {
      this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
      String level = logLine.substring(1,4);
      return switch (level) {
        case "TRC" -> LogLevel.TRACE;
        case "DBG" -> LogLevel.DEBUG;
        case "INF" -> LogLevel.INFO;
        case "WRN" -> LogLevel.WARNING;
        case "ERR" -> LogLevel.ERROR;
        case "FTL" -> LogLevel.FATAL;
        default -> LogLevel.UNKNOWN;
      };
    }

    public String getOutputForShortLog() {
      LogLevel level = getLogLevel();
      int code = level.getLogLevelCode();
      String message = logLine.substring(logLine.indexOf("]") + 3);
      return code + ":" + message;
    }
}

