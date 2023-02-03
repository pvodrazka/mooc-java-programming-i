
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pocet = 0;

        while (true) {
            System.out.println("Give a number:");
            int cislo = Integer.valueOf(scanner.nextLine());

            if (cislo < 0) {
                pocet = pocet + 1;
            }
            if (cislo == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: " + pocet);
    }
}

