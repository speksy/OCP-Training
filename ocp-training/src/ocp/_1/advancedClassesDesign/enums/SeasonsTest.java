package ocp._1.advancedClassesDesign.enums;

public class SeasonsTest {
    public static void main(String args[]) {
        Season summer = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(summer == Season.SUMMER);

        for (Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season s1 = Season.valueOf("SUMMER"); // SUMMER
//        Season s2 = Season.valueOf("summer"); // Exception - java.lang.IllegalArgumentException: No enum

        // public enum ExtendedSeason extends Season { } // DOES NOT COMPILE

        switch (summer){
            case WINTER:
                System.out.println("Get out the sled!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
//        switch (summer) {
//            case 0: // DOES NOT COMPILE
//                System.out.println("Get out the sled!");
//                break;
//        }
    }
}
