import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statistics_even = new Statistics();
        Statistics statistics_odd = new Statistics();

        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numero = Integer.valueOf(scanner.nextLine());
            if (numero == -1) {
                break;
            } else if (numero%2 == 0) {
                statistics.addNumber(numero);
                statistics_even.addNumber(numero);
            }
            else {
                statistics.addNumber(numero);
                statistics_odd.addNumber(numero);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics_even.sum());
        System.out.println("Sum of odd numbers: " + statistics_odd.sum());


            /*statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    } */
    }
}
