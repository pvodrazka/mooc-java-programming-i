
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int delka = 0;
        String jmeno = "";
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String pole[] = text.split(",");
            int a = Integer.valueOf(pole[1]);
            int b = pole[0].length();
            if (b > delka) {
                delka=b;
                jmeno = pole[0];
            }
            sum = sum + a;
            count++;
        }

        System.out.println("Longest name: " + jmeno);
        System.out.println("Average of the birth years: " + (1.0 * sum) / count);


    }
}
