import java.util.ArrayList;

public class Hold {
    private int maximumWeight = 0;
    private ArrayList<Suitcase> seznamek;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.seznamek = new ArrayList<>();
    }

    private int actualWeight = 0;

    public void addSuitcase(Suitcase suitcase) {
        if (actualWeight + suitcase.totalWeight() <= maximumWeight) {
            this.seznamek.add(suitcase);
            actualWeight += suitcase.totalWeight();

        }


    }

    public String toString() {
        return this.seznamek.size() + " suitcases (" + actualWeight + " kg)";
    }

    public void printItems() {
        Suitcase printed = new Suitcase(0);
        for (int i = 0; i < this.seznamek.size(); i++) {
            printed = this.seznamek.get(i);
            printed.printItems();

        }
    }
}
