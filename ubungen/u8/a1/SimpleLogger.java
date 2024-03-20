public class SimpleLogger implements Logger {
  private static SimpleLogger instance;

  private SimpleLogger() {
  };

  public static SimpleLogger getLog() {
    if (instance == null)
      instance = new SimpleLogger();
    return instance;
  }

  public void log(LogLevel severity, String message) {
    switch (severity) {
      case DEBUG:
        System.err.println(message);
        break;
      case INFO:
        System.err.println(message);
        break;
      default:
        break;
    }
  }

}
