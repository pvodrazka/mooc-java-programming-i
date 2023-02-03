
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prvni = 0;
        String jmeno="s";
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String pole[] = text.split(",");
            int a = Integer.valueOf(pole[1]);
            if (a > prvni) {
                prvni=a;
                jmeno = pole[0];
            }
        }
        System.out.println("Name of the oldest: " + jmeno);


    }


}

