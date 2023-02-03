
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prvni = 0;
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String pole [] = text.split(",");
                    int a=Integer.valueOf(pole[1]);
            if (a>prvni) {
                prvni=a;
            }
        }
        System.out.println("Age of the oldest: "+prvni);


    }
}
