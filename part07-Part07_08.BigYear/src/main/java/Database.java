import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> database;

    public Database() {
        this.database = new ArrayList<Bird>();
    }

    public void add (Bird bird) {
        this.database.add(bird);
    }

    public int getSize () {
        return this.database.size();
    }

    public boolean birdThere (String bird) {
        boolean anone =false;
        for (int i=0; i < this.database.size(); i++) {
            if (this.database.get(i).getName().equals(bird)) {
                anone = true;
            }
        }
        return anone;
    }

    public void addObservation (String bird) {
        int index=0;
        for (int i=0; i < this.database.size(); i++) {
            if (this.database.get(i).getName().equals(bird)) {
                index=i;
            }
        }
        this.database.get(index).addObservation();
    }

    public void getAll() {
        for (int i=0; i < this.database.size(); i++) {
            this.database.get(i).printBirdandObs();
        }}

        public void getOne(String bird) {
                int index=0;
                for (int i=0; i < this.database.size(); i++) {
                    if (this.database.get(i).getName().equals(bird)) {
                        index=i;
                    }
                }
                this.database.get(index).printOne();
            }
            }


