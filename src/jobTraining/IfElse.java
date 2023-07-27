package jobTraining;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the temperature in Fahrenheit:");
        double F = sc.nextFloat();
        double C = (F-32)*(5.0/9.0);
        System.out.printf("Temperature in Celsius is:%.2f ", C);

        if(C<21){
            System.out.println("The Temperature is cold");
        }else if (C<12){
            System.out.println("The Temperature is Freezing");
        } else if (C> 21 && C<33){
            System.out.println("The Temperature is Normal");
        }else {
            System.out.println("Jal Jayega thu\n");
        }

    }
}
