import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String knizka = scanner.nextLine();
            if (knizka.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            String stran = scanner.nextLine();
            if (stran.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            String roky = scanner.nextLine();
            if (roky.isEmpty()) {
                break;
            }

            list.add(new Book(knizka,stran,roky));


        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getEverything());
            }
        }
        if (input.equals("name")) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getBook());
            }
        }
    }
}
