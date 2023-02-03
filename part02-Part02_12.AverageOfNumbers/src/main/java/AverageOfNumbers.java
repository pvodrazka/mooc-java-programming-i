
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double prumer = 0;
        double sum = 0;
        double pocet = 0;

        while (true) {
            System.out.println("Give a number:");
            int cislo = Integer.valueOf(scanner.nextLine());
            if (cislo != 0) {
                pocet = pocet + 1;
                sum = sum + cislo;
            } else {
                break;
            }
        }
        prumer = sum / pocet;
        System.out.println("Average of the numbers: " + prumer);
    }
}