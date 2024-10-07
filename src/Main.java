import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Get all environment variables
        Map<String, String> env = System.getenv();

        // Print each environment variable
        for (Map.Entry<String, String> entry : env.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}