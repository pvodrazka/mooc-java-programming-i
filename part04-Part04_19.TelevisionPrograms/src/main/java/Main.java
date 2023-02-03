import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String program = scanner.nextLine();
            if (program.isEmpty()) {
                break;}
            System.out.println("Duration:");
            int delka = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(program, delka));

            }
        System.out.println("Program's maximum duration?");
        int maxdelka = Integer.valueOf(scanner.nextLine());

        for (int i=0; i < programs.size();i++){
            if (programs.get(i).getDuration() <= maxdelka) {
                System.out.println(programs.get(i));

        }
    }


    }
}
