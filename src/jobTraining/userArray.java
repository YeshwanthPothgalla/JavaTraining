package jobTraining;

import java.util.Scanner;

public class userArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[3];

        for(int i =0 ; i< inputArray.length; i++){
            System.out.print("Enter the Number:");
            inputArray[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("you have entered:");
        int total =0;
        for (int num : inputArray){
            System.out.println(num);
            total = total + num;
        }
        System.out.println("Total:" + total);

        int[] values =new int[4];;

        for(int n: values){
            values[n] = sc.nextInt();
            System.out.println(values[n]);
        }

    }
}
