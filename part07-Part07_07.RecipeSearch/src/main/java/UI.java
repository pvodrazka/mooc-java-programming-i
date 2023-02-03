import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class UI {
    private Scanner scanner;
    private ArrayList<String> ingredients;
    public ArrayList<Recipe> recepty;

    public UI() {
        this.scanner = new Scanner(System.in);
        this.ingredients = new ArrayList<String>();
        this.recepty = new ArrayList<Recipe>();

    }

    public void start() {
        System.out.println("File to read: ");
        String soubor = String.valueOf(this.scanner.nextLine());
        load(soubor);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");


        while (true) {
            System.out.println("Enter command: ");

            String command = String.valueOf(scanner.nextLine());
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                list();
            }

            if (command.equals("find name")) {
                findName();
            }

            if (command.equals("find cooking time")) {
                findTime();
            }
            if (command.equals("find ingredient")) {
                findIngredient();
            }
        }
    }

    public void load(String file) {
        try {


            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
               /* while (myReader.hasNextLine()) {
                    /*String data = myReader.nextLine();
                    System.out.println(data);
                    Recipe recept = new Recipe;

                                    */

            while (myReader.hasNextLine()) {
                Recipe novy = new Recipe();
                this.recepty.add(novy);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if (data.isEmpty()) {
                        break;
                    } else {
                        novy.add(data);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void list() {
        System.out.println("Recipes:");
        for (int i = 0; i < this.recepty.size(); i++) {
            System.out.print(this.recepty.get(i).getName());
            System.out.print(", cooking time: ");
            System.out.println(this.recepty.get(i).getTime());
        }
    }

    public void findName() {
        System.out.println("Searched word: ");
        String searched = String.valueOf(scanner.nextLine());

        System.out.println("Recipes:");

        for (int i = 0; i < this.recepty.size(); i++) {
            String name = this.recepty.get(i).getName();

            if (name.contains(searched)) {

                System.out.println(this.recepty.get(i).getName() + ", cooking time: " + this.recepty.get(i).getTime());
            }
        }}

        public void findTime() {
            System.out.println("Max cooking time: ");
            int searched = Integer.valueOf(scanner.nextLine());

            System.out.println("Recipes:");

            for (int i = 0; i < this.recepty.size(); i++) {
                String name = this.recepty.get(i).getTime();
 int time = Integer.valueOf(name);
                if (time<=searched) {

                    System.out.println(this.recepty.get(i).getName() + ", cooking time: " + this.recepty.get(i).getTime());
                }
            }}

            public void findIngredient() {
                System.out.println("Ingredient: ");
                String searched = String.valueOf(scanner.nextLine());

                System.out.println("Recipes:");

                for (int i = 0; i < this.recepty.size(); i++) {
                    this.ingredients = this.recepty.get(i).getIngredient();

                    if (this.ingredients.contains(searched)) {

                        System.out.println(this.recepty.get(i).getName() + ", cooking time: " + this.recepty.get(i).getTime());
                    }
                }
    }

}

