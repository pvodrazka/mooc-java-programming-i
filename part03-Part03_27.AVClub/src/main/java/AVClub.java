
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] pole = text.split(" ");
            for (int i = 0; i < pole.length; i++) {
                if (pole[i].contains("av")) {
                    System.out.println(pole[i]);
                }
            }
        }

    }
}
