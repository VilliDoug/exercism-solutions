public enum LogLevel {
    // TODO: define members for each log level
    UNKNOWN("XYZ", 0),
  TRACE("TRC", 1),
  DEBUG("DBG", 2),
  INFO("INF", 4),
  WARNING("WRN", 5),
  ERROR("ERR", 6),
  FATAL("FTL", 42);

  private final String logLevelString;

  private final int logLevelCode;

  LogLevel(String logLevelString, int logLevelCode) {
    this.logLevelString = logLevelString;
    this.logLevelCode = logLevelCode;
  }

  public String getLogLevelString() {
    return this.logLevelString;
  }

  public int getLogLevelCode() {
    return this.logLevelCode;
  }

}
