import java.util.ArrayList;


public class PassedAverage {


    private ArrayList<Integer> seznam;
    private int count;
    private int points;


    public PassedAverage(ArrayList<Integer> seznam2) {
        this.seznam = seznam2;


    }

    public void passedAverage() {

        this.count = 0;
        this.points = 0;

        for (int i = 0; i < this.seznam.size(); i++) {
            if (this.seznam.get(i) >= 50) {
                points+=this.seznam.get(i);
                count += 1;
            }

        }
        if (count == 0) {
            System.out.println("-");
        }
        double average = points / count;


        System.out.println("Point average (passing): " + average);

    }

    public int getCount() {
        return this.count;
    }

    public int getPoints() {
        return this.points;
    }
}


