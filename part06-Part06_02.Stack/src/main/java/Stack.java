import java.util.ArrayList;

public class Stack {

    private ArrayList<String> seznam;

    public Stack() {
        this.seznam = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.seznam.isEmpty()) {
            return true;
        }
        else return false;
    }

    public void add(String value) {
        this.seznam.add(value);
    }

    public ArrayList<String> values() {
        return this.seznam;
    }

    public String take() {
       int i = this.seznam.size()-1;
       String temp=this.seznam.get(i);
        this.seznam.remove(i);
        return temp;

    }



}
