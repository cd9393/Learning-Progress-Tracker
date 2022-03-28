package LearningProgressTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Learning Progress Tracker");

        try(Scanner scanner = new Scanner(System.in)) {
            boolean isRunning = true;

            while(isRunning) {
                String input = scanner.nextLine();
                if (input.replaceAll("\\s","").length() == 0) {
                    System.out.println("No input.");
                }
                else if ("exit".equals(input)) {
                    isRunning = false;
                    System.out.println("Bye!");
                } else {
                    System.out.println("Error: unknown command!");
                }
            }
        }
    }
}
