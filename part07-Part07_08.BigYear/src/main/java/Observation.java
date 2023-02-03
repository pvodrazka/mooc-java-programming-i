import java.util.ArrayList;

public class Observation {
    private ArrayList<String> observation;

    public Observation () {
        this.observation= new ArrayList<String>();
    }

    public void add (String ptak) {
        this.observation.add(ptak);
    }
}
