package jobTraining;

import java.util.Scanner;

public class PasswordLoops {

    public static void main(String[] args){
        final String userPassword = "Tom";
        for(int i=0; i<3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Password:");
            String input = sc.nextLine();
            if (userPassword.equals(input)){
                System.out.println("Access Granted");
                break;
            }else{
                System.out.println("Access Denied");
            }
        }
        System.out.println("Access denied, please reset your password");

    }
}

//        final String userPassword= "Hpkcmo@44";
//        Scanner sc=new Scanner(System.in);
//        String password = null;
//        for(int i=0; i<6; i++){
//           do {
//               System.out.print("Please provide Password:");
//               password = sc.nextLine();
////               if ((password.equals(userPassword))) {
////                   System.out.println("Access Granted");
////                   break;
////               }
////               else {
////                   System.out.println("Access Denied");
////                   }
//           }
//           while(!password.equals(userPassword));{
//               sc.close();
//            System.out.println("Access Granted");
//
//        }