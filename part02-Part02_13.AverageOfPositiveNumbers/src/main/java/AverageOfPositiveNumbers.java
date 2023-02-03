
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        double sumPosit = 0;
        double pocetPosit = 0;

        while (true) {
            int cislo = Integer.valueOf(scanner.nextLine());

            if (cislo > 0) {
                sumPosit = sumPosit + cislo;
                pocetPosit = pocetPosit + 1;
            } else if (cislo == 0) {
                break;
            }
        }
        if (pocetPosit == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = sumPosit / pocetPosit;
            System.out.println(avg);
        }
    }
}