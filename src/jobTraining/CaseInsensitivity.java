package jobTraining;

import java.util.Scanner;

public class CaseInsensitivity {

    public static void main(String[] args) {
        final String START = "start";
        final String STOP = "stop";
        final String QUIT = "quit";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the Command:");
            String command = sc.nextLine();
            if (!command.isBlank()) {
                if (command.equalsIgnoreCase(START)) {
                    System.out.println("Machine Starting...");
                } else if (command.equalsIgnoreCase(STOP)) {
                    System.out.println("Machine Stopping...");
                } else if (command.equalsIgnoreCase(QUIT)) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid Command");
                }
            }
        }

    }
}
