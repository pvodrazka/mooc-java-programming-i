
//import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int vstup = Integer.valueOf(scanner.nextLine());
        int vystup = 0;
        for (int i = 0; i <= vstup; i++) {
            vystup += i;
        }
        System.out.println("The sum is " + vystup);
    }
}
