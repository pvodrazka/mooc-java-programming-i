import java.util.ArrayList;

public class Grades {
    private int nula;
    private int jedna;
    private int dva;
    private int tri;
    private int ctyri;
    private int pet;


    private ArrayList<Integer> seznam;


    public Grades(ArrayList<Integer> seznam2) {
        this.seznam = seznam2;


    }

    public void Grades() {
        for (int i = 0; i < this.seznam.size(); i++) {

            if (this.seznam.get(i) < 50) {
                this.nula += 1;
            }

            if (this.seznam.get(i) >= 50 &&this.seznam.get(i) <=59){
                this.jedna += 1;
            }

            if (this.seznam.get(i) >= 60 &&this.seznam.get(i) <=69){
                this.dva += 1;
            }

            if (this.seznam.get(i) >= 70 &&this.seznam.get(i) <=79){
                this.tri += 1;
            }

            if (this.seznam.get(i) >= 80 &&this.seznam.get(i) <=89){
                this.ctyri += 1;
            }

            if (this.seznam.get(i) >= 90) {
                this.pet += 1;
            }

        }
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        for (int i=0; i< this.pet; i++) {
            System.out.print("*");
                    }
        System.out.println();
        System.out.print("4: ");
        for (int i=0; i< this.ctyri; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("3: ");
        for (int i=0; i< this.tri; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("2: ");
        for (int i=0; i< this.dva; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("1: ");
        for (int i=0; i< this.jedna; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("0: ");
        for (int i=0; i< this.nula; i++) {
            System.out.print("*");
        }
    }
}
