
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        int count = this.elements.size();
        String seznam="";
        for (String element: elements
        ) { seznam = seznam + "\n" + element;

        }
        if (this.elements.isEmpty()) {
            return "The collection "+name+" is empty.";
        }
else if (count==1) {
    return "The collection "+name+" has " + count + " element:" + seznam;
        }




       else { count = this.elements.size() ;

            return "The collection "+name+" has " + count + " elements:" + seznam;
       }



    }
    
}
