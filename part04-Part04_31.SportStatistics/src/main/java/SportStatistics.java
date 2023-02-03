

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;
        //ArrayList<> tymy = new ArrayList<>();
        try (Scanner ctecka = new Scanner(Paths.get(file))) {
            while (ctecka.hasNextLine()) {
                String line = ctecka.nextLine();
                String[] casti = line.split(",");
                String domaci = casti[0];
                String hoste = casti[1];
                int bodydomaci = Integer.valueOf(casti[2]);
                int bodyhoste = Integer.valueOf(casti[3]);

                if (domaci.equals(team) || hoste.equals(team)) {
                    games++;

                    if (domaci.equals(team) && bodydomaci > bodyhoste) {
                        wins++;
                    } else if (domaci.equals(team) && bodydomaci < bodyhoste) {
                        losses++;
                    }

                    if (hoste.equals(team) && bodydomaci < bodyhoste) {
                        wins++;
                    } else if (hoste.equals(team) && bodydomaci > bodyhoste) {
                        losses++;
                    }
                }


            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
