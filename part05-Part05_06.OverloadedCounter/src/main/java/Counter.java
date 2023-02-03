public class Counter {
    private int number;

    public Counter (int startValue) {
        this.number = startValue;
    }

    public Counter () {
        this(0);
    }

    public int value() {
        return this.number;
    }
    public void increase(int increaseBy) //increases the value of the counter by the value of increaseBy.
    // If the value of increaseBy is negative, the value of the counter does not change.
    {if (increaseBy >= 0) {this.number = this.number + increaseBy;}}

    public void decrease(int decreaseBy) //decreases the value of the counter by the value of decreaseBy.
    // If the value of decreaseBy is negative, the value of the counter does not change.
    {if (decreaseBy >= 0) {this.number = this.number - decreaseBy;}}

    public void increase() {
        this.number++;
    }
    public void decrease() {
    this.number--;}
}
