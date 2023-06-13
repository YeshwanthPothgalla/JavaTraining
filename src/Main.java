public class Main {
    public static void main(String[] args) {

        // For Weather Conditions:

        WeatherConditions w1 = new WeatherConditions();
        w1.convertToCelsius();
        w1.convertToFahrenheit();

        // For Cricketer Info
        CricketerInfo P1= new CricketerInfo("Virat Kohli","Right handed batsman", 1000,190292921,2);
        System.out.println(P1);

        String bio=P1.buildBio();
        String stats= P1.buildStats();
        System.out.println(bio);
        System.out.println(stats);

        //SwitchCases Instance:
        SwitchAndCases s1 = new SwitchAndCases();
        s1.numberOptions();



    }
}