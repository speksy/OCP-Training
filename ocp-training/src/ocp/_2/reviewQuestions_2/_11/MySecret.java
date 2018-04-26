package ocp._2.reviewQuestions_2._11;
/*
11. Which lambda can replace the MySecret class to return the same value? (Choose all that apply.)
A. caller((e) -> "Poof");
B. caller((e) -> {"Poof"});
C. caller((e) -> { String e = ""; "Poof" });
D. caller((e) -> { String e = ""; return "Poof"; });
E. caller((e) -> { String e = ""; return "Poof" });
F. caller((e) -> { String f = ""; return "Poof"; });

Result: A), F)

// TODO : D) is incorect because "e" is already defined as input parameter.
* */

public class MySecret implements Secret{
    public String magic(double d){
        return "Poof";
    }

    public static void caller(Secret ms){
        ms.magic(5.5);
    }
    public static void main(String[] args) {
        caller((e) -> "Poof");
//        caller((e) -> { String e = ""; "Poof" });
//        caller((e) -> { String e = ""; return "Poof"; });
//        caller((e) -> { String e = ""; return "Poof" });
        caller((e) -> { String f = ""; return "Poof"; });
    }
}
