import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = 9999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {

        // write your code here
        int smallest = 9999999;
        int smallestIndex=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex=i;
            }

        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = 9999999;
        int smallestIndex=0;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex=i;
            }

        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp=0;
        temp=array[index1];
        array[index1] = array[index2];
        array[index2]= temp;
    }

    public static void sort (int[] tabulka) {

        for (int i=0; i<tabulka.length;i++) {
           int nejmensi= indexOfSmallestFrom(tabulka, i);
           swap(tabulka, i, nejmensi);
            System.out.println(Arrays.toString(tabulka));

        }


        }


    }

