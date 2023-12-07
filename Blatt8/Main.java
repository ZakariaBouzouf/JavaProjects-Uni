public class Main {
    public static void main(String[] args) {
        LogLevel logLevel = LogLevel.DEBUG;
        SimpleLogger.getLog().log(logLevel,"Test");
    }
}
