import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> seznam;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.seznam = new ArrayList<>();
    }

    private int numberOfItems = 0;


    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            this.seznam.add(item);

            numberOfItems += 1;
        }
    }

    public String toString() {
        if (this.seznam.size() == 0) {
            return "no items (0 kg)";
        }

        if (this.seznam.size() == 1) {
            return this.seznam.size() + " item (" + totalWeight() + "kg)";
        }
        return this.seznam.size() + " items (" + totalWeight() + "kg)";
    }

    public void printItems() {
        for (int i = 0; i < this.seznam.size(); i++) {
            System.out.println(this.seznam.get(i));
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (int i=0; i < seznam.size(); i++)    {
          totalWeight+=this.seznam.get(i).getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem () {
        if (this.seznam.isEmpty()) {
            return null;
        }
        Item returnItem = new Item("vole", 0);
        int nejvyssi=0;

        for (int i=0; i< this.seznam.size(); i++) {
         if (this.seznam.get(i).getWeight() > nejvyssi)  {
             nejvyssi=this.seznam.get(i).getWeight();
             returnItem=this.seznam.get(i);
         }
        }
        return returnItem;
    }
}

