
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int vetsi1;
        int vetsi2;
        if (number1 > number2) {
            vetsi1 = number1;
        } else {
            vetsi1 = number2;
        }
        if (number2 > number3) {
            vetsi2 = number2;
        } else {
            vetsi2 = number3;
        }
        if (vetsi1 > vetsi2) {
            return vetsi1;
        } else {
            return vetsi2;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
