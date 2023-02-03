import java.util.Scanner;

public class UserInterface {
    private TodoList seznam;
    private Scanner scanner;

    public UserInterface(TodoList seznam, Scanner scanner) {
        this.seznam = seznam;
        this.scanner = scanner;

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        }

        if (command.equals("list")) {
            list();
        }
        if (command.equals("remove")) {
            remove();
        }
    }

    public void add() {
        System.out.println("To add:");
        String pridat = String.valueOf(scanner.nextLine());
        this.seznam.add(pridat);
    }

    public void list() {
        this.seznam.print();

    }

    public void remove() {
        System.out.println("To remove:");
        int smazat = Integer.valueOf(scanner.nextLine());
        this.seznam.remove(smazat);
    }


    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = String.valueOf(scanner.nextLine());
            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
        }


    }
}
