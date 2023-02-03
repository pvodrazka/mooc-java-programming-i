
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        else return false;
    }

    public int priceDifference(Apartment compared) {
        int difference = (this.princePerSquare*this.squares) - (compared.princePerSquare * compared.squares);
        if (difference < 0) {
            return difference* -1;
        }
        else return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.princePerSquare*this.squares) > (compared.princePerSquare * compared.squares)){
            return true;
        }
        else return false;
            }



}
