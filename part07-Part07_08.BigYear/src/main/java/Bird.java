public class Bird {
    private String name;
    private String latin;
    private int observation;

    public Bird (String name, String latin) {
        this.name=name;
        this.latin=latin;
this.observation=0;
    }
public String getName() {
        return this.name;
}

    public void addObservation () {
        this.observation++;
    }

    public void printBirdandObs() {
        System.out.println(this.name + " (" + this.latin + "): " + this.observation + " observations");
    }

    public void printOne() {
        System.out.println(this.name + " (" + this.latin + "): " + this.observation + " observations");
    }
}
