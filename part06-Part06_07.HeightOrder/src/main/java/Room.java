import java.util.ArrayList;

public class Room {
    private ArrayList<Person> seznam;

    public Room() {
        this.seznam = new ArrayList<>();
    }

    public void add(Person person) {
        this.seznam.add(person);
    }

    public boolean isEmpty() {
        if (this.seznam.isEmpty()) {
            return true;
        } else return false;
    }

    public ArrayList<Person> getPersons() {

        return this.seznam;

    }

    public Person shortest() {

        if (this.seznam.isEmpty()) {
            return null;
        }
        Person returnObject = new Person("prdel", 7);
        returnObject = this.seznam.get(0);
        for (int i = 0; i < this.seznam.size(); i++) {

            if (this.seznam.get(i).getHeight() < returnObject.getHeight()) {
                returnObject = this.seznam.get(i);
            }
        }
        return returnObject;
    }

    public Person take() {
        if (this.seznam.isEmpty()) {
            return null;
        }
        int indexMazat = 0;
        Person returnObject2 = new Person("prdel", 999);
        for (int i = 0; i < this.seznam.size(); i++) {

            if (this.seznam.get(i).getHeight() < returnObject2.getHeight()) {
                returnObject2 = this.seznam.get(i);
                indexMazat = i;
            }
        }
        this.seznam.remove(indexMazat);
        return returnObject2;


    }
}
