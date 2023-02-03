
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int promenna = Integer.valueOf(scanner.nextLine());
            if (promenna < 0) {
                System.out.println("Unsuitable number");
            } else if (promenna > 0) {
                System.out.println(promenna * promenna);
            } else {
                break;
            }
        }

    }
}

