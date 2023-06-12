public class Main {
    public static void main(String[] args) {


        CricketerInfo P1= new CricketerInfo("Virat Kohli","Right handed batsman", 1000,190292921,2);
        System.out.println("Hello world!");
        System.out.println(P1);

        String bio=P1.buildBio();
        String stats= P1.buildStats();
        System.out.println(bio);
        System.out.println(stats);
    }

}