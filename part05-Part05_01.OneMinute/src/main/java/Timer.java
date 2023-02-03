
public class Timer {

    private int setiny;
    private int sekundy;

    public Timer() {
        this.sekundy =0;
        this.setiny = 0;
    }

    public void advance() {
        this.setiny = this.setiny + 1;

        if (this.setiny >= 100) {
            this.setiny=0;
            this.sekundy++;

        }
        if (this.sekundy==60) {
            this.sekundy=0;
        }
    }


    public String toString() {
        if (this.sekundy < 10 && this.setiny < 10) {
            return "0" + this.sekundy + ":0" + this.setiny;}

        if (this.setiny < 10) {
            return this.sekundy + ":0" + this.setiny;}

        if (this.sekundy < 10) {
            return "0" + this.sekundy + ":" + this.setiny;}

        return this.sekundy + ":" + this.setiny;
    }

}
