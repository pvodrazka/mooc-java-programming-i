import java.util.ArrayList;

public class PassPercentage {
    private double count;
    private double passed;


    private ArrayList<Integer> seznam;


    public PassPercentage(ArrayList<Integer> seznam2) {
        this.seznam = seznam2;


    }

    public void passPercentage() {
        for (int i = 0; i < this.seznam.size(); i++) {

            this.count += 1;
            if (this.seznam.get(i) >= 50) {

                this.passed += 1;
            }

        }
        double percentage= (100*this.passed)/this.count;
        System.out.println("Pass percentage: " + percentage);

    }
}