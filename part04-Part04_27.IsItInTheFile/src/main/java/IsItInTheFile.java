
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean yesno=false;

        try (Scanner fileThere = new Scanner(Paths.get(file))) {
            while (fileThere.hasNextLine()) {
                String obsah = fileThere.nextLine();
                if (obsah.equals(searchedFor)) {
                    yesno = true;
                }
            }
            if (yesno == true) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
