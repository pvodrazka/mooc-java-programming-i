
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");

            String ident = String.valueOf(scanner.nextLine());
            if (ident.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());
            boolean anone = false;
            if (name.isEmpty()) {
                break;

            }
            for (int i = 0; i < items.size(); i++) {
                if (ident.equals(items.get(i).getIdentifier())) {
                    anone = true;
                    continue;
                }

            }

            if (!anone) {
            Item polozka = new Item(ident, name);
            items.add(polozka);}
        }
        System.out.println("==Items==");
        for (int i = 0; i < items.size(); i++) {

            System.out.println(items.get(i));
        }


    }
}
