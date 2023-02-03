import java.util.Scanner;

public class TextUI {
    private Scanner skenr;
    private SimpleDictionary slovnik;

    public TextUI(Scanner skenr, SimpleDictionary slovnik) {
        this.skenr = skenr;
        this.slovnik = slovnik;
    }

    public void start() {

        String input="blbl";
      /*  if (input.equals("end")) {
            System.out.println("Bye bye!");
        }
        else {
            System.out.println("Unknown command");
            start(); */

        while (true) {

            System.out.println("Command:");

            input = String.valueOf(skenr.nextLine());
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            else if (input.equals("add")) {
                System.out.println("Word:");
                String word = String.valueOf(skenr.nextLine());
                System.out.println("Translation:");
                String translation =String.valueOf(skenr.nextLine());
               this.slovnik.add(word, translation);
               continue;
            }

            else if (input.equals("search")) {
                System.out.println("To be translated:");
                String preklad = String.valueOf(skenr.nextLine());
                if (this.slovnik.translate(preklad)==null){
                    System.out.println("Word " +preklad+ " was not found");
                    continue;
                }
                System.out.println(this.slovnik.translate(preklad));
                continue;
            }
            System.out.println("Unkown command");
        }
    }
}
