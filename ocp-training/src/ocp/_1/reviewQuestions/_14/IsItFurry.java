package ocp._1.reviewQuestions._14;
/*
    14. Which is a true statement about the following code? (Choose all that apply.)

    A. The code compiles, and the output is 0.
    B. The code compiles, and the output is 3.
    C. The code compiles, and the output is 7.
    D. c instanceof Chipmunk does not compile.
    E. l instanceof Chipmunk does not compile.
    F. r instanceof Chipmunk does not compile.

    Result:
        E. l instanceof Chipmunk does not compile.


        r instanceof Chipmunk compile because Runnable is interface
* */
import java.util.*;

public class IsItFurry {
    static class Chipmunk{}
    public static void main(String args[]) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();
        int result = 0;
        if (c instanceof Chipmunk) result += 1;
//        if (l instanceof Chipmunk) result += 2; //Does not compile because ArrayList does not extend Chipmunk
        if (r instanceof Chipmunk) result += 4;
        System.out.println(result);
    }
}
