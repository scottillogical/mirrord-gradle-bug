/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package test;

import java.util.Map;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        // Get all environment variables
        Map<String, String> env = System.getenv();

        // Print each environment variable
        for (Map.Entry<String, String> entry : env.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(new App().getGreeting());
    }
}
