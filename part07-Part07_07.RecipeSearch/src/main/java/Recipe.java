import java.util.ArrayList;

public class Recipe {
    private ArrayList<String> seznam;
    private ArrayList<String> ingredlist;

public Recipe () {
    this.seznam=new ArrayList<String>();
    this.ingredlist=new ArrayList<String>();
}

public void add(String string) {
    this.seznam.add(string);
}

public String getName () {
    return this.seznam.get(0);
}

    public String getTime () {
        return this.seznam.get(1);
    }

    public ArrayList<String> getIngredient () {
     String ingredient=".";
    for (int i=2; i<this.seznam.size(); i++) {
        this.ingredlist.add(this.seznam.get(i));
    }
     return this.ingredlist;
    }


}
