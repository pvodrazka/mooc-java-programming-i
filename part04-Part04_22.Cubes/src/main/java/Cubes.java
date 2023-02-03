
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int nasobic = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;

            }
            nasobic = Integer.valueOf(input);
            nasobic = nasobic * nasobic * nasobic;
            System.out.println(nasobic);

        }

    }
}