
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int mordor=0;
                for (Integer suma : list) {
            mordor = mordor + suma;
                            }
        System.out.println("Sum: " + mordor);


        // toteuta listan lukujen summan laskeminen tänne
    }
}
