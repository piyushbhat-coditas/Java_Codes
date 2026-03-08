package Assignment_Week4;

public class LogFormatter_4 {
    public static String formatLog(String user, String status) {

        return """
                Application Log
                User: %s
                Status: %s
                """
                .formatted(user, status);
    }

}
