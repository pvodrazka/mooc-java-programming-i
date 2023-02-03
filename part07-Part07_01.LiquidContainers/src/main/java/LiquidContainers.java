
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        final int lowerbound = 0;
        final int upperbound = 100;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            if (input.contains("add")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (first + amount > 100) {
                    first = 100;
                } else if (amount < 0) {
                    continue;
                } else {
                    first = first + amount;
                }

            }

            if (input.startsWith("move")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount >= upperbound) {
                    second = upperbound;
                    first = 0;
                } else if (amount < 0) {
                    continue;
                } else if (amount < upperbound && first >= amount && second + amount <= upperbound) {
                    first -= amount;
                    second += amount;
                } else if (amount < upperbound && first > amount && second + amount > upperbound) {
                    first -= amount;
                    second = 100;
                } else if (amount < upperbound && first < amount && second + amount > upperbound) {
                    first = 0;
                    second = 100;
                } else if (amount < upperbound && first <= amount && second + amount < upperbound && first-amount <= lowerbound) {

                    second = second+ first;
                    first = 0;
                }
                else if (amount < upperbound && first < amount && second + amount < upperbound && first-amount > lowerbound) {

                    first -= amount;
                    second+=amount;

                }


            }
            if (input.startsWith("remove")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                if (amount < 0) {
                    continue;
                } else if (amount > second) {
                    second = 0;
                } else if (amount < second) {
                    second -= amount;
                }

            }
        }

    }
}
