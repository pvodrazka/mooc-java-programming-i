import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Container kontys1;
    private Container kontys2;
    private Scanner scanner;

    public UserInterface() {
        this.kontys1 = new Container();
        this.kontys2 = new Container();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.kontys1);
            System.out.println("Second: " + this.kontys2);
            String input = this.scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);


            if (input.equals("add")) {
                this.kontys1.add(amount);
            }
            if (input.equals("move") && amount>0) {
                int first = this.kontys1.contains();
                int second = this.kontys2.contains();

                if (amount > first) {
                    amount = first;
                }

                first = first - amount;
                second = second + amount;

                if (second > 100) {
                    second = 100;
                }
                this.kontys1.setHowmuch(first);
                this.kontys2.setHowmuch(second);



            }

            if (input.equals("remove")) {
                this.kontys2.remove(amount);
            }

        }
    }
}
