public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = count;
        this.sum = sum;

    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum = this.sum + number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if (this.count == 0) {
            return 0.0;}
        else {
        return (this.sum * 1.0) / this.count;}
    }
}
