
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        System.out.println("Enter password:");
        String pass = scanner.nextLine();
        boolean success = false;
        if (user.equals("alex") && pass.equals("sunshine")) {
            success = true;
        } else if (user.equals("emma") && pass.equals("haskell")) {
            success = true;
        }

        if (success == true) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
