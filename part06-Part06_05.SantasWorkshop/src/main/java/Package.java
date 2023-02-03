import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package () {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int vaha = 0;
        for (Gift darky: gifts
             ) {
            vaha+=darky.getWeight();

        }
        return vaha;
    }
}
