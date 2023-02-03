
public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(2);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(5);
        System.out.println("\n---");
        printRectangle(12, 2);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int zacatek = 1;
        while (zacatek <= number) {
            System.out.print("*");
            zacatek++;
        }
        System.out.println("");

    }

    public static void printSquare(int size) {
        // second part of the exercise
        int zacatek = 1;

        while (zacatek <= size) {
            printStars(size);
            zacatek++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int zacatek = 1;
        while (zacatek <= height) {
            printStars(width);
            zacatek++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int zacatek = 1;
        while (zacatek <= size) {
            printStars(zacatek);
            zacatek++;
        }
    }
}
