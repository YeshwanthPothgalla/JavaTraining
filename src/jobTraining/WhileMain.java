package jobTraining;

import java.util.Scanner;

public class WhileMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no:of times you want to run the loop:");
        int counter = sc.nextInt();
        int i = 0;
         while (i < (counter)){

             System.out.printf("Counter is: %d\n", i);
             i = i + 1;
             System.out.println("Hello");
         }
    }
}
