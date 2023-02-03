
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String pole [] = text.split(" ");
            int a = 0;
            System.out.println(pole[a]);
            a++;

            }
        }


    }

