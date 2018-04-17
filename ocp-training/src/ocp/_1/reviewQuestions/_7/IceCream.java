package ocp._1.reviewQuestions._7;

/*
    7. What is the result of the following code? (Choose all that apply.)

    A. vanilla
    B. chocolate
    C. strawberry
    D. missing flavor
    E. The code does not compile.
    F. An exception is thrown.

    Result: E. The code does not compile. - cannot use integer with enums in switch statement
*/
public class IceCream {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {

        Flavors f = Flavors.STRAWBERRY;
        switch (f) {
//            case 0:
//                System.out.println("vanilla");
//            case 1:
//                System.out.println("chocolate");
//            case 2:
//                System.out.println("strawberry");
//                break;
//            default:
//                System.out.println("missing flavor");
        }
    }
}