
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int nejvyssi = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            if (input > nejvyssi) {
                nejvyssi = input;
            }
        }

        System.out.println("The greatest number: " + nejvyssi);

        // implement finding the greatest number in the list here
    }
}
