public class SimpleLogger implements Logger {
    private static SimpleLogger uniqueLog = new SimpleLogger();

    private SimpleLogger() {
    };

    public static SimpleLogger getLog() {
        return uniqueLog;
    }

    public void log(LogLevel severity, String message) {
        switch (severity) {
            case DEBUG:
                System.err.println("Log Level: Debug, The message: " + message);
                break;
            case INFO:
                System.err.println("Log Level: Info, The message: " + message);
                break;
        }
    }
}
