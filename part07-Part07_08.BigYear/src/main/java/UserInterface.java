import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private String searched;
    private Database databaze;
    private Observation observation;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.databaze = new Database();
        this.observation = new Observation();
    }

    public void start() {

        while (true) {

            System.out.println("?");
            this.searched = String.valueOf(this.scanner.nextLine());

            if (searched.equals("Quit")) {
                break;
            } else if (searched.equals("Add")) {
                System.out.println("Name:");
                String name = String.valueOf(this.scanner.nextLine());
                System.out.println("Name in Latin");
                String latin = String.valueOf(this.scanner.nextLine());

                Bird ptak = new Bird(name, latin);
                this.databaze.add(ptak);
            } else if (searched.equals("Observation")) {
                System.out.println("Bird?");
                String ptak = String.valueOf(this.scanner.nextLine());
                if (!this.databaze.birdThere(ptak)) {
                    System.out.println("Not a bird!");

                } else if (this.databaze.birdThere(ptak)) {
                    this.databaze.addObservation(ptak);
                }
            } else if (searched.equals("All")) {
this.databaze.getAll();
            }

            else if (searched.equals("One")) {
                System.out.println("Bird?");
                String ptak = String.valueOf(this.scanner.nextLine());
                if (!this.databaze.birdThere(ptak)) {
                    System.out.println("Not a bird!");

                } else if (this.databaze.birdThere(ptak)) {
                    this.databaze.getOne(ptak);
                }
            }


        }
    }
}


