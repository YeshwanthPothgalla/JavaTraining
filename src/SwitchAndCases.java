import java.util.Scanner;

public class SwitchAndCases {
//        public static void main(String[] args) {

            public void numberOptions(){

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the Option: ");
                int option = sc.nextInt();
                sc.close();
                if (option>50){
                    System.out.println("Bhosidike Number jo options hai usme de");
                }else {
                    switch(option){
                        case 1:
                            System.out.println("Paise nai hai jaana");
                            break;
                        case 2:
                            System.out.println("Paise dunga par terko nachana hai");
                            break;
                        case 3:
                            System.out.println("Paise mangthe ho bikaari badocow");
                            break;
                        case 4:
                            System.out.println("Kyu re ssaleem itna phekthe ho tum ");
                            break;
                        case 5:
                            System.out.println("ismail bhai ka behen ko pataye kya?");
                            break;
                        default:
                            System.out.println("Bhag Bosidike");
                            break;
                    }
                }
            }

            public void hoeConvo(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Do you wanna have a good time honey: Say 'Y'/'N': ");
                String response = sc.next();
                    switch(response){
                    case "Y":
                    System.out.println("Allright Honey");
                    break;
                    case "N":
                    System.out.println("You better be Gay");
                    break;
                    default:
                    System.out.println("Nigga watch out");
                    break;
            }
            }


}
