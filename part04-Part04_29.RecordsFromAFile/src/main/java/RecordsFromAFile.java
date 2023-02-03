
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                String age = parts[1];

                if (age.equals("1")) {
                    System.out.println(name + ", age: " + "1 year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
