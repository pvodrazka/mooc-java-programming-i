
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        int zacatek = 1;
        while (zacatek <= number) {
            System.out.print("*");
            zacatek++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int zacatek = 1;
        while (zacatek <= number) {
            System.out.print(" ");
            zacatek++;
        }

    }


    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (i <= size) {
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }


    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(i + (i - 1));
            i++;
        }
        for (i = 1; i <= 3; i++) {
            printSpaces(height - 2);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        // printStars(5);
        //  printSpaces(5);
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
