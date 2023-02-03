
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers:");
        int cislo = 0;
        int pocet = 0;
        int sum = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        int zustatek = 0;

        while (true) {
            cislo = Integer.valueOf(scanner.nextLine());
            if (cislo == -1) {
                break;
            } else {
                pocet += 1;
                sum += cislo;
                if (cislo % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
            }
        }
        avg = (1.0 * sum) / pocet;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + pocet);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);
    }
}

