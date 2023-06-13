import java.util.Scanner;
import java.util.Objects;

public class WeatherConditions {


    public void convertToCelsius(){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temp in fahrenheit:");
        double fahrenheit = sc.nextFloat();
        double celsius = (fahrenheit - 32) * (5.0/9.0);
        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius.\n", fahrenheit, celsius);
        if(celsius <36.7){
            System.out.println("Weather conditions are good for the match");
        }
        else{
            System.out.println("Weather conditions is too hot and the game is postponed");
        }

    }
    public void convertToFahrenheit(){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temp in Celsius:");
        double celsius = sc.nextFloat();
        double fahrenheit = (celsius * 9.0/5.0) +32;
        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius.\n", fahrenheit, celsius);
        if(celsius <36.7){
            System.out.println("Weather conditions are good for the match");
        }
        else{
            System.out.println("Weather conditions is too hot and the game is postponed");
        }

    }
}


