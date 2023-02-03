
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int vstup = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int vystup = Integer.valueOf(scanner.nextLine());

        int konec = 0;

        for (int i = vstup; i <= vystup; i++) {
            konec += i;
        }
        System.out.println("The sum is " + konec);

    }
}
