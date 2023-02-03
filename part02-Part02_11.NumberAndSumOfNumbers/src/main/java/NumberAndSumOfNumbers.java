
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int pocet = 0;

        while (true) {
            System.out.println("Give a number:");
            int cislo = Integer.valueOf(scanner.nextLine());
            if (cislo != 0) {
                sum = sum + cislo;
                pocet = pocet + 1;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: " + pocet);
        System.out.println("Sum of the numbers: " + sum);
    }
}