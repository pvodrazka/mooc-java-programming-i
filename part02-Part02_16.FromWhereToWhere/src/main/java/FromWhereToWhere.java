
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Where to?");
        int jedna = Integer.valueOf(scanner.nextLine());
        /* for (int i = 1; i <= jedna; i++) {
            System.out.println(i);
        } */
        System.out.println("Where from?");
        int dva = Integer.valueOf(scanner.nextLine());
        while (dva <= jedna) {
            System.out.println(dva);
            dva++;
        }
    }
}
