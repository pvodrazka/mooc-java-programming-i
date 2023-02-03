
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        int nejnizsi = 9998;
        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i == 9999) {
                break;
            } else if (i < nejnizsi) {
                nejnizsi = i;
            }
            list.add(i);
        }

        System.out.println("Smallest number: " + nejnizsi);

        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i);
            if (j == nejnizsi) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
