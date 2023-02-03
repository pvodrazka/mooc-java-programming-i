public class Container {
    private int howmuch = 0;

    public Container() {
        this.howmuch = howmuch;
    }

    public int contains() {
        return this.howmuch;
    }


    public void add(int amount) {
        if (amount > 0) {
            this.howmuch += amount;
            if (this.howmuch > 100) {
                this.howmuch = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.howmuch = this.howmuch - amount;
            if (this.howmuch < 0) {
                this.howmuch = 0;
            }
        }
    }

    public String toString() {
        return this.howmuch+ "/100";
    }

    public void setHowmuch(int howmuch) {
        this.howmuch = howmuch;
    }
}



